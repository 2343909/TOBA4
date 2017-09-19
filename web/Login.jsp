<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="imports/header.html" />
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <nav>
            <a href="./index.jsp">Home</a> |
            <a href="./Login.jsp">Sign In</a> |
        </nav><br>
        <form action="LoginServlet">
            <table cellspacing="4" border="0">
                <tr>
                    <td align="center">User ID</td>
                    <td><input type="text" name="uname"></td>
                </tr>
                <tr>
                    <td align="center">Password</td>
                    <td><input type="password" name="pass"></td>
                </tr>
                <tr>
                    <td align="right"></td>
                    <td><br><input type="submit" value="Login"></td>
                </tr>
            </table>
        </form>
        <a href="password_reset.jsp">Reset Password</a>
        <h4>Not a Customer?</h4> 
        <a href="New_customer.jsp">Sign up Now!</a><br><br>
        
    </body>
</html>

<c:import url="imports/footer.jsp" />