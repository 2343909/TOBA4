import bussines.User;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import bussines.UserDB;

/**
 *
 * @author Ekrem Mujic
 */
public class NewCustomerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/index.jsp";
        
        String action = request.getParameter("action");
        
        if (action.equals("signup")){
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String phoneNumber = request.getParameter("phoneNumber");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zipCode = request.getParameter("zipCode");
            String email = request.getParameter("email");
            String username = lastName + zipCode;
            String password = "welcome1";
            
            User user = new User (firstName, lastName, phoneNumber, address, city, 
                state, zipCode, email, username, password);
            
            String message;
            if (firstName.isEmpty() || lastName.isEmpty() || phoneNumber.isEmpty() || 
                    address.isEmpty() || city.isEmpty() || state.isEmpty() || 
                    zipCode.isEmpty() || email.isEmpty()){
                url = "/New_customer.jsp";
                message = "Please fill out all of the form fields";
                
            }
            
            else {
                message = null;
                url = "/Success.jsp";
                UserDB.insert(user);
            }
            
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            session.setAttribute("message", message);
        }
        
        else if (action.equals("reset")) {
            url = resetPassword(request, response);
        }
        
        getServletContext()
            .getRequestDispatcher(url).forward(request,
            response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    
    private String resetPassword(HttpServletRequest request, 
            HttpServletResponse response){
        
        HttpSession session = request.getSession();
        String password = request.getParameter("password");
        User user = (User) session.getAttribute("user");
        
        String url;
        if (password.isEmpty()){
            url = "/password_reset.jsp";
        }
        
        else {
            user.setPassword(password);
            session.setAttribute("password", password);
            session.setAttribute("user", user);
            url = "/Account_activity.jsp";
        }
        return url;
    }
}