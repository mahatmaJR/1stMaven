package utility;

import logic.StudentLogic;
import model.StudentDetail;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/newstudent")

public class StudentServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentLogic student = new StudentLogic();

        int adm = Integer.parseInt(req.getParameter("admNo"));
        Integer admNo = new Integer(adm);
        String fname = req.getParameter("firstName");
        String lname = req.getParameter("lastName");
        String address = req.getParameter("address");
        String pname = req.getParameter("parentName");
        int pnum = Integer.parseInt(req.getParameter("parentNumber"));
        Integer pnumber = new Integer(pnum);

        if (admNo == 0 || fname.isEmpty() || lname.isEmpty() || address.isEmpty() || pname.isEmpty() || pnumber == 0){
            req.getRequestDispatcher("unsuccessful.jsp").forward(req, resp);
        }else {
            try {
                student.addStudent(admNo, fname, lname, address, pname, pnumber);
                student.addStudentFinanceRecord();
                req.getRequestDispatcher("successful.jsp").forward(req, resp);
            } catch (SQLException e) {
                req.getRequestDispatcher("unsuccessful.jsp").forward(req, resp);
            } catch (ClassNotFoundException e) {
                req.getRequestDispatcher("unsuccessful.jsp").forward(req, resp);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("newStudent.jsp").forward(req, resp);
    }
}