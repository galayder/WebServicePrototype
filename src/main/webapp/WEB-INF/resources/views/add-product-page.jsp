<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home Page</title>
    <style>
        <%@include file="../css/stylesheet.css"%>
    </style>
</head>
<body>
    <div id="content">
        <h1>Home Page</h1>
        <c:if test="${not empty message}">
            ${message}
        </c:if>
        <form method="POST" action="/home/add-product/add-next-product">
            Name:<br>
            <input type="text" name="name"><br>
            Description:<br>
            <input type="text" name="description"><br>
            Quantity:<br>
            <input type="number" name="quantity"><br>
            Price:<br>
            <input type="number" name="price"><br>
            <button type="submit">Add product</button>
        </form>

        <form method="GET" action="/home">
            <button type="submit">Back</button>
        </form>
    </div>
</body>
</html>