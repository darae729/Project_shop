/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-09-11 09:02:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.gallery;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.sp.springapp.domain.GalleryImg;
import org.sp.springapp.domain.Gallery;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("org.sp.springapp.domain.GalleryImg");
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

      out.write('\n');
      out.write('\n');
      out.write('\n');

	Gallery gallery = (Gallery)request.getAttribute("gallery");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&display=swap\" rel=\"stylesheet\">\n");
      out.write("<style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("input[type=text], select, textarea {\n");
      out.write("  width: 100%;\n");
      out.write("  padding: 12px;\n");
      out.write("  border: 1px solid #ccc;\n");
      out.write("  border-radius: 4px;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  margin-top: 6px;\n");
      out.write("  margin-bottom: 16px;\n");
      out.write("  resize: vertical;\n");
      out.write("}\n");
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
      out.write("}\n");
      out.write("\n");
      out.write("input[type=button]:hover {\n");
      out.write("  background-color: #1876fb;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-color: #ffffff;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2{\n");
      out.write("	font-family: 'IBM Plex Sans KR', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js\"></script>");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function regist() {\n");
      out.write("	$(\"form\").attr({\n");
      out.write("		action:\"/gallery/regist\",\n");
      out.write("		method:\"post\",\n");
      out.write("		enctype:\"multipart/form-data\"\n");
      out.write("	});\n");
      out.write("	\n");
      out.write("	$(\"form\").submit();\n");
      out.write("	\n");
      out.write("}\n");
      out.write("\n");
      out.write("$(function() {\n");
      out.write("	$(\"#bt_edit\").click(function() {\n");
      out.write("		\n");
      out.write("	});\n");
      out.write("\n");
      out.write("	$(\"#bt_del\").click(function() {\n");
      out.write("		if(confirm(\"삭제하시겠습니까?\")){\n");
      out.write("			//삭제요청 시 form 태그 안에 작성된 파라미터들을 한꺼번에 전송하자\n");
      out.write("			$(\"form\").attr({\n");
      out.write("				action:\"/gallery/delete\",\n");
      out.write("				method:\"post\"\n");
      out.write("			});\n");
      out.write("			$(\"form\").submit();\n");
      out.write("		}			\n");
      out.write("	});\n");
      out.write("		\n");
      out.write("	$(\"#bt_list\").click(function() {\n");
      out.write("		location.href=\"/gallery/list\";\n");
      out.write("		\n");
      out.write("	});\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2>상세내용</h2>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <form>\n");
      out.write("  	<input type=\"hidden\" name=\"gallery_idx\" value=\"");
      out.print(gallery.getGallery_idx() );
      out.write("\">\n");
      out.write("  	\n");
      out.write("  	\n");
      out.write("    <input type=\"text\" name=\"title\" value=\"");
      out.print(gallery.getTitle());
      out.write("\">\n");
      out.write("    <input type=\"text\" name=\"writer\" value=\"");
      out.print(gallery.getWriter());
      out.write("\">\n");
      out.write("    <textarea id=\"content\" name=\"content\" style=\"height:200px\">");
      out.print(gallery.getContent());
      out.write("</textarea>\n");
      out.write("	");
for(int i=0;i<gallery.getGalleryImgList().size();i++){ 
      out.write('\n');
      out.write('	');
GalleryImg galleryImg=gallery.getGalleryImgList().get(i); 
      out.write("\n");
      out.write("	<input type=\"hidden\" name=\"filename\" value=\"");
      out.print(galleryImg.getFilename());
      out.write("\">\n");
      out.write("		<p>\n");
      out.write("			<img src=\"/static/data/");
      out.print(galleryImg.getFilename() );
      out.write("\" width=\"150px\">\n");
      out.write("		</p>\n");
      out.write("	");
} 
      out.write("\n");
      out.write("	\n");
      out.write("    <input type=\"file\" name=\"photo\">\n");
      out.write("    <br><p>\n");
      out.write("    <input type=\"file\" name=\"photo\">\n");
      out.write("    <p><br>\n");
      out.write("    <input type=\"button\" value=\"수정\" id=\"bt_edit\">\n");
      out.write("    <input type=\"button\" value=\"삭제\" id=\"bt_del\">\n");
      out.write("    <input type=\"button\" value=\"목록\" id=\"bt_list\">\n");
      out.write("  </form>\n");
      out.write("</div>\n");
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
