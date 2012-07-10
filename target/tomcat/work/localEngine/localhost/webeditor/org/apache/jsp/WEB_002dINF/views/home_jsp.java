<<<<<<< HEAD
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>Web Editor Home</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"by Putnik\">\n");
      out.write("\n");
      out.write("<!-- Le styles -->\n");
      out.write("<link href=\"resources/assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"resources/ring/ring.css\" rel=\"stylesheet\">\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("\tpadding-top: 60px;\n");
      out.write("\t/* 60px to make the container go all the way to the bottom of the topbar */\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<link href=\"resources/assets/css/bootstrap-responsive.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("    <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("<!-- Le fav and touch icons -->\n");
      out.write("<link rel=\"shortcut icon\" href=\"resources/assets/ico/favicon.ico\">\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\"\n");
      out.write("\thref=\"resources/assets/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\"\n");
      out.write("\thref=\"resources/assets/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\"\n");
      out.write("\thref=\"resources/assets/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\"\n");
      out.write("\thref=\"resources/assets/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"navbar navbar-fixed-top\">\n");
      out.write("\t\t<div class=\"navbar-inner\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<a class=\"btn btn-navbar\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\tdata-target=\".nav-collapse\"> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</a> <a class=\"brand\" href=\"../editor.html\">Web Editor</a>\n");
      out.write("\t\t\t\t<div class=\"nav-collapse\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav\">\n");
      out.write("\t\t\t\t\t\t<li><a class=\"action\" href=\"#\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"about.html\">About</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"listOfPresentations.html\">List of Presentations</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--/.nav-collapse -->\n");
      out.write("\t\t\t\t <form class=\"navbar-search pull-left\" action=\"\">\n");
      out.write("            <input type=\"text\" class=\"search-query span2\" placeholder=\"Search\">\n");
      out.write("          \t</form>\n");
      out.write("\t\t\t\t<ul class=\"nav pull-right\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"registrationform.html\">Registration</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"loginform.html\">Login</a></li>\t\t\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"../j_spring_security_logout\">Logout</a></li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t<h1>\n");
      out.write("\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${controllerMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<br />\n");
      out.write("\t\t</h1>\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\t<a href=\"list\">Administration Account</a><br>\n");
      out.write("\t\t</p>\n");
      out.write("\t\t <div id=\"item\">\n");
      out.write("\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tagCloud}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("\t\t<li>Development</li>\n");
      out.write("\t\t<li>web</li>\n");
      out.write("\t\t<li>Tutorial</li>\n");
      out.write("\t\t<li>ASP</li>\n");
      out.write("\t\t<li>CSS</li>\n");
      out.write("\t\t<li>Design</li>\n");
      out.write("\t\t<li>Flash</li>\n");
      out.write("\t\t<li>Experimental</li>\n");
      out.write("\t\t<li><a href=registrationform.html>Registration</a></li>\n");
      out.write("\t\t<li><a href=loginform.html>Login</a></li>\n");
      out.write("\t\t<li> </li>\n");
      out.write("\t\t<li><a href=contact.html>Contact</a></li>\n");
      out.write("\t\t<li>3D</li>\n");
      out.write("\t\t<li>Ajax</li>\n");
      out.write("\t\t<li><a href=about.html>About</a></li>\n");
      out.write("\t\t<li>Development</li>\n");
      out.write("\t\t<li>web</li>\n");
      out.write("\t\t<li>Tutorial</li>\n");
      out.write("\t\t<li>ASP</li>\n");
      out.write("\t\t<li>CSS</li>\n");
      out.write("\t\t<li>Design</li>\n");
      out.write("\t\t<li>Flash</li>\n");
      out.write("\t\t<li>Experimental</li>\n");
      out.write("\t\t<li><a href=registrationform.html>Registration</a></li>\n");
      out.write("\t\t<li><a href=loginform.html>Login</a></li>\n");
      out.write("\t\t<li> </li>\n");
      out.write("\t\t<li><a href=contact.html>Contact</a></li>\n");
      out.write("\t\t<li>3D</li>\n");
      out.write("\t\t<li>Ajax</li>\n");
      out.write("\t\t<li><a href=about.html>About</a></li>\n");
      out.write("\t\t<li>Development</li>\n");
      out.write("\t\t<li>web</li>\n");
      out.write("\t\t<li>Tutorial</li>\n");
      out.write("\t\t<li>ASP</li>\n");
      out.write("\t\t<li>CSS</li>\n");
      out.write("\t\t<li>Design</li>\n");
      out.write("\t\t<li>Flash</li>\n");
      out.write("\t\t<li>Experimental</li>\n");
      out.write("\t\t<li><a href=registrationform.html>Registration</a></li>\n");
      out.write("\t\t<li><a href=loginform.html>Login</a></li>\n");
      out.write("\t\t<li> </li>\n");
      out.write("\t\t<li><a href=contact.html>Contact</a></li>\n");
      out.write("\t\t<li>3D</li>\n");
      out.write("\t\t<li>Ajax</li>\n");
      out.write("\t\t<li><a href=about.html>About</a></li>\n");
      out.write("\t</ul>\n");
      out.write("</div>\n");
      out.write("\t</div>\n");
      out.write("\t\t\n");
      out.write("\t<!-- /container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Le javascript\n");
      out.write("================================================== -->\n");
      out.write("\t<!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("\t\n");
      out.write("\t<script src=\"resources/assets/js/jquery.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-transition.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-alert.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-modal.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-dropdown.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-scrollspy.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-tab.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-tooltip.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-popover.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-button.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-collapse.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-carousel.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-typeahead.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"resources/sphere/JQuery.js\"></script>\n");
      out.write("\t<script src=\"resources/sphere/3DEngine.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("\t<script src=\"resources/sphere/Sphere.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t//<![CDATA[\n");
      out.write("\t\t\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\n");
      out.write("\t\t\tvar camera = new Camera3D();\n");
      out.write("\t\t\tcamera.init(0,0,0,300);\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar container = $(\"#item\")\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar item = new Object3D(container);\n");
      out.write("\n");
      out.write("\t\t\titem.addChild(new Sphere(200,10,100));\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar scene = new Scene3D();\n");
      out.write("\t\t\tscene.addToScene(item);\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar mouseX,mouseY = 0;\n");
      out.write("\t\t\tvar offsetX = $(\"#item\").offset().left;\n");
      out.write("\t\t\tvar offsetY = $(\"#item\").offset().top;\n");
      out.write("\t\t\tvar speed = 10000;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$().mousemove(function(e){\n");
      out.write("\t\t\t\tmouseX = e.clientX - offsetX - (container.width() / 2);\n");
      out.write("\t\t\t\tmouseY = e.clientY - offsetY - (container.height() / 2);\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar animateIt = function(){\n");
      out.write("\t\t\t\tif (mouseX != undefined){\n");
      out.write("\t\t\t\t\taxisRotation.y += (mouseX) / speed\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif (mouseY != undefined){\n");
      out.write("\t\t\t\t\taxisRotation.x -= mouseY / speed;\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\tscene.renderCamera(camera);\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t};\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tsetInterval(animateIt, 20);\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t\t//]]>\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
=======
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Web Editor Home</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"by Putnik\">\r\n");
      out.write("\r\n");
      out.write("<!-- Le styles -->\r\n");
      out.write("<link href=\"resources/assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"resources/ring/ring.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tpadding-top: 60px;\r\n");
      out.write("\t/* 60px to make the container go all the way to the bottom of the topbar */\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"resources/assets/css/bootstrap-responsive.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!-- Le fav and touch icons -->\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"resources/assets/ico/favicon.ico\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\"\r\n");
      out.write("\thref=\"resources/assets/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\"\r\n");
      out.write("\thref=\"resources/assets/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\"\r\n");
      out.write("\thref=\"resources/assets/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\"\r\n");
      out.write("\thref=\"resources/assets/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("\t\t<div class=\"navbar-inner\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<a class=\"btn btn-navbar\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\tdata-target=\".nav-collapse\"> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</a> <a class=\"brand\" href=\"../editor.html\">Web Editor</a>\r\n");
      out.write("\t\t\t\t<div class=\"nav-collapse\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"action\" href=\"#\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"about.html\">About</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"listOfPresentations.html\">List of Presentations</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--/.nav-collapse -->\r\n");
      out.write("\t\t\t\t <form class=\"navbar-search pull-left\" action=\"\">\r\n");
      out.write("            <input type=\"text\" class=\"search-query span2\" placeholder=\"Search\">\r\n");
      out.write("          \t</form>\r\n");
      out.write("\t\t\t\t<ul class=\"nav pull-right\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"registrationform.html\">Registration</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"loginform.html\">Login</a></li>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"../j_spring_security_logout\">Logout</a></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<h1>\r\n");
      out.write("\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${controllerMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<br />\r\n");
      out.write("\t\t</h1>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<a href=\"list\">Administration Account</a><br>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tagCloud}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t<!-- /container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Le javascript\r\n");
      out.write("================================================== -->\r\n");
      out.write("\t<!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"resources/ring/jquery-1.3.2.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/ring/3DEngine.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t<script src=\"resources/ring/Ring.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t<script src=\"resources/ring/virtual.js\" type=\"text/javascript\" charset=\"utf-8\"> </script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-transition.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-alert.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-modal.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-dropdown.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-scrollspy.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-tab.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-tooltip.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-popover.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-button.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-collapse.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-carousel.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-typeahead.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
>>>>>>> reorganize DB
