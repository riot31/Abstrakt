<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jbUser
  Date: 10/26/2017
  Time: 11:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>UniversalName</td>
        <td>WebSiteUrl</td>
        <td>EmailDomain</td>
    </tr>
    <c:forEach var="item" items="${companyList}" varStatus="comp">
        <tr>
            <td>${comp.id}</td>
            <td>${comp.Name}</td>
            <td>${comp.UniversalName}</td>
            <td>${comp.WebsiteUrl}</td>
            <td>${comp.EmailDomains}</td>
        </tr>
    </c:forEach>

</table>


<div id="search">

</div>

</body>
</html>
