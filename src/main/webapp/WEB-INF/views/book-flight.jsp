<%--
  Created by IntelliJ IDEA.
  User: Damian
  Date: 09.03.2020
  Time: 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book flight</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<h2 id="title">Flight booking</h2>
<div class="form">
    <form method="post">
        <label>Arrival date </label>
        <input type="date" name="arrivalDate"><br/>
        <label>Max ticket cost</label>
        <input type="number" name="ticketCost"><br/>
        <button type="reset">Clear</button>
        <input type="submit" value="Find">
    </form>
</div>
</body>
</html>
