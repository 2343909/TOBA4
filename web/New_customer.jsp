<%-- 
    Document   : New_customer
    Created on : Aug 30, 2017, 5:40:42 AM
    Author     : Ekrem Mujic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Titan Bank New User Sign up</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
      
        <h1>Enter Your Information Below</h1>
        <nav>
            <a href="./index.html">Home</a> |
            <a href="./Login.html">Sign In</a> |
        </nav><br><br>
        <form action= "AddNewCustomer">
            <table cellspacing="4" border="0">
                <tr>
                    <td align="center">First Name:</td>
                    <td><input type="text" name="FirstName"></td>
                </tr>
                <tr>
                    <td align="center">Last Name:</td>
                    <td><input type="text" name="LastName"></td>
                </tr>
                <tr>
                    <td align="center">Phone:</td>
                    <td><input type="text" name="PhoneNum"></td>
                </tr>
                <tr>
                    <td align="center">Address:</td>
                    <td><input type="text" name="UserAddress"></td>
                </tr>
                <tr>
                    <td align="center">City:</td>
                    <td><input type="text" name="UserCity"></td>
                </tr>
                <tr>
                    <td align="center">State:</td>
                    <td><input type="text" name="UserState"></td>
                </tr>
                <tr>
                    <td align="center">Zip Code:</td>
                    <td><input type="text" name="UserZip"></td>
                </tr>
                <tr>
                    <td align="center">Email:</td>
                    <td><input type="text" name="UserEmail"></td>
                </tr>
                <tr>
                    <td align="center"></td>
                    <td><br><input type="submit" value="Submit"></td>
                </tr>
            </table>
    </body>
</html>
