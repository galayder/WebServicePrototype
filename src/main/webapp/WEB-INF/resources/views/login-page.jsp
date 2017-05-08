<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login Page</title>
    <style>
        <%@include file="../css/stylesheet.css"%>
    </style>
</head>
<body>
    <div id="content">
        <h1>Login Page</h1>
        <form method="GET" action="/home">
            Login:<br>
            <input type="text" name="login"><br>
            Password:<br>
            <input type="text" name="password"><br>
            <button type="submit">Login</button>
        </form>
        <a href="/registration">Registration</a>
    </div>
</body>
</html>