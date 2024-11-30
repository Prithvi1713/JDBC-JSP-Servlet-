import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.SecureRandom;
import java.sql.*;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDao userDao;

    public void init() {
        userDao = new UserDao();
    }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String key = generateRandomKey();




           //  UserDao userDao = new UserDao();
            if (userDao.isUsernameAvailable(username)) {
                // Username is available, proceed with registration
                User user = new User(firstName, lastName, email, username, password, key);
                userDao.saveUser(user);

                request.setAttribute("key", key);
                request.getRequestDispatcher("register-success.jsp").forward(request, response);
            } else {
                // Username is already taken, redirect to error page or show an error message
                request.setAttribute("errorMessage", "Username already exists.");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
    }

    private String generateRandomKey() {
        SecureRandom random = new SecureRandom();
        return Integer.toString(random.nextInt(1000000));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("register.jsp").forward(request, response);
    }
}
