<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
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
<jsp:include page="header.jsp"/>
<h2 id="title">Adding tourist</h2>
<div class="form">
<form:form modelAttribute="tourist">
    <form:label path="name" >Name</form:label>
    <form:input path="name" placeholder="Name"/> <br/>
    <form:label path="surName" >Surame</form:label>
    <form:input path="surName" placeholder="Surname"/><br/>
    <form:label path="country" >Country</form:label>
    <form:input path="country" placeholder="Your Country"/><br/>
    <form:label path="sex" >Sex</form:label>
    <form:radiobutton value="Male" path="sex"/>
    Male
    <form:radiobutton value="Female" path="sex"/>
    Female<br/>
    <form:label path="dateOfBirth">Date of birth</form:label>
    <form:input type="date" path="dateOfBirth"/><br/>
    <form:label path="notes">Notes</form:label>
    <form:textarea placeholder ="Notes" path="notes" ></form:textarea><br/>
    <button type="reset" class="formButton">Clear</button>
    <button type="submit" class="formButton">Submit</button>
</form:form>
</div>
</body>
</html>
