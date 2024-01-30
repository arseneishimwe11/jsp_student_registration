/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.18
 * Generated at: 2024-01-30 10:20:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\"/>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\"/>\r\n");
      out.write("        <title>Student Registration</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./resources/fonts/material-icon/css/material-design-iconic-font.min.css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./resources/css/style.css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("        <!-- Sign up form -->\r\n");
      out.write("            <section class=\"signup\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"signup-content\">\r\n");
      out.write("                        <div class=\"signup-form\">\r\n");
      out.write("                            <h2 class=\"form-title\">Sign up</h2>\r\n");
      out.write("                            <form method=\"post\" action=\"register.xqa\" class=\"register-form\" id=\"register-form\" accept-charset=\"UTF-8\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"code\">\r\n");
      out.write("                                        <i class=\"zmdi zmdi-email\"></i>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <input\r\n");
      out.write("                                            type=\"number\"\r\n");
      out.write("                                            name=\"code\"\r\n");
      out.write("                                            id=\"code\"\r\n");
      out.write("                                            placeholder=\"Your Student Code\" required/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"name\">\r\n");
      out.write("                                        <i class=\"zmdi zmdi-account material-icons-name\"></i>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <input\r\n");
      out.write("                                            type=\"text\"\r\n");
      out.write("                                            name=\"name\"\r\n");
      out.write("                                            id=\"name\"\r\n");
      out.write("                                            placeholder=\"Your Name\" required/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"email\"><i class=\"zmdi zmdi-email\"></i></label>\r\n");
      out.write("                                    <input\r\n");
      out.write("                                            type=\"email\"\r\n");
      out.write("                                            name=\"email\"\r\n");
      out.write("                                            id=\"email\"\r\n");
      out.write("                                            placeholder=\"Your Email\" required/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"date\">\r\n");
      out.write("                                        <i class=\"zmdi zmdi-lock-outline\"></i>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <input\r\n");
      out.write("                                            type=\"date\"\r\n");
      out.write("                                            name=\"date\"\r\n");
      out.write("                                            id=\"date\"\r\n");
      out.write("                                            placeholder=\"Dob\" required/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"grade\">\r\n");
      out.write("                                        <i class=\"zmdi zmdi-lock-outline\"></i>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <input\r\n");
      out.write("                                            type=\"number\"\r\n");
      out.write("                                            name=\"grade\"\r\n");
      out.write("                                            id=\"grade\"\r\n");
      out.write("                                            placeholder=\"Grade\" required/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"pass\"><i class=\"zmdi zmdi-lock\"></i></label>\r\n");
      out.write("                                    <input\r\n");
      out.write("                                            type=\"password\"\r\n");
      out.write("                                            name=\"pass\"\r\n");
      out.write("                                            id=\"pass\"\r\n");
      out.write("                                            placeholder=\"Password\" required/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"re-pass\">\r\n");
      out.write("                                        <i class=\"zmdi zmdi-lock-outline\"></i>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <input\r\n");
      out.write("                                            type=\"password\"\r\n");
      out.write("                                            name=\"re_pass\"\r\n");
      out.write("                                            id=\"re_pass\"\r\n");
      out.write("                                            placeholder=\"Repeat your password\" required/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input\r\n");
      out.write("                                            type=\"checkbox\"\r\n");
      out.write("                                            name=\"agree-term\"\r\n");
      out.write("                                            id=\"agree-term\"\r\n");
      out.write("                                            class=\"agree-term\"/>\r\n");
      out.write("                                    <label for=\"agree-term\" class=\"label-agree-term\">\r\n");
      out.write("                                        <span><span></span></span>Remember me\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group form-button\">\r\n");
      out.write("                                    <input\r\n");
      out.write("                                            type=\"submit\"\r\n");
      out.write("                                            name=\"signup\"\r\n");
      out.write("                                            id=\"signup\"\r\n");
      out.write("                                            class=\"form-submit\"\r\n");
      out.write("                                            value=\"Register\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"signup-image\">\r\n");
      out.write("                            <figure>\r\n");
      out.write("                                <img src=\"./resources/images/signup-image.jpg\" alt=\"sing up image\"/>\r\n");
      out.write("                            </figure>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("        </div>\r\n");
      out.write("    <!-- <script src=\"vendor/jquery/jquery.min.js\"></script> -->\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
