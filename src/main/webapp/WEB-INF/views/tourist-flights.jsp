<%@ taglib prefix="for" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Damian
  Date: 08.03.2020
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tourist flights</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h1 id="title">Your flights</h1>
<table>
    <tr>
        <td>Arrival date</td>
        <td>Departure date</td>
        <td>Seats count</td>
        <td>Ticket price</td>
        <td>Actions</td>
    </tr>
</table>

<h1 id="title">All flights</h1>
<table>
    <tr>
        <td>Arrival date</td>
        <td>Departure date</td>
        <td>Seats count</td>
        <td>Ticket price</td>
        <td>Actions</td>
    </tr>
    <for:forEach items="${allFlights}" var="flight" varStatus="i">
        <tr>
            <td>${flight.arrivalDate}</td>
            <td>${flight.departureDate}</td>
            <td>${flight.seatsCount}</td>
            <td>${flight.ticketPrice}</td>
            <td><a href="/flights/addToTourist?flightId=${flight.id}&touristId=${touristId}">Add</a></td>
        </tr>
    </for:forEach>
</table>
</body>
</html>
