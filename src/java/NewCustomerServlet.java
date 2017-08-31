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

/**
 *
 * @author Ekrem Mujic
 */


public class NewCustomerServlet extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        

        
        String name = request.getParameter("FirstName");
        String name2 = request.getParameter("LastName");
        String phone = request.getParameter("PhoneNum");
        String address = request.getParameter("UserAddress");
        String city = request.getParameter("UserCity");
        String state = request.getParameter("UserState");
        String zip = request.getParameter("UserZip");
        String email = request.getParameter("UserEmail");
       
        response.setStatus(response.SC_MOVED_TEMPORARILY);
        response.setHeader("Location", "Success.html");
    }
 
  
}
