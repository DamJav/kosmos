<%@ taglib prefix="for" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Damian
  Date: 09.03.2020
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Flights to book</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h1 id="title">Flights list</h1>
<table>
    <tr>
        <td>Arrival date</td>
        <td>Departure date</td>
        <td>Seats count</td>
        <td>Ticket price</td>
        <td>Actions</td>
    </tr>
    <for:forEach items="${flightsToBook}" var="flight" varStatus="i">
        <tr>
            <td>${flight.arrivalDate}</td>
            <td>${flight.departureDate}</td>
            <td>${flight.seatsCount}</td>
            <td>${flight.ticketPrice}</td>
            <td><a href="#">Book</a></td>
        </tr>
    </for:forEach>
</table>
</body>
</html>
