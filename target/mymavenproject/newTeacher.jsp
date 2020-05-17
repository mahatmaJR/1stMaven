<html>
<head>
    <title>Teacher</title>
    <link rel="stylesheet" type="text/css" href="asset\css\style.css">
</head>
<%@ include file="header.jsp"%>
<section>
<div style="text-align: center; margin-top: 150px">
    <h2 class="h2">Enter Teacher Details</h2>
    <form class="signup-form" method="post" action="newteacher">
        Teacher Number:<br>
        <input type="text" name="tNo"><br>
        First name:<br>
        <input type="text" name="fname"><br>
        Last name:<br>
        <input type="text" name="lname"><br>
        Address:<br>
        <input type="text" name="address"><br>
        Teacher's Mobile Number:<br>
        <input type="text" name="tnumber"><br><br>
        <input type="submit" name="Submit" value="Add Teacher">
    </form>
</div>
</section>
<%@ include file="footer.jsp"%>
</body>
</html>
