<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Damian
  Date: 08.03.2020
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add flight</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h2 id="title">Adding flight</h2>
<div class="form">
<form:form modelAttribute="flight">
    <form:label path="seatsCount">Seats Count</form:label>
    <form:input type="number" path="seatsCount" placeholder="Seats Count"/> <br/>
    <form:label path="ticketPrice">Ticket Price</form:label>
    <form:input type="number" path="ticketPrice" placeholder="Ticket Price"/> <br/>
    <form:label path="arrivalDate">Arrival date</form:label>
    <form:input type="date" path="arrivalDate"/><br/>
    <form:label path="dapartureDate">Departure date</form:label>
    <form:input type="date" path="departureDate"/><br/>
    <button type="reset">Clear</button>
    <button type="submit">Submit</button>
</form:form>
</div>
</body>
</html>
