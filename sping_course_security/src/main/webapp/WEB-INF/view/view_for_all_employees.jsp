<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: kN1GGhT
  Date: 25.10.2023
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h3> Information for all employees</h3>
<br><br>
<security:authorize access="hasRole('HR')">
       <input type="button" value="Salary"
              onclick="window.location.href='hr_info'">
       Only For HR stuff
</security:authorize>

<br><br>
<security:authorize access="hasRole('MANAGER')">
       <input type="button" value="Perfomance"
              onclick="window.location.href='manager_info'">
       Only For Managers
</security:authorize>


</body>
</html>
