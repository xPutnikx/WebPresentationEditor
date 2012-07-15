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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>Contacts</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"by Putnik\">\n");
      out.write("\n");
      out.write("<!-- Le styles -->\n");
      out.write("<link href=\"resources/assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
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
      out.write("<div class=\"navbar navbar-fixed-top\">\n");
      out.write("\t\t<div class=\"navbar-inner\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<a class=\"btn btn-navbar\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\tdata-target=\".nav-collapse\"> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</a> <a class=\"brand\" href=\"../editor.html\">\n");
      out.write("\t\t\t\t<i class=\"icon-white icon-edit\"></i> Web Editor</a>\n");
      out.write("\t\t\t\t<div class=\"nav-collapse\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"home.html\">\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-white icon-home\"></i> Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"about.html\">\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-white icon-book\"></i> About</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"contact.html\">\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-white icon-pencil\"></i> Contact</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"listOfPresentations.html\">\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-white icon-picture\"></i>\n");
      out.write("\t\t\t\t\t\tList of Presentations</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--/.nav-collapse -->\n");
      out.write("\t\t\t\t<form class=\"navbar-search pull-left\" action=\"\">\n");
      out.write("\t\t\t\t\t<i class=\"icon-white icon-search\"></i><input type=\"text\" class=\"search-query span2\" placeholder=\"Search\">\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t<ul class=\"nav pull-right\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav\">\n");
      out.write("\t\t\t\t\t\t<a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("             \t\t\t <i class=\"icon-user\"></i> Username\n");
      out.write("             \t\t\t <span class=\"caret\"></span>\n");
      out.write("           \t\t\t\t </a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"registrationform.html\">Registration</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"loginform.html\">Login</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"userpage.html\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-cog\"></i> Profile</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"../j_spring_security_logout\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-off\"></i> Logout</a></li>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contactTitleMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h1>\n");
      out.write("\n");
      out.write("\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${controllerMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Le javascript\n");
      out.write("================================================== -->\n");
      out.write("\t<!-- Placed at the end of the document so the pages load faster -->\n");
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
