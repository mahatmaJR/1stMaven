<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>School Fees</title>
    <link rel="stylesheet" type="text/css" href="asset\css\style.css">
</head>
<body>
<%@ include file="header.jsp"%>
<center>
<form style="margin-top: 150px" action="schoolfee" method="get">
    Search
    <input type="text" name="admNoSearch"><br>
    Admission Number
    <input type="text" name="admNo"><br>
    First Name
    <input type="text" name="fName"><br>
    Last Name
    <input type="text" name="lName"><br>
    Year/Term
    <select>
        <option>Y1T1</option>
        <option>Y1T2</option>
        <option>Y1T3</option>
        <option>Y2T1</option>
        <option>Y2T2</option>
        <option>Y2T3</option>
    </select><br>
    Fee Paid
    <input type="text" name="feePaid">
    <p>Balance</p>
    <input type="text" name="balance">
</form>
</center>
<%@ include file="footer.jsp"%>
</body>
</html>
