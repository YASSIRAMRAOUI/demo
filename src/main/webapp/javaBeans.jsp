<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="wordBean" class="model.WordBean" scope="session" />

<html>
<head>
    <title>Word Length Calculator</title>
</head>
<body>
    <%@ include file="header.jsp" %>
    <div class="content">
        <div>
            <h2>Enter a word to calculate its length</h2>
        
            <form method="post">
                <label for="word">Word:</label>
                <input type="text" id="word" name="word" value="" required />
                <input type="submit" value="Submit" />
            </form>

            <jsp:setProperty name="wordBean" property="word" param="word" />

            <c:if test="${not empty wordBean.word}">
                <div class="result">
                    <h3>The word "<c:out value="${wordBean.word}"/>" has <c:out value="${wordBean.wordLength}"/> letters.</h3>
                </div>
                <jsp:setProperty name="wordBean" property="word" value="" />
            </c:if>
        </div>
    </div>

    <%@ include file="footer.jsp" %>
</body>
</html>

<style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            height: 100vh;
        }

        .header {
            width: 100%;
            background-color: #333;
            color: white;
            padding: 15px 0;
            text-align: center;
            font-size: 18px;
        }

        .content {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-grow: 1;
            padding: 20px;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
        }

        label {
            display: block;
            margin-bottom: 10px;
            font-size: 16px;
            color: #555;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            border-radius: 4px;
            border: 1px solid #ccc;
            margin-bottom: 20px;
            font-size: 16px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 10px 15px;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        .result {
            background-color: #dff0d8;
            padding: 15px;
            margin-top: 20px;
            border-radius: 8px;
            color: #3c763d;
            text-align: center;
        }

        .result h3 {
            margin: 0;
            font-size: 18px;
        }

        .footer {
            width: 100%;
            background-color: #333;
            padding: 20px 0;
            text-align: center;
            color: white;
            font-size: 14px;
        }
    </style>