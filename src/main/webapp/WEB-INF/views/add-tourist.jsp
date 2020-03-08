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
    <form:input path="name" placeholder="Name"/> <br/>
    <form:label path="surName" >Surame</form:label>
    <form:input path="surName" placeholder="Surname"/><br/>
    <form:label path="country" >Surame</form:label>
    <form:input path="country" placeholder="Your Country"/><br/>
    <form:label path="sex" >Sex</form:label>
    <form:radiobutton path="sex" itemValue="Male"/>
    Male
    <form:radiobutton path="sex" itemValue="Female"/>
    Female<br/>
    <form:label path="dateOfBirth">Date of birth</form:label>
    <form:input path="dateOfBirth" placeholder="YYYY-MM-DD"/><br/>
    <form:label path="notes">Notes</form:label>
    <form:textarea placeholder ="Notes" path="notes" required="true"></form:textarea><br/>
    <button type="reset">Clear</button>
    <button type="submit">Submit</button>

</form:form>
</body>
</html>
