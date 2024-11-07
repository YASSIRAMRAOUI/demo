<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    java.util.Date date = new java.util.Date();
    java.text.SimpleDateFormat dateFormatter = new java.text.SimpleDateFormat("EEEE, d MMMM yyyy");
    String currentDate = dateFormatter.format(date);
%>
<div class="header">
    <div class="date-container">
        <p>Today's Date: <%= currentDate %></p>
    </div>
</div>

<style>
    .header {
    width: 100%;
    background-color: #333;
    color: white;
    padding: 15px 0;
    text-align: center;
    font-size: 18px;
    }

    .date-container p {
    margin: 0;
    font-family: "Arial", sans-serif;
    color: #fff;
    font-size: 16px;
    }
    body {
    flex-direction: column;
    align-items: top;
    }
</style>