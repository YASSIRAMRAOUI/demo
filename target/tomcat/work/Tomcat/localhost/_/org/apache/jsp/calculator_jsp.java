/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-10-18 08:10:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Calculator;

public final class calculator_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1729202892826L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1729202867985L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');

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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Simple Calculator</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\n");
      out.write("    <style>\n");
      out.write("        * {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        html, body {\n");
      out.write("            height: 100%;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("            justify-content: space-between;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        header, footer {\n");
      out.write("            background-color: #333;\n");
      out.write("            color: white;\n");
      out.write("            padding: 15px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .content {\n");
      out.write("            flex: 1;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .calculator {\n");
      out.write("            background-color: #fff;\n");
      out.write("            padding: 40px;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"] {\n");
      out.write("            width: 80%;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin: 10px 0;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .buttons {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-around;\n");
      out.write("            margin: 10px 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .buttons button {\n");
      out.write("            background-color: #007BFF;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            padding: 10px 15px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .buttons button:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2 {\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        p {\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write('\r');
      out.write('\n');

    java.util.Date date = new java.util.Date();
    java.text.SimpleDateFormat dateFormatter = new java.text.SimpleDateFormat("EEEE, d MMMM yyyy");
    String currentDate = dateFormatter.format(date);

      out.write("\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("    <div class=\"date-container\">\r\n");
      out.write("        <p>Today's Date: ");
      out.print( currentDate );
      out.write("</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    .header {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    background-color: #333;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 15px 0;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .date-container p {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    font-family: \"Arial\", sans-serif;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    }\r\n");
      out.write("    body {\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    align-items: top;\r\n");
      out.write("    }\r\n");
      out.write("</style>");
      out.write("\n");
      out.write("    <div class=\"calculator\">\n");
      out.write("        <h1>Simple Calculator</h1>\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <input type=\"text\" name=\"num1\" placeholder=\"First number\" required />\n");
      out.write("            <input type=\"text\" name=\"num2\" placeholder=\"Second number\" required />\n");
      out.write("            <div class=\"buttons\">\n");
      out.write("                <button type=\"submit\" name=\"operation\" value=\"add\">\n");
      out.write("                    <i class=\"fas fa-plus\"></i>\n");
      out.write("                </button>\n");
      out.write("                <button type=\"submit\" name=\"operation\" value=\"subtract\">\n");
      out.write("                    <i class=\"fas fa-minus\"></i>\n");
      out.write("                </button>\n");
      out.write("                <button type=\"submit\" name=\"operation\" value=\"multiply\">\n");
      out.write("                    <i class=\"fas fa-times\"></i>\n");
      out.write("                </button>\n");
      out.write("                <button type=\"submit\" name=\"operation\" value=\"divide\">\n");
      out.write("                    <i class=\"fas fa-divide\"></i>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <h2>Result:</h2>\n");
      out.write("        <p>");
      out.print( error.isEmpty() ? result : error );
      out.write("</p>\n");
      out.write("    </div>\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("    <p>Address: Al Erfan, Rabat, Maroc</p>\r\n");
      out.write("    <p>Email: yassir@gmail.com</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    .footer {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    background-color: #333;\r\n");
      out.write("    padding: 20px 0;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    .footer p {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    color: white;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</style>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
