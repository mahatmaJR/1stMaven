package utility;

import logic.TeacherLogic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet (urlPatterns = "/newteacher")
public class TecherServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TeacherLogic teacher = new TeacherLogic();

        int tID = Integer.parseInt(req.getParameter("tNo"));
        Integer tid = new Integer(tID);
        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        String address = req.getParameter("address");
        int tnumber = Integer.parseInt(req.getParameter("tnumber"));
        Integer tnum = new Integer(tnumber);


        if (tid == null || fname.isEmpty() || lname.isEmpty() || address.isEmpty() || tnum == null) {
            req.getRequestDispatcher("unsuccessful.jsp").forward(req, resp);
        } else {
            try {
                teacher.addTeacher(tID, fname, lname, address, tnumber);
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
        req.getRequestDispatcher("newTeacher.jsp").forward(req, resp);
    }
}