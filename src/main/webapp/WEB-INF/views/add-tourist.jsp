<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Damian
  Date: 08.03.2020
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add tourist</title>
</head>
<body>
<form:form modelAttribute="tourist">
    <form:label path="name" >Name</form:label>
    <form:input path="name" placeholder="Name"/>
</form:form>
</body>
</html>
