<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 1/27/2024
  Time: 2:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <title>Display Data</title>
</head>
<body>
    <h1>Student Information</h1>
    <p>Student Code: <%= request.getAttribute("code") %></p>
    <p>Name: <%= request.getAttribute("names") %></p>
    <p>Age: <%= request.getAttribute("age") %></p>
    <p>Email: <%= request.getAttribute("email") %></p>
    <!-- Add more fields as needed -->
</body>
</html>