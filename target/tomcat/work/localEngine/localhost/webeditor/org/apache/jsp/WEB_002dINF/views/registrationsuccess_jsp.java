<<<<<<< HEAD
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrationsuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Web Editor Registration Success</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"by Putnik\">\n");
      out.write("\n");
      out.write("    <!-- Le styles -->\n");
      out.write("    <link href=\"resources/assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <link href=\"resources/assets/css/bootstrap-responsive.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("    <!-- Le fav and touch icons -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"resources/assets/ico/favicon.ico\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"resources/assets/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"resources/assets/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"resources/assets/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"resources/assets/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"navbar navbar-fixed-top\">\n");
      out.write("    <div class=\"navbar-inner\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"brand\" href=\"#\">Web Editor</a>\n");
      out.write("            <div class=\"nav-collapse\">\n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    <li><a href=\"./\">Home</a></li>\n");
      out.write("                    <li><a href=\"about.html\">About</a></li>\n");
      out.write("                    <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                    <li><a href=\"listOfPresentations.html\">List of Presentations</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div><!--/.nav-collapse -->\n");
      out.write("            <ul class=\"nav pull-right\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"loginform.html\">Login</a></li>\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write(" <h3>mail with a unique key to confirm the registration be sent to your e-mail</h3>\n");
      out.write(" <li><a href=\"success.html\">Success!</a></li>\n");
      out.write("</div> <!-- /container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Le javascript\n");
      out.write("================================================== -->\n");
      out.write("<!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("<script src=\"resources/assets/js/jquery.js\"></script>\n");
      out.write("<script src=\"resources/assets/js/bootstrap-transition.js\"></script>\n");
      out.write("<script src=\"resources/assets/js/bootstrap-alert.js\"></script>\n");
      out.write("<script src=\"resources/assets/js/bootstrap-modal.js\"></script>\n");
      out.write("<script src=\"resources/assets/js/bootstrap-dropdown.js\"></script>\n");
      out.write("<script src=\"resources/assets/js/bootstrap-scrollspy.js\"></script>\n");
      out.write("<script src=\"resources/assets/js/bootstrap-tab.js\"></script>\n");
      out.write("<script src=\"resources/assets/js/bootstrap-tooltip.js\"></script>\n");
      out.write("<script src=\"resources/assets/js/bootstrap-popover.js\"></script>\n");
      out.write("<script src=\"resources/assets/js/bootstrap-button.js\"></script>\n");
      out.write("<script src=\"resources/assets/js/bootstrap-collapse.js\"></script>\n");
      out.write("<script src=\"resources/assets/js/bootstrap-carousel.js\"></script>\n");
      out.write("<script src=\"resources/assets/js/bootstrap-typeahead.js\"></script>\n");
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

public final class registrationsuccess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Web Editor Registration Success</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"by Putnik\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Le styles -->\r\n");
      out.write("    <link href=\"resources/assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <link href=\"resources/assets/css/bootstrap-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <!-- Le fav and touch icons -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"resources/assets/ico/favicon.ico\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"resources/assets/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"resources/assets/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"resources/assets/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"resources/assets/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("    <div class=\"navbar-inner\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a class=\"brand\" href=\"#\">Web Editor</a>\r\n");
      out.write("            <div class=\"nav-collapse\">\r\n");
      out.write("                <ul class=\"nav\">\r\n");
      out.write("                    <li><a href=\"./\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"about.html\">About</a></li>\r\n");
      out.write("                    <li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("                    <li><a href=\"listOfPresentations.html\">List of Presentations</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div><!--/.nav-collapse -->\r\n");
      out.write("            <ul class=\"nav pull-right\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"loginform.html\">Login</a></li>\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write(" <h3>mail with a unique key to confirm the registration be sent to your e-mail</h3>\r\n");
      out.write("\r\n");
      out.write("</div> <!-- /container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Le javascript\r\n");
      out.write("================================================== -->\r\n");
      out.write("<!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("<script src=\"resources/assets/js/jquery.js\"></script>\r\n");
      out.write("<script src=\"resources/assets/js/bootstrap-transition.js\"></script>\r\n");
      out.write("<script src=\"resources/assets/js/bootstrap-alert.js\"></script>\r\n");
      out.write("<script src=\"resources/assets/js/bootstrap-modal.js\"></script>\r\n");
      out.write("<script src=\"resources/assets/js/bootstrap-dropdown.js\"></script>\r\n");
      out.write("<script src=\"resources/assets/js/bootstrap-scrollspy.js\"></script>\r\n");
      out.write("<script src=\"resources/assets/js/bootstrap-tab.js\"></script>\r\n");
      out.write("<script src=\"resources/assets/js/bootstrap-tooltip.js\"></script>\r\n");
      out.write("<script src=\"resources/assets/js/bootstrap-popover.js\"></script>\r\n");
      out.write("<script src=\"resources/assets/js/bootstrap-button.js\"></script>\r\n");
      out.write("<script src=\"resources/assets/js/bootstrap-collapse.js\"></script>\r\n");
      out.write("<script src=\"resources/assets/js/bootstrap-carousel.js\"></script>\r\n");
      out.write("<script src=\"resources/assets/js/bootstrap-typeahead.js\"></script>\r\n");
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
