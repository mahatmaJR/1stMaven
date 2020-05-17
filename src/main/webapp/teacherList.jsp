<%@ page import="utility.DatabaseConnection" %>
<%@ page import="java.sql.ResultSet" %>
<html>
<head>
    <title>Teacher List</title>
    <link rel="stylesheet" type="text/css" href="asset\css\style.css">

</head>
<body>
<%@ include file="header.jsp"%>
<section>
<center>
    <form style="margin-top: 150px">
        <table border="1" bordercolor="black" width="450" height="250">
            <thead>
                <th class='t_head'>Teacher Number</th>
                <th class='t_head'>First Name</th>
                <th class='t_head'>Last Name</th>
                <th class='t_head'>Address</th>
                <th class='t_head'>Teacher's Mobile Number</th>
            </thead>
            <tbody>

                <%
                    DatabaseConnection connect = new DatabaseConnection();
                    String sql = "SELECT * FROM teachers";
                    ResultSet result = connect.read(sql);
                    while (result.next()){%>
                <tr>
                    <td><%= result.getString("id")%></td>
                    <td><%=result.getString("fname")%></td>
                    <td><%=result.getString("lname")%></td>
                    <td><%=result.getString("address")%></td>
                    <td><%=result.getString("number")%></td>
                    <td><button name="edit" value="Edit">Edit</button></td>
                    <td><button name="delete" value="Delete">Delete</button></td>
                </tr>
                <%}
                %>

            <%
            %>
            </tbody>
        </table>

        <input type="submit" name="editRecord" value="Edit Record">
        <input type="submit" name="deleteRecord" value="Delete Record">
    </form>
</center>
</section>
<%@ include file="footer.jsp"%>
</body>
</html>
