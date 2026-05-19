<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>User Data Form</title>

<style>

body{
    font-family: Arial;
    background: #f2f2f2;
}

.form-container{
    width: 400px;
    margin: 50px auto;
    padding: 20px;
    background: white;
    border-radius: 10px;
    box-shadow: 0px 0px 10px gray;
}

.form-field{
    margin: 15px 0;
}

label{
    display: inline-block;
    width: 100px;
}

input{
    padding: 8px;
    width: 220px;
}

.submit-btn{
    width: 100%;
    padding: 10px;
    background: green;
    color: white;
    border: none;
    cursor: pointer;
}

</style>

</head>

<body>

<div class="form-container">

<h2>User Data Form</h2>

<form action="processUser" method="post">

<div class="form-field">
<label>Username :</label>
<input type="text"
       name="username"
       required>
</div>

<div class="form-field">
<label>Email :</label>
<input type="email"
       name="email"
       required>
</div>

<div class="form-field">
<label>Designation :</label>
<input type="text"
       name="designation"
       required>
</div>

<div class="form-field">
<input type="submit"
       value="Submit"
       class="submit-btn">
</div>

</form>

</div>

</body>
</html>