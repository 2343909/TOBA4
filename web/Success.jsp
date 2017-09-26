<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="imports/header.html" />

<html>
    <head>
        <title>Account</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    </head>
    <body>
        <nav><br>
            <a href="./index.jsp">Home</a> |
            <a href="./Login.jsp">Sign In</a> | 
        </nav>
        <div>
        <h3>Account Created Successfully</h3>
        
           <p>Here is the information that you entered:</p>
            <label>First Name:</label>
            <span>${user.firstName}</span><br>        
            <label>Last Name:</label>
            <span>${user.lastName}</span><br>
            <label>Phone Number:</label>
            <span>${user.phone}</span><br>
            <label>Address:</label>
            <span>${user.address}</span><br>
            <label>City:</label>
            <span>${user.city}</span><br>
            <label>State:</label>
            <span>${user.state}</span><br>
            <label>Zip Code:</label>
            <span>${user.zipCode}</span><br>
            <label>Email:</label>
            <span>${user.email}</span><br>
            <br>
            <p>Here is your username and password:</p>
            <label>Username:</label>
            <span>${user.username}</span><br>
            <label>Password:</label>
            <span>${user.password}</span><br>
        </div><br><br>
    </body>
</html>

<c:import url="imports/footer.jsp" />