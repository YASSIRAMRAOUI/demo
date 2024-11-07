package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simple authentication logic
        if ("admin".equals(username) && "123".equals(password)) {
            // Create a session for the logged-in user
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            // Set session timeout (optional)
            session.setMaxInactiveInterval(1800);

            // Redirect to the user dashboard
            response.sendRedirect("welcome.jsp");
        } else {
            // Invalid login, display error message
            request.setAttribute("errorMessage", "Invalid username or password. Please try again.");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }
}
