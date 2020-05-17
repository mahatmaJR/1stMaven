<html>
<head>
    <title>Home</title>
</head>
<body>
<%@include file="header.jsp"%>

<section class="body-sec overflow-auto" style="margin-top: 100px">
<div>
    <center>
    <form method="post" action="home">
    <h1>Welcome to the School Records System</h1>
        <li><a href="newstudent">Add New Student</a></li>
        <li><a href="newteacher">Add New Teacher</a></li>
        <li><a href="studentlist">Student List</a></li>
        <li><a href="teacherlist">Teacher List</a></li>
    </form>
    </center>
</div>

</section>

<%@include file="footer.jsp"%>

</body>
</html>
