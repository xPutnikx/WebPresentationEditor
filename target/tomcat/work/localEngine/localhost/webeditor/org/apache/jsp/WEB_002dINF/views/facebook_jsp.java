package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class facebook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>fb</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"by Putnik\">\r\n");
      out.write("<link href=\"resources/assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("    padding-top: 60px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<style>\r\n");
      out.write("a {\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"resources/assets/css/bootstrap-responsive.css\"\r\n");
      out.write("    rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"resources/assets/ico/favicon.ico\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\"\r\n");
      out.write("    href=\"resources/assets/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\"\r\n");
      out.write("    href=\"resources/assets/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\"\r\n");
      out.write("    href=\"resources/assets/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\"\r\n");
      out.write("    href=\"resources/assets/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"fb-root\"></div>\r\n");
      out.write("<script>(function(d, s, id) {\r\n");
      out.write("  var js, fjs = d.getElementsByTagName(s)[0];\r\n");
      out.write("  if (d.getElementById(id)) return;\r\n");
      out.write("  js = d.createElement(s); js.id = id;\r\n");
      out.write("  js.src = \"//connect.facebook.net/en_US/all.js#xfbml=1&appId=330866890335618\";\r\n");
      out.write("  fjs.parentNode.insertBefore(js, fjs);\r\n");
      out.write("}(document, 'script', 'facebook-jssdk'));</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("    <div class=\"navbar-inner\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <a class=\"btn btn-navbar\" data-toggle=\"collapse\"\r\n");
      out.write("                data-target=\".nav-collapse\"> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("                class=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\r\n");
      out.write("            </a> <a class=\"brand\" href=\"../editor.html\"> <i\r\n");
      out.write("                class=\"icon-white icon-edit\"></i> Web editor\r\n");
      out.write("            </a>\r\n");
      out.write("            <div class=\"nav-collapse\">\r\n");
      out.write("                <ul class=\"nav\">\r\n");
      out.write("                    <li><a href=\"home\"> <i class=\"icon-white icon-home\"></i>\r\n");
      out.write("                            Home\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li class=\"active\"><a href=\"#\"> <i\r\n");
      out.write("                            class=\"icon-white icon-book\"></i> About\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a href=\"contact\"> <i class=\"icon-white icon-pencil\"></i>\r\n");
      out.write("                            Contact\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a href=\"listOfPresentations\"> <i\r\n");
      out.write("                            class=\"icon-white icon-picture\"></i> List of Presentations\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a class=\"btn dropdown-toggle \" data-toggle=\"dropdown\" data-option=\"shapes\" style=\"background-color:rgba(142, 241, 35, 0.73)\">\r\n");
      out.write("                    <i class=\"icon-star\"></i>Shapes <span class=\"caret\"></span></a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a onclick=\"rectangle()\">Rectangle</a></li>\r\n");
      out.write("                        <li><a onclick=\"elipse()\">Elipse</a></li>\r\n");
      out.write("                        <li><a onclick=\"poligon()\">Poligon</a></li>\r\n");
      out.write("                        <li><a onclick=\"line()\">Line</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <form class=\"navbar-search pull-left\" action=\"\">\r\n");
      out.write("            <i class=\"icon-white icon-search\"></i><input type=\"text\"\r\n");
      out.write("                class=\"search-query span2\" placeholder=\"Search\">\r\n");
      out.write("        </form>\r\n");
      out.write("        <ul class=\"nav pull-right\">\r\n");
      out.write("            <ul class=\"nav\">\r\n");
      out.write("                <a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\"> <i\r\n");
      out.write("                    class=\"icon-user\"></i> Account <span class=\"caret\"></span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"dropdown-menu\">\r\n");
      out.write("                    <li><a href=\"registrationform\">Registration</a></li>\r\n");
      out.write("                    <li><a href=\"loginform\">Login</a></li>\r\n");
      out.write("                    <li><a href=\"userpage\"> <i class=\"icon-cog\"></i> Profile\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a href=\"../j_spring_security_logout\"> <i\r\n");
      out.write("                            class=\"icon-off\"></i> Logout\r\n");
      out.write("                    </a></li>\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\" style=\"margin-top: 20px;\">\r\n");
      out.write("    <h1>fb</h1>\r\n");
      out.write("    <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${controllerMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("    <div class=\"fb-like\" data-href=\"http://localhost:8080/webeditor/social/facebook\" data-send=\"true\" data-width=\"450\" data-show-faces=\"true\"></div>\r\n");
      out.write("    <div class=\"fb-login-button\" data-show-faces=\"true\" data-width=\"200\" data-max-rows=\"1\"></div>\r\n");
      out.write("    <iframe src=\"https://www.facebook.com/plugins/registration?\r\n");
      out.write("             client_id=113869198637480&\r\n");
      out.write("             redirect_uri=https%3A%2F%2Fdevelopers.facebook.com%2Ftools%2Fecho%2F&\r\n");
      out.write("             fields=name,birthday,gender,location,email\"\r\n");
      out.write("        scrolling=\"auto\"\r\n");
      out.write("        frameborder=\"no\"\r\n");
      out.write("        style=\"border:none\"\r\n");
      out.write("        allowTransparency=\"true\"\r\n");
      out.write("        width=\"100%\"\r\n");
      out.write("        height=\"330\">\r\n");
      out.write("</iframe>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<canvas id='draw'></canvas>\r\n");
      out.write("<script src=\"resources/processing.js\"></script>\r\n");
      out.write("<script src=\"resources/processing-api.js\"></script>\r\n");
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
