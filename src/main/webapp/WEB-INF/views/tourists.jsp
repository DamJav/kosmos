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
    <title>Tourists</title>
</head>
<body>
<jsp:include page="header.jsp"/>

<button class="block"><a href="/tourists/add"><h2>Add tourist</h2></a></button>
<h1 id="title">Tourist list</h1>
<table>
    <tr>
        <td>Name</td>
        <td>Surname</td>
        <td>Country</td>
        <td>Date of Birth</td>
        <td>Actions
        </td>
    </tr>
<for:forEach items="${tourists}" var="tourist" varStatus="i">
    <tr>
        <td>${tourist.name}</td>
        <td>${tourist.surName}</td>
        <td>${tourist.country}</td>
        <td>${tourist.dateOfBirth}</td>
        <td><a href="/tourists/delete?id=${tourist.id}">Delete</a></td>
        <td><a href="/tourists/edit?id=${tourist.id}">Edit</a></td>
    </tr>
</for:forEach>
</table>
</body>
</html>
