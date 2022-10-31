<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week7 Lab - User Management</title>
    </head>
    <body>
        <h1>Manage Users</h1>

        <p>
            <c:if test="${message ne null}">
                ${message}
            </c:if>
        </p>

        <table border="1">
            <tr>
                <th>Email</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Role</th>
                <th></th>
                <th></th>
            </tr>
            
            <c:forEach var="user" items="${users}">
                <tr>
                    <td>${user.email}</td>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.role.getName()}</td>
                    <td><a href="user?email=${user.email}&action=edit" name="edit">Edit</a></td>
                <input type="hidden" name="action" value="delete">
                <td><a href="user?email=${user.email}&action=delete" name="delete">Delete</a></td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
