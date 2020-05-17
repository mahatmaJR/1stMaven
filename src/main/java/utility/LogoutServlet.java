package utility;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/logout")

public class LogoutServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("logout.jsp").forward(req, resp);
        Cookie cookie = new Cookie("name", "");
        cookie.setMaxAge(0);
        resp.addCookie(cookie);
        HttpSession session = req.getSession();
        System.out.println(session.getId() + session.getAttributeNames());
        session.invalidate();
    }
}