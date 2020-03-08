<%@ taglib prefix="for" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Damian
  Date: 07.03.2020
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<button><a href="/tourists/add">Dodaj turyste</a></button>
<for:forEach items="${tourists}" var="tourist" varStatus="i">
    ${tourist.name}
    <a href="/tourists/delete?id=${tourist.id}">Usuń</a>
    <a href="/tourists/${tourist.id}">Usuń</a>
</for:forEach>

<jsp:include page="footer.jsp"/>
</body>
</html>
