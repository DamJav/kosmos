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
<for:forEach items="${flightsToBook}" var="flight" varStatus="i">
    <tr>
        <td>${flight.arrivalDate}</td>
        <td>${flight.departureDate}</td>
        <td>${flight.seatsCount}</td>
        <td>${flight.ticketPrice}</td>
        <td><a href="/#">Book</a></td>
    </tr>
</for:forEach>
</body>
</html>
