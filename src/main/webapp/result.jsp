<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Result</title>

<style>

body{
    font-family: Arial;
    background:#f2f2f2;
}

.container{
    width:500px;
    margin:40px auto;
    background:white;
    padding:20px;
    border-radius:10px;
    box-shadow:0 0 10px gray;
}

table{
    width:100%;
    border-collapse:collapse;
}

th,td{
    border:1px solid black;
    padding:10px;
    text-align:center;
}

.pass{
    color:green;
    font-weight:bold;
}

.fail{
    color:red;
    font-weight:bold;
}

.error{
    color:red;
    font-weight:bold;
}

a{
    display:block;
    margin-top:20px;
}

</style>

</head>

<body>

<div class="container">

<h2>Student Result</h2>

<%
String error = (String) request.getAttribute("error");

if(error != null){
%>

<div class="error">
<%= error %>
</div>

<%
}
else{
%>

<table>

<tr>
<th>Field</th>
<th>Value</th>
</tr>

<tr>
<td>Roll Number</td>
<td><%= request.getAttribute("rollno") %></td>
</tr>

<tr>
<td>Student Name</td>
<td><%= request.getAttribute("studentname") %></td>
</tr>

<tr>
<td>Subject 1</td>
<td><%= request.getAttribute("sub1") %></td>
</tr>

<tr>
<td>Subject 2</td>
<td><%= request.getAttribute("sub2") %></td>
</tr>

<tr>
<td>Subject 3</td>
<td><%= request.getAttribute("sub3") %></td>
</tr>

<tr>
<td>Subject 4</td>
<td><%= request.getAttribute("sub4") %></td>
</tr>

<tr>
<td>Subject 5</td>
<td><%= request.getAttribute("sub5") %></td>
</tr>

<tr>
<td>Average</td>
<td><%= request.getAttribute("average") %></td>
</tr>

<tr>
<td>Result</td>

<td class="<%= 
"PASS".equals(request.getAttribute("result"))
? "pass" : "fail" %>">

<%= request.getAttribute("result") %>

</td>
</tr>

</table>

<%
}
%>

<a href="index.jsp">Back to Student Form</a>

</div>

</body>
</html>