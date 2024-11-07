<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Welcome</title>
    <link rel="stylesheet" href="Styles/welcome.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
  </head>
  <body>
    <%@ include file="header.jsp" %>
    <div class="container">
      <h1>Welcome to JEE TP</h1>
      <a href="users/list">
        <div class="box">
          <i class="fa-solid fa-bars-progress" style="color:#789DBC"></i>
          <h3 style="color:#789DBC">Manage Users</h3>
        </div>
      </a>
      <a href="articles/list">
        <div class="box">
          <i class="fa-solid fa-newspaper" style="color:#6B240C"></i>
          <h3 style="color:#6B240C">Manage Articles</h3>
        </div>
      </a>
      <a href="calculator.jsp">
        <div class="box">
          <i class="fa-solid fa-calculator" style="color:#0D92F4"></i>
          <h3 style="color:#0D92F4">Calculator</h3>
        </div>
      </a>
      <a href="javaBeans.jsp">
        <div class="box">
          <i class="fa-solid fa-file-word" style="color:#F95454"></i>
          <h3 style="color:#F95454">WordBean</h3>
        </div>
      </a>
    </div>
    <%@ include file="footer.jsp" %>
  </body>
</html>
