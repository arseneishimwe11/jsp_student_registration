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
    <title>Student Information</title>
    <link rel="stylesheet" href="../resources/css/display.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.15.3/css/all.css">
    <link rel="stylesheet" href="https://cdn.tailwindcss.com">
</head>
<body>
    <h1 class="user1">STUDENT MANAGEMENT SYSTEM</h1>
    <table>
        <tr>
            <th class="text-black">#</th>
            <th class="text-black">Code</th>
            <th class="text-black">Names</th>
            <th class="text-black">Dob</th>
            <th class="text-black">Email</th>
            <th class="text-black">Grade</th>
        </tr>
        <tr>
        	<td><%= request.getAttribute("id") %></td>
            <td><%= request.getAttribute("student_code") %></td>
            <td><%= request.getAttribute("name") %></td>
            <td><%= request.getAttribute("date") %></td>
            <td><%= request.getAttribute("grade") %></td>
            <td><%= request.getAttribute("email") %></td>
            <td class='links'>
                <a href='' class='bg-green-400 text-base px-2 py-1 border-none rounded-xl text-slate-100 font-bold items-right w-24 edit-button'>Update</a>
                <a href='' class='bg-red-500 text-base px-2 py-1 border-none rounded-xl text-slate-100 font-bold w-24 delete-button'>Delete</a>
            </td>
        </tr>
    </table>
</body>
</html>