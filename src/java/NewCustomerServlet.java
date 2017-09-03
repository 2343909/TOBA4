/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ekrem Mujic
 */


public class NewCustomerServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        String message;            
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phoneNumber = request.getParameter("phoneNumber");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipCode = request.getParameter("zipCode");
        String email = request.getParameter("email");

        if (firstName.equals("") || lastName.equals("") || phoneNumber.equals("") || 
                address.equals("") || city.equals("") || state.equals("") || 
                zipCode.equals("")|| email.equals("")){
            message = "Please enter all of the required information below.";
            request.setAttribute("message", message);
            request.getRequestDispatcher("New_customer.jsp").forward(request,
                    response);
            
        }                 
         else{
            request.getRequestDispatcher("Success.html").forward(request, 
                    response);      
        }
        
    }
}


    
   