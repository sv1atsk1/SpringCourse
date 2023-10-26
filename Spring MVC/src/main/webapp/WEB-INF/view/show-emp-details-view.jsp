<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kN1GGhT
  Date: 23.10.2023
  Time: 3:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>

<h2> Dear Employee, you are Welcome!</h2>
<br>
<br>
<br>

<%--Your name: ${param.employeeName}--%>
Your name: ${employee.name}
<br>
Your Surname: ${employee.surname}
<br>
Your Salary: ${employee.salary}
<br>
Your Department: ${employee.department}
<br>
Your Car: ${employee.carBrand}
<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li> ${lang} </li>
    </c:forEach>
</ul>
Phone number: ${employee.phoneNumber}
Email: ${employee.email}

</body>
</html>
