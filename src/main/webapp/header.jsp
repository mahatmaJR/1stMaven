<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <link rel="stylesheet" type="text/css" href="asset\css\style.css">
</head>
<body>
<form action="header" method="get">
<header class="header-section">

    <div class="header-warp">
        <div class="header-bar-warp d-flex">
            <nav class="top-nav-area w-100">
                <div class="user-panel">
                    <p><%out.print("Welcome " + request.getParameter("user"));%></p>

                        <%--<%--%>
                            <%--if (request.getParameter(==null)){--%>
                            <%--<a href="login">Login</a>--%>
                            <%--}else{<a href="logout">Logout</a>}--%>
                        <%--%>--%>
                </div>
                <ul class="main-menu primary-menu">
                    <li><a href="home">Home</a></li>
                    <li><a href="newstudent">Add Student</a>
                    <li><a href="newteacher">Add Teacher</a>
                    <li><a href="">Lists</a>
                        <ul class="sub-menu">
                            <li><a href="studentlist">Student List</a></li>
                            <li><a href="teacherlist">Teacher List</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</header>
</form>
</body>
</html>
