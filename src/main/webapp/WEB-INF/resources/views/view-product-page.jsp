<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View Product Page</title>
    <style>
        <%@include file="../css/stylesheet.css"%>
    </style>
</head>
<body>
<div id="content">
    <h1>View Product Page</h1>
    <c:if test="${not empty message}">
        ${message.name}
    </c:if>

    <form method="GET" action="/home/view-products/result">
        Name:<br>
        <input type="text" name="name"><br>
        <button type="submit">Add next product</button>
    </form>

    <form method="GET" action="/home">
        <button type="submit">Back</button>
    </form>
</div>
</body>
</html>