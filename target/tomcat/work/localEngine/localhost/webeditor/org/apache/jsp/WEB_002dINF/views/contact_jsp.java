package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Contacts</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"by Putnik\">\r\n");
      out.write("<link href=\"resources/assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tpadding-top: 60px;\r\n");
      out.write("\t/* 60px to make the container go all the way to the bottom of the topbar */\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<style>\r\n");
      out.write("   a { \r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("   } \r\n");
      out.write("  </style>\r\n");
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
      out.write("<body>\r\n");
      out.write("\t<div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("\t\t<div class=\"navbar-inner\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<a class=\"btn btn-navbar\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\tdata-target=\".nav-collapse\"> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</a> <a class=\"brand\" href=\"../editor.html\"> <i\r\n");
      out.write("\t\t\t\t\tclass=\"icon-white icon-edit\"></i> Web Editor\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<div class=\"nav-collapse\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"home\"> <i class=\"icon-white icon-home\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\tHome\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"about\"> <i class=\"icon-white icon-book\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\tAbout\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"contact\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"icon-white icon-pencil\"></i> Contact\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"listOfPresentations\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"icon-white icon-picture\"></i> List of Presentations\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<form class=\"navbar-search pull-left\" action=\"\">\r\n");
      out.write("\t\t\t\t\t<i class=\"icon-white icon-search\"></i><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"search-query span2\" placeholder=\"Search\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<ul class=\"nav pull-right\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\" >\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-user\"></i> Account <span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"registrationform\">Registration</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"loginform\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"userpage\"> <i class=\"icon-cog\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tProfile\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"../j_spring_security_logout\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"icon-off\"></i> Logout\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"container\" style=\"margin-top: 20px;\">\r\n");
      out.write("\t\t<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contactTitleMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h1>\r\n");
      out.write("\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${controllerMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
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
