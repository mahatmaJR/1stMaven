package utility;

import logic.LoginLogic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/login")

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginLogic login = new LoginLogic();

        String user = req.getParameter("user");
        String pass = req.getParameter("pass");

        try {
            if(login.login(user, pass)){
                CookieFilter myCookie = new CookieFilter();
                myCookie.newCookie(req, resp);
                HttpSession session = req.getSession();
                session.setAttribute("id", user);
                req.getRequestDispatcher("home.jsp").forward(req, resp);
            }
            else {req.getRequestDispatcher("Unsuccessful.jsp").forward(req, resp);}
        } catch (SQLException e) {
            req.getRequestDispatcher("Unsuccessful.jsp");

        } catch (ClassNotFoundException e) {
            req.getRequestDispatcher("Unsuccessful.jsp");
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.jsp").forward(req, resp);
    }
}