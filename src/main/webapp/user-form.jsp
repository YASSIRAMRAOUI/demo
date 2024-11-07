<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Form</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/Styles/user-form.css" />
</head>
<body>
    <h2>${user == null ? "Create" : "Edit"} User</h2>
    <form action="${user == null ? 'insert' : 'update'}" method="post">
        <input type="hidden" name="id" value="${user != null ? user.id : ''}" />
        <div>
            <label>Name:</label>
            <input type="text" name="name" value="${user != null ? user.name : ''}" required />
        </div>
        <div>
            <label>City:</label>
            <input type="text" name="city" value="${user != null ? user.city : ''}" required />
        </div>
        <div>
            <label>Email:</label>
            <input type="email" name="email" value="${user != null ? user.email : ''}" required />
        </div>
        <button type="submit">${user == null ? "Create" : "Update"} User</button>
    </form>
</body>
</html>
