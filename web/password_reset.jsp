<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="imports/header.html" />

<nav>
    <a href="index.jsp">Home</a>|
</nav>

<h3>Change your password here:</h3>

<form action="newCustomer" method="post">
    <input type="hidden" name="action" value="reset">
    <br>
    <label class="labels">New Password:</label>
    <input type="password" name="password" required>
    <br>
    <br>
    <label class="labels">Password:</label>
    <span>${user.password}</span><br><br>
    <input type="submit" Value="Reset Password"><br><br>
</form>
    
<c:import url="imports/footer.jsp" />