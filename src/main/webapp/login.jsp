<html>
<head>
    <title>LOGIN</title>
    <link rel="stylesheet" href="asset\css\style.css">
</head>
<body class="bod_name">
<%@ include file="header.jsp"%>
<section>
<div style="text-align: center; margin-top: 100px">
    <h1 class="h1_name">Welcome to the School Records System</h1>
    <form method="post" action="login">
        USERNAME:<br>
        <input type="text" name="user"><br>
        PASSWORD:<br>
        <input type="password" name="pass"><br>
        <input type="submit" name="submit" value="LOGIN">
    </form>
</div>
</section>
<%@ include file="footer.jsp"%>
</body>
</html>