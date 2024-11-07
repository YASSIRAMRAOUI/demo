<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="model.User" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>User</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Styles/user-list.css" />
</head>
<body>
    <%@ include file="header.jsp" %>
    <h2>Users List</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>City</th>
            <th>Email</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <%
            List<User> users = (List<User>) request.getAttribute("listUsers");
            if (users != null) {
                for (User user : users) {
        %>
        <tr>
            <td><%= user.getId() %></td>
            <td><%= user.getName() %></td>
            <td><%= user.getCity() %></td>
            <td><%= user.getEmail() %></td>
            <td>
                <a href="${pageContext.request.contextPath}/users/edit?id=<%= user.getId() %>">
                    <i class="fas fa-edit" style="color:green;"></i>
                </a>
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/users/delete?id=<%= user.getId() %>">
                    <i class="fas fa-trash" style="color:red;"></i>
                </a>
            </td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="5">No users found.</td>
        </tr>
        <%
            }
        %>
    </table>
    <div style="text-align: center; margin-top: 20px;">
        <a href="${pageContext.request.contextPath}/users/new" class="add-user-button">
            <i class="fas fa-plus-circle"></i> Add User
        </a>
    </div>
    <%@ include file="footer.jsp" %>
</body>
</html>
