/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-09-11 09:02:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.gallery;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.sp.springapp.domain.GalleryImg;
import java.util.List;
import org.sp.springapp.domain.Gallery;
import org.sp.springapp.util.Pager;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/gallery/inc/head_link.jsp", Long.valueOf(1694421243966L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.sp.springapp.domain.GalleryImg");
    _jspx_imports_classes.add("org.sp.springapp.util.Pager");
    _jspx_imports_classes.add("org.sp.springapp.domain.Gallery");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

	Pager pager=(Pager)request.getAttribute("pager");
	List<Gallery> galleryList=(List)request.getAttribute("galleryList");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&display=swap\" rel=\"stylesheet\">\n");
      out.write("<style>\n");
      out.write("table {\n");
      out.write("	border-collapse: collapse;\n");
      out.write("	border-spacing: 0;\n");
      out.write("	width: 100%;\n");
      out.write("	border: 1px solid #ddd;\n");
      out.write("	font-family: 'IBM Plex Sans KR', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("th, td {\n");
      out.write("	text-align: left;\n");
      out.write("	padding: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("	background-color: #ffffff;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr[id=first]{\n");
      out.write("	background-color: #ffffff;\n");
      out.write("	border: 1px solid #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr[id=second]{\n");
      out.write("	background-color: #ffffff;\n");
      out.write("	border: 1px solid #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("td[id=title]{\n");
      out.write("	font-weight :650;\n");
      out.write("	font-size:17px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("a{\n");
      out.write("	text-decoration: none;\n");
      out.write("	color: #0123b4;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("input[type=button] {\n");
      out.write("  background-color: #0123b4;\n");
      out.write("  color: white;\n");
      out.write("  padding: 10px 23px;\n");
      out.write("  border: none;\n");
      out.write("  border-radius: 7px;\n");
      out.write("  margin-right : 2px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-family: 'IBM Plex Sans KR', sans-serif;\n");
      out.write("  position: relative;\n");
      out.write("  right:-1360px;\n");
      out.write("  top: -30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=button]:hover {\n");
      out.write("  background-color: #1876fb;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2{\n");
      out.write("	font-family: 'IBM Plex Sans KR', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".pagination {\n");
      out.write("	display: inline-block;\n");
      out.write("	position: relative;\n");
      out.write("	left:670px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".pagination a {\n");
      out.write("	color: 0123b4;\n");
      out.write("	float: left;\n");
      out.write("	padding: 8px 16px;\n");
      out.write("	text-decoration: none;\n");
      out.write("	transition: background-color .3s;\n");
      out.write("	border: 1px solid #ddd;\n");
      out.write("	font-family: 'IBM Plex Sans KR', sans-serif;\n");
      out.write("	font-weight: 300px;\n");
      out.write("	margin-left: auto;\n");
      out.write("	margin-right: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".pagination a.active {\n");
      out.write("	background-color: #4CAF50;\n");
      out.write("	color: white;\n");
      out.write("	border: 1px solid #4CAF50;\n");
      out.write("	\n");
      out.write("}\n");
      out.write("\n");
      out.write(".pagination a:hover:not(.active) {\n");
      out.write("	background-color: #dfeef3;\n");
      out.write("	\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js\"></script>");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function() {\n");
      out.write("	$(\"#bt_write\").click(function() {\n");
      out.write("		location.href=\"/gallery/registform\";\n");
      out.write("	});\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("	<h2>게시판</h2>\n");
      out.write("	<p></p>\n");
      out.write("\n");
      out.write("	<table>\n");
      out.write("		<tr id=\"first\">\n");
      out.write("			<th>No</th>\n");
      out.write("			<th>이미지</th>\n");
      out.write("			<th>제목</th>\n");
      out.write("			<th>작성자</th>\n");
      out.write("			<th>등록일</th>\n");
      out.write("			<th>조회수</th>\n");
      out.write("		</tr>\n");
      out.write("		");
int num=pager.getNum(); 
      out.write('\n');
      out.write('	');
      out.write('	');
int curPos=pager.getCurPos(); //페이지당 List의 시작 index 
      out.write(" \n");
      out.write("		");
      out.print(curPos );
      out.write('\n');
      out.write('	');
      out.write('	');
for(int i=1;i<=pager.getPageSize();i++){ 
      out.write('\n');
      out.write('	');
      out.write('	');
if(num<1)break; 
      out.write('\n');
      out.write('	');
      out.write('	');
Gallery gallery=galleryList.get(curPos++); 
      out.write('\n');
      out.write('	');
      out.write('	');
GalleryImg galleryImg=gallery.getGalleryImgList().get(0); 
      out.write("\n");
      out.write("		\n");
      out.write("		<tr id=\"second\">\n");
      out.write("			<td id=\"num\">");
      out.print(num-- );
      out.write("</td>\n");
      out.write("			<td><img src=\"/static/data/");
      out.print(galleryImg.getFilename() );
      out.write("\" width=\"75px\"></td>\n");
      out.write("			<td id=\"title\"><a href=\"/gallery/content?gallery_idx=");
      out.print(gallery.getGallery_idx());
      out.write('"');
      out.write('>');
      out.print(gallery.getTitle() );
      out.write("</a></td>\n");
      out.write("			<td>");
      out.print(gallery.getWriter() );
      out.write("</td>\n");
      out.write("			<td>");
      out.print(gallery.getRegdate() );
      out.write("</td>\n");
      out.write("			<td>");
      out.print(gallery.getHit() );
      out.write("</td>\n");
      out.write("		</tr>\n");
      out.write("		");
} 
      out.write("\n");
      out.write("		\n");
      out.write("		<tr class=\"pagination\">\n");
      out.write("			<td colspan=\"6\">\n");
      out.write("			<br>\n");
      out.write("			");
if(pager.getFirstPage()-1<1){ 
      out.write("\n");
      out.write("				<a href=\"javascript:alert('이전 페이지가 없습니다');\">&laquo;</a>\n");
      out.write("			");
}else{ 
      out.write("\n");
      out.write("				<a href=\"/gallery/list?currentPage=");
      out.print(pager.getFirstPage()-1 );
      out.write("\">&laquo;</a>\n");
      out.write("			");
} 
      out.write("\n");
      out.write("				\n");
      out.write("			");
for(int i=pager.getFirstPage();i<=pager.getLastPage();i++){ 
      out.write("\n");
      out.write("				");
if(i>pager.getTotalPage())break; 
      out.write("\n");
      out.write("				<a href=\"/gallery/list?currentPage=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i );
      out.write("</a>\n");
      out.write("			");
} 
      out.write("\n");
      out.write("			\n");
      out.write("			");
if(pager.getLastPage()>pager.getTotalPage()){ 
      out.write("\n");
      out.write("				<a href=\"javascript:alert('다음 페이지가 없습니다');\">&raquo;</a>\n");
      out.write("			");
}else{ 
      out.write("\n");
      out.write("				<a href=\"/gallery/list?currentPage=");
      out.print(pager.getLastPage()+1 );
      out.write("\">&raquo;</a>\n");
      out.write("			");
} 
      out.write("\n");
      out.write("			</td>\n");
      out.write("		</tr>\n");
      out.write("			\n");
      out.write("		<tr>\n");
      out.write("			<td colspan=\"6\">		\n");
      out.write("			<input type=\"button\" id=\"bt_write\" value=\"글쓰기\">\n");
      out.write("			</td>\n");
      out.write("		</tr>\n");
      out.write("	</table>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
