package utility;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;
import java.io.IOException;

@WebFilter(urlPatterns = {"/home", "/index", "/logout", "/newstudent", "/newteacher" , "/studentlist", "/teacherlist"})

public class CookieFilter implements Filter{

    private FilterConfig config = null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        if (session.getAttribute("id") ==null){
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        config = null;
    }

    public void newCookie(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Cookie cookie = new Cookie("user", "username");
        response.addCookie(cookie);

        Cookie[] cook = request.getCookies();
        for (int i = 0; i <cook.length; i++) {
            System.out.println(cook[i].getValue() + cook[i].getName());
        }
    }
}