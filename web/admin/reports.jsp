<%-- 
    Document   : reports
    Created on : Oct 3, 2017, 1:22:50 AM
    Author     : Ekrem Mujic
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>



    </head>
    <body>
        <h1>Report List</h1>
        <h3>These are all of the users who have registered this month:</h3>
        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
            </tr>
            <c:forEach var="User" items="${username}">
                <tr>
                    <td><c:out value="${User.firstName}"/></td>
                    <td><c:out value="${User.lastName}"/></td>
                    <td><c:out value="${User.email}"/></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>


    
    
    
    
    

 
<!-- end middle column -->


