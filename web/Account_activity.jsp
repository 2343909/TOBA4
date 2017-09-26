

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="imports/header.html" />

<nav>
    <a href="./index.jsp">Home</a> |
    <a href="./Login.jsp">Sign In</a> |
</nav><br>
<main>
<h2>Account Activity</h2>

<c:if test="${sessionScope.user != null}">
Welcome ${user.firstName} ${user.lastName}.

</c:if>

<c:if test="${sessionScope.user == null}">
    You are not logged in.
</c:if>
 </main> 

<c:import url="imports/footer.jsp" />
