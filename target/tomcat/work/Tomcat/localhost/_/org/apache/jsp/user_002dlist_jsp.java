/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-10-18 08:10:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.User;

public final class user_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <title>User</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/Styles/user-list.css\" />\n");
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
      out.write("    <h2>Users List</h2>\n");
      out.write("    <table border=\"1\">\n");
      out.write("        <tr>\n");
      out.write("            <th>ID</th>\n");
      out.write("            <th>Name</th>\n");
      out.write("            <th>City</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Edit</th>\n");
      out.write("            <th>Delete</th>\n");
      out.write("        </tr>\n");
      out.write("        ");

            List<User> users = (List<User>) request.getAttribute("listUsers");
            if (users != null) {
                for (User user : users) {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( user.getId() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( user.getName() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( user.getCity() );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( user.getEmail() );
      out.write("</td>\n");
      out.write("            <td>\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/users/edit?id=");
      out.print( user.getId() );
      out.write("\">\n");
      out.write("                    <i class=\"fas fa-edit\" style=\"color:green;\"></i>\n");
      out.write("                </a>\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/users/delete?id=");
      out.print( user.getId() );
      out.write("\">\n");
      out.write("                    <i class=\"fas fa-trash\" style=\"color:red;\"></i>\n");
      out.write("                </a>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        ");

                }
            } else {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"5\">No users found.</td>\n");
      out.write("        </tr>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("    </table>\n");
      out.write("    <div style=\"text-align: center; margin-top: 20px;\">\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/users/new\" class=\"add-user-button\">\n");
      out.write("            <i class=\"fas fa-plus-circle\"></i> Add User\n");
      out.write("        </a>\n");
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