<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.Calculator" %>
<%
    String operation = request.getParameter("operation");
    double result = 0;
    String error = "";

    if (operation != null) {
        try {
            double num1 = Double.parseDouble(request.getParameter("num1"));
            double num2 = Double.parseDouble(request.getParameter("num2"));
            Calculator calculator = new Calculator();

            if ("add".equals(operation)) {
                result = calculator.add(num1, num2);
            } else if ("subtract".equals(operation)) {
                result = calculator.subtract(num1, num2);
            } else if ("multiply".equals(operation)) {
                result = calculator.multiply(num1, num2);
            } else if ("divide".equals(operation)) {
                result = calculator.divide(num1, num2);
            } else {
                error = "Invalid operation";
            }
        } catch (NumberFormatException e) {
            error = "Invalid input. Please enter valid numbers.";
        } catch (IllegalArgumentException e) {
            error = e.getMessage();
        }
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Calculator</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        html, body {
            height: 100%;
            font-family: Arial, sans-serif;
        }

        body {
            display: flex;
            flex-direction: column;
            justify-content: space-between;
        }

        header, footer {
            background-color: #333;
            color: white;
            padding: 15px;
            text-align: center;
        }

        .content {
            flex: 1;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
        }

        .calculator {
            background-color: #fff;
            padding: 40px;
            margin: 20px auto;
            border-radius: 10px;
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
            text-align: center;
        }

        input[type="text"] {
            width: 80%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }

        .buttons {
            display: flex;
            justify-content: space-around;
            margin: 10px 30px;
        }

        .buttons button {
            background-color: #007BFF;
            color: white;
            border: none;
            padding: 10px 15px;
            border-radius: 5px;
            cursor: pointer;
            font-size: 18px;
        }

        .buttons button:hover {
            background-color: #0056b3;
        }

        h2 {
            margin-top: 20px;
        }

        p {
            font-size: 20px;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <%@ include file="header.jsp" %>
    <div class="calculator">
        <h1>Simple Calculator</h1>
        <form method="post">
            <input type="text" name="num1" placeholder="First number" required />
            <input type="text" name="num2" placeholder="Second number" required />
            <div class="buttons">
                <button type="submit" name="operation" value="add">
                    <i class="fas fa-plus"></i>
                </button>
                <button type="submit" name="operation" value="subtract">
                    <i class="fas fa-minus"></i>
                </button>
                <button type="submit" name="operation" value="multiply">
                    <i class="fas fa-times"></i>
                </button>
                <button type="submit" name="operation" value="divide">
                    <i class="fas fa-divide"></i>
                </button>
            </div>
        </form>

        <h2>Result:</h2>
        <p><%= error.isEmpty() ? result : error %></p>
    </div>
    <%@ include file="footer.jsp" %>
</body>
</html>
