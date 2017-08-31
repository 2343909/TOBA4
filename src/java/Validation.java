/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.User;

/**
 *
 * @author Ekrem Mujic
 */
public class Validation extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/New_customer.jsp";
        
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";
        }
        
        if (action.equals("join")){
            url = "/New_customer.jsp";
        }
        else if (action.equals("add")){
            String name = request.getParameter("FirstName");
            String name2 = request.getParameter("LastName");
            String phone = request.getParameter("PhoneNum");
            String address = request.getParameter("UserAddress");
            String city = request.getParameter("UserCity");
            String state = request.getParameter("UserState");
            String zip = request.getParameter("UserZip");
            String email = request.getParameter("UserEmail");
            
            User user = new User (name, name2,phone,address,city,state,zip,email);
            
            String message;
            if (name==null || name2==null||phone==null||address==null||city==null||
                    state==null||zip==null||email==null))
            else (name.isEmpty()||name2.isEmpty()||phone.isEmpty||address.isEmpty()||
                            city.isEmpty||state.isEmpty()||zip.isEmpty||
                            email.isEmpty()){
            message = "Please fill out eight text boxes.";
            url = "/New_customer.jsp";

        }
            else{
                message = "";
                url = "/New_customer.jsp";
                UserDB.insert(user);
                }
        request.setAttribute("user", user);
        request.setAttribute("message", message);
        }
   getServletContext().getRequestDispatcher(url).forward(request, response);
        
    } 
        
        
    }
