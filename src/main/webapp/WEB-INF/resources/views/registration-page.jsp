<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registration Page</title>
    <style>
        <%@include file="../css/stylesheet.css"%>
    </style>
</head>
<body>
    <div id="content">
        <h1>Registration Page</h1>
        <form method="GET" action="/home">
            First Name:<br>
            <input type="text" name="firstName"><br>
            Last Name:<br>
            <input type="text" name="lastName"><br>
            E-mail:<br>
            <input type="text" name="email"><br>
            Password:<br>
            <input type="text" name="password"><br>
            Confirm password:<br>
            <input type="text" name="confirm"><br>
            <button type="submit">Ok</button>
        </form>
        <a href="/">Login</a>
    </div>
</body>
</html>