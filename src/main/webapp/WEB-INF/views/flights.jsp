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
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<button><a href="/flights/add">Dodaj lot</a></button>
<for:forEach items="${flights}" var="flight" varStatus="i">
    ${flight.id}
    ${flight.seatsCount}
    <a href="/flights/delete?id=${flight.id}">Usuń</a>
</for:forEach>

<jsp:include page="footer.jsp"/>
</body>
</html>
