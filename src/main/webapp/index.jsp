<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Result Form</title>

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

input{
    width:100%;
    padding:10px;
    margin:10px 0;
}

button{
    width:100%;
    padding:10px;
    background:green;
    color:white;
    border:none;
    cursor:pointer;
}

.error{
    color:red;
}

</style>

<script>

function validateForm(){

    let rollno = document.forms["studentForm"]["rollno"].value;
    let name = document.forms["studentForm"]["studentname"].value;

    let s1 = document.forms["studentForm"]["sub1"].value;
    let s2 = document.forms["studentForm"]["sub2"].value;
    let s3 = document.forms["studentForm"]["sub3"].value;
    let s4 = document.forms["studentForm"]["sub4"].value;
    let s5 = document.forms["studentForm"]["sub5"].value;

    if(rollno === "" || name === ""){
        alert("Roll No and Student Name are required");
        return false;
    }

    let subjects = [s1,s2,s3,s4,s5];

    for(let i=0;i<subjects.length;i++){

        if(subjects[i] === ""){
            alert("All subject marks are required");
            return false;
        }

        if(subjects[i] < 0 || subjects[i] > 100){
            alert("Marks should be between 0 and 100");
            return false;
        }
    }

    return true;
}

</script>

</head>

<body>

<div class="container">

<h2>Student Result Processing</h2>

<form name="studentForm"
      action="ResultServlet"
      method="post"
      onsubmit="return validateForm()">

<input type="text"
       name="rollno"
       placeholder="Enter Roll Number">

<input type="text"
       name="studentname"
       placeholder="Enter Student Name">

<input type="number"
       name="sub1"
       placeholder="Enter Subject 1 Marks">

<input type="number"
       name="sub2"
       placeholder="Enter Subject 2 Marks">

<input type="number"
       name="sub3"
       placeholder="Enter Subject 3 Marks">

<input type="number"
       name="sub4"
       placeholder="Enter Subject 4 Marks">

<input type="number"
       name="sub5"
       placeholder="Enter Subject 5 Marks">

<button type="submit">Calculate Result</button>

</form>

</div>

</body>
</html>