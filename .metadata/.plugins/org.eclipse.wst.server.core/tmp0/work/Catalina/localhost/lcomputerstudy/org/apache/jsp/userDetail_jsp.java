/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-09-20 05:31:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class userDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/db_connection.jsp", Long.valueOf(1600391425264L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF8\">\r\n");
      out.write("<title>회원 상세</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("\ttable {\r\n");
      out.write("\t\tborder-collapse:collapse;\r\n");
      out.write("\t}\r\n");
      out.write("\ttable tr th {\r\n");
      out.write("\t\tfont-weight:700;\r\n");
      out.write("\t}\r\n");
      out.write("\ttable tr td, table tr th{\r\n");
      out.write("\t\tborder:1px solid #818181;\r\n");
      out.write("\t\twidth:200px;\r\n");
      out.write("\t\ttext-align:center;\r\n");
      out.write("\t}\r\n");
      out.write("\ta{\r\n");
      out.write("\t  text-decoration:none;\r\n");
      out.write("\t  color:#000;\r\n");
      out.write("\t  font-weight:700;\r\n");
      out.write("\t\t   \t  border:none;\r\n");
      out.write("   \t  cursor:pointer;\r\n");
      out.write("   \t  padding:10px;\r\n");
      out.write("   \t  display:inline-block;\r\n");
      out.write("\t}\t\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Connection conn = null;
	String url = "jdbc:mysql://localhost:3306/yyy";
	String user ="root";
	String dbPassword="1234";
	
	Class.forName("org.mariadb.jdbc.Driver");
	conn =  DriverManager.getConnection(url, user, dbPassword);



      out.write("\r\n");
      out.write("\t<h1>회원 상세페이지</h1>\r\n");
      out.write("\t<table>\r\n");
      out.write("\t");

		String idx = request.getParameter("u_idx");
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "select * from user where u_idx=?";
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, idx);
	
		rs = pstmt.executeQuery();
		
		while(rs.next()){
			String u_idx = rs.getString("u_idx");
			String u_id = rs.getString("u_id");
			String u_name = rs.getString("u_name");
			String u_tel = rs.getString("u_tel");
			String u_age = rs.getString("u_age");
	
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t\t<td>회원 번호</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(u_idx );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>회원 ID</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(u_id );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>회원 이름</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(u_name );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>회원 전화번호</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(u_tel );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>회원 나이</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(u_age );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr style=\"height:50px;\">\r\n");
      out.write("\t\t\t<td style=\"border:none;\">\r\n");
      out.write("\t\t\t\t<a href=\"userEdit.jsp?u_idx=");
      out.print(u_idx);
      out.write("\" \r\n");
      out.write("\t\t\t\tstyle=\"width:70%;font-weight:700;background-color:#818181;color:#fff;\">수정 </a>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td style=\"border:none;\">\r\n");
      out.write("\t\t\t\t<a href=\"userDelete.jsp?u_idx=");
      out.print(u_idx );
      out.write("\" \r\n");
      out.write("\t\t\t\tstyle=\"width:70%;font-weight:700;background-color:red;color:#fff;\">삭제</a>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
