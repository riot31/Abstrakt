<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring 4 MVC - Hello World Example | BORAJI.COM</title>
</head>
<body>
<h2>${message}</h2>
<p>
    <spring:message code="error_uncaughtexception_problemdescription" />
</p>
<h4>Server date time is : ${date} </h4>
<span>
    ${exception.stackTrace}
</span>
</body>
</html>
