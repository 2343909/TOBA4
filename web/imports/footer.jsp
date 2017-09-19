<%@page import="java.util.GregorianCalendar, java.util.Calendar" %>

<%
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
    int currentMonth = 1 + currentDate.get(Calendar.MONTH);
    int currentDay = currentDate.get(Calendar.DATE);
%>

<p>&copy; Copyright <%= currentMonth %>/<%= currentDay %>/<%= currentYear %>
    Online Banking Application</p>
</body>
</html>
