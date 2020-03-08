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
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="flight">
    <form:label path="seatsCount">Seats Count</form:label>
    <form:input type="number" path="seatsCount" placeholder="Seats Count"/> <br/>
    <form:label path="ticketPrice">Ticket Price</form:label>
    <form:input type="number" path="ticketPrice" placeholder="Ticket Price"/> <br/>
    <button type="reset">Clear</button>
    <button type="submit">Submit</button>

</form:form>
</body>
</html>
