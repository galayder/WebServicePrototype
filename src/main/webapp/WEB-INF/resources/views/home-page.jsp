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
        <form method="GET" action="/home/add-product">
            <button type="submit">Add new products</button>
        </form>

        <form method="GET" action="/home/view-products">
            <button type="submit">View products</button>
        </form>
    </div>
</body>
</html>