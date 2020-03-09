<%@ taglib prefix="for" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Damian
  Date: 07.03.2020
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Flights</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<button class="block"><a href="/flights/add"><h2>Add flight</h2></a></button>
<h1 id="title">Flights list</h1>
<table>
    <tr>
        <td>Arrival date</td>
        <td>Departure date</td>
        <td>Seats count</td>
        <td>Ticket price</td>
        <td>Actions</td>
    </tr>
    <for:forEach items="${flights}" var="flight" varStatus="i">
        <tr>
            <td>${flight.arrivalDate}</td>
            <td>${flight.departureDate}</td>
            <td>${flight.seatsCount}</td>
            <td>${flight.ticketPrice}</td>
            <td><a href="/flights/delete?id=${flight.id}">Delete</a></td>
            <td><a href="/flights/edit?id=${flight.id}">Edit</a></td>
        </tr>
    </for:forEach>
</table>
</body>
</html>
