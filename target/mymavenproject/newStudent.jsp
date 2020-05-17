<html>
<head>
    <title>Student</title>
    <link rel="stylesheet" type="text/css" href="asset\css\style.css">
</head>
<body>
<%@ include file="header.jsp"%>
<section>
<div style="margin-top: 150px; text-align: center">
<h2 class="h2">Enter Student Details</h2>
    <form class="signup-form" action="newstudent" method="post">
        Admission Number:<br>
        <input type="text" name="admNo"><br>
        First name:<br>
        <input type="text" name="firstName"><br>
        Last name:<br>
        <input type="text" name="lastName"><br>
        Address:<br>
        <input type="text" name="address"><br>
        Parent's Full Name:<br>
        <input type="text" name="parentName"><br>
        Parent's Mobile Number:<br>
        <input type="text" name="parentNumber"><br><br>
        <input type="submit" name="submit" value="Add Student">
    </form>
</div>
</section>
<%@ include file="footer.jsp"%>
</body>
</html>

