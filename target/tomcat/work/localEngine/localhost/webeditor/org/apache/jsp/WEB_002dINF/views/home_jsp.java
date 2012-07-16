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
      out.write("<link href=\"resources/assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"resources/ring/ring.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tpadding-top: 60px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"resources/assets/css/bootstrap-responsive.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
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
      out.write("\t\t\t\t</a> <a class=\"brand\" href=\"../editor.html\">\r\n");
      out.write("\t\t\t\t<i class=\"icon-white icon-edit\"></i> Web Editor</a>\r\n");
      out.write("\t\t\t\t<div class=\"nav-collapse\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-white icon-home\"></i> Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"about.html\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-white icon-book\"></i> About</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-white icon-pencil\"></i> Contact</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"listOfPresentations.html\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-white icon-picture\"></i>\r\n");
      out.write("\t\t\t\t\t\tList of Presentations</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--/.nav-collapse -->\r\n");
      out.write("\t\t\t\t<form class=\"navbar-search pull-left\" action=\"\">\r\n");
      out.write("\t\t\t\t\t<i class=\"icon-white icon-search\"></i><input type=\"text\" class=\"search-query span2\" placeholder=\"Search\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<ul class=\"nav pull-right\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\r\n");
      out.write("             \t\t\t <i class=\"icon-user\"></i> Account\r\n");
      out.write("             \t\t\t <span class=\"caret\"></span>\r\n");
      out.write("           \t\t\t\t </a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"registrationform.html\">Registration</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"loginform.html\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"userpage.html\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-cog\"></i> Profile</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"disabled\"><a href=\"../j_spring_security_logout\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-off\"></i> Logout</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\r\n");
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
      out.write("\t\t\t\r\n");
      out.write("\t\t<div id=\"item\">\r\n");
      out.write("\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tagCloud}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t<li>Development</li>\r\n");
      out.write("\t\t\t<li>ShavrtzMesser</li>\r\n");
      out.write("\t\t\t<li>web</li>\r\n");
      out.write("\t\t\t<li>Tutorial</li>\r\n");
      out.write("\t\t\t<li>ASP</li>\r\n");
      out.write("\t\t\t<li>CSS</li>\r\n");
      out.write("\t\t\t<li>Design</li>\r\n");
      out.write("\t\t\t<li>Flash</li>\r\n");
      out.write("\t\t\t<li>Experimental</li>\r\n");
      out.write("\t\t\t<li><a href=registrationform.html>Registration</a></li>\r\n");
      out.write("\t\t\t<li><a href=loginform.html>Login</a></li>\r\n");
      out.write("\t\t\t<li></li>\r\n");
      out.write("\t\t\t<li><a href=contact.html>Contact</a></li>\r\n");
      out.write("\t\t\t<li>3D</li>\r\n");
      out.write("\t\t\t<li>Ajax</li>\r\n");
      out.write("\t\t\t<li><a href=about.html>About</a></li>\r\n");
      out.write("\t\t\t<li>Development</li>\r\n");
      out.write("\t\t\t<li>web</li>\r\n");
      out.write("\t\t\t<li>Tutorial</li>\r\n");
      out.write("\t\t\t<li>ASP</li>\r\n");
      out.write("\t\t\t<li>CSS</li>\r\n");
      out.write("\t\t\t<li>Design</li>\r\n");
      out.write("\t\t\t<li>Flash</li>\r\n");
      out.write("\t\t\t<li>Experimental</li>\r\n");
      out.write("\t\t\t<li><a href=registrationform.html>Registration</a></li>\r\n");
      out.write("\t\t\t<li><a href=loginform.html>Login</a></li>\r\n");
      out.write("\t\t\t<li></li>\r\n");
      out.write("\t\t\t<li><a href=contact.html>Contact</a></li>\r\n");
      out.write("\t\t\t<li>3D</li>\r\n");
      out.write("\t\t\t<li>Ajax</li>\r\n");
      out.write("\t\t\t<li><a href=about.html>About</a></li>\r\n");
      out.write("\t\t\t<li>Development</li>\r\n");
      out.write("\t\t\t<li>web</li>\r\n");
      out.write("\t\t\t<li>Tutorial</li>\r\n");
      out.write("\t\t\t<li>ASP</li>\r\n");
      out.write("\t\t\t<li>CSS</li>\r\n");
      out.write("\t\t\t<li>Design</li>\r\n");
      out.write("\t\t\t<li>Flash</li>\r\n");
      out.write("\t\t\t<li>Experimental</li>\r\n");
      out.write("\t\t\t<li><a href=registrationform.html>Registration</a></li>\r\n");
      out.write("\t\t\t<li><a href=loginform.html>Login</a></li>\r\n");
      out.write("\t\t\t<li></li>\r\n");
      out.write("\t\t\t<li><a href=contact.html>Contact</a></li>\r\n");
      out.write("\t\t\t<li>3D</li>\r\n");
      out.write("\t\t\t<li>Ajax</li>\r\n");
      out.write("\t\t\t<li><a href=about.html>About</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Le javascript\r\n");
      out.write("================================================== -->\r\n");
      out.write("\t<!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"resources/assets/js/jquery.js\"></script>\r\n");
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
      out.write("\t<script type=\"text/javascript\" src=\"resources/sphere/JQuery.js\"></script>\r\n");
      out.write("\t<script src=\"resources/sphere/3DEngine.js\" type=\"text/javascript\"\r\n");
      out.write("\t\tcharset=\"utf-8\"></script>\r\n");
      out.write("\t<script src=\"resources/sphere/Sphere.js\" type=\"text/javascript\"\r\n");
      out.write("\t\tcharset=\"utf-8\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t//<![CDATA[\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar camera = new Camera3D();\r\n");
      out.write("\t\t\tcamera.init(0,0,0,300);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar container = $(\"#item\")\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar item = new Object3D(container);\r\n");
      out.write("\r\n");
      out.write("\t\t\titem.addChild(new Sphere(200,10,100));\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar scene = new Scene3D();\r\n");
      out.write("\t\t\tscene.addToScene(item);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar mouseX,mouseY = 0;\r\n");
      out.write("\t\t\tvar offsetX = $(\"#item\").offset().left;\r\n");
      out.write("\t\t\tvar offsetY = $(\"#item\").offset().top;\r\n");
      out.write("\t\t\tvar speed = 20000;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$().mousemove(function(e){\r\n");
      out.write("\t\t\t\tmouseX = e.clientX - offsetX - (container.width() / 2);\r\n");
      out.write("\t\t\t\tmouseY = e.clientY - offsetY - (container.height() / 2);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar animateIt = function(){\r\n");
      out.write("\t\t\t\tif (mouseX != undefined){\r\n");
      out.write("\t\t\t\t\taxisRotation.y += (mouseX) / speed\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif (mouseY != undefined){\r\n");
      out.write("\t\t\t\t\taxisRotation.x -= mouseY / speed;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tscene.renderCamera(camera);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tsetInterval(animateIt, 20);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t//]]>\r\n");
      out.write("\t</script>\r\n");
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
