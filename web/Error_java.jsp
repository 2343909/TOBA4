<%-- 
    Document   : Error_java
    Created on : Aug 31, 2017, 5:45:01 AM
    Author     : Ekrem Mujic
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="imports/header.html" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Error</title>
    </head>
    <body>
        <h1>Java Error</h1>
        <p>Sorry, Java has thrown an exception.</p>
        <p>To continue, click the Back button.</p>
        
        <h2>Details</h2>
        <p>Type: {pageContext.exception["class"]}</p>
        <p>Message:  {pageContext.exception.message}</p>
    </body>
</html>

<c:import url="imports/footer.jsp" />