<%@ page import="java.sql.ResultSet" %>
<%@ page import="utility.DatabaseConnection" %>
<%@ page import="logic.StudentLogic" %>
<html>
<head class="mainh_head">
    <title>Student List</title>
    <link rel="stylesheet" href="asset\css\style.css">
</head>
<body class="bod_name">
<%@ include file="header.jsp"%>
<section>
<center>
    <form class="signup-form" style="margin-top: 150px">
        <table border="1" bordercolor="black" width="750" height="450">
            <thead>
                <th class="t_head">Admission Number</th>
                <th class="t_head">First Name</th>
                <th class="t_head">Last Name</th>
                <th class="t_head">Address</th>
                <th class="t_head">Parent's Full Name</th>
                <th class="t_head">Parent's Mobile Number</th>
                <th class="t_head">Edit/Delete</th>
                </thead>
            <tbody>
            <%
                StudentLogic student = new StudentLogic();
                DatabaseConnection connect = new DatabaseConnection();
                String sql = "SELECT * FROM students";
                ResultSet result = connect.read(sql);
                while (result.next()){%>
            <tr>
                <td><%=result.getString("id")%></td>
                <td><%=result.getString("fname")%></td>
                <td><%=result.getString("lname")%></td>
                <td><%=result.getString("address")%></td>
                <td><%=result.getString("pname")%></td>
                <td><%=result.getString("pnumber")%></td>
                <td><input type="submit" name="editRecord" value="Edit"><input onclick="<%=student.editStudent()%>" type="submit" name="deleteRecord" value="Delete"></td>
            </tr>
            <%}
            %>

            <%
            %>
            </tbody>
        </table>


    </form>
</center>
</section>
<%@ include file="footer.jsp"%>
</body>
</html>


