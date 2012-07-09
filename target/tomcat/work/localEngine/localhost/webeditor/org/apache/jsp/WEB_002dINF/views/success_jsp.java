package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>About</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"by Putnik\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Le styles -->\r\n");
      out.write("    <link href=\"resources/assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("    <style type=\"text/css\" media=\"screen\">\r\n");
      out.write("\t\t\t#item{\r\n");
      out.write("\t\t\t\twidth:100px;\r\n");
      out.write("\t\t\t\theight:100px;\r\n");
      out.write("\t\t\t\tmargin:0 auto;\r\n");
      out.write("\t\t\t\ttop:300px;\r\n");
      out.write("\t\t\t\tposition: relative;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tul{\r\n");
      out.write("\t\t\t\tlist-style-type: none;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tbody{\r\n");
      out.write("\t\t\t\tbackground-color: transparent;\r\n");
      out.write("\t\t\t\tcolor: #69c;\r\n");
      out.write("\t\t\t\tfont-family: Arial, \"MS Trebuchet\", sans-serif;\r\n");
      out.write("\t\t\t\tfont-weight: bold;\r\n");
      out.write("\t\t\t\tfont-size:2em;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
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
      out.write("            <div class=\"nav-collapse\">\r\n");
      out.write("                <ul class=\"nav\">\r\n");
      out.write("                    <li><a href=\"http://oboobs.ru/\">HOME</a></li>\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div><!--/.nav-collapse -->\r\n");
      out.write("          <ul class=\"nav pull-right\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("  \t\t<div id=\"item\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06202.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06203.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06204.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06205.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06206.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06207.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06208.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06209.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06210.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06211.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06212.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06213.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06214.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06215.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06216.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06217.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06218.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06219.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06220.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06221.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06222.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06223.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06224.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06202.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06203.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06204.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06205.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06206.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06207.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06208.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06209.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06210.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06211.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06212.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06213.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06214.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06215.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06216.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06217.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06218.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06219.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06220.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06221.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06222.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06223.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06224.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06202.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06203.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06204.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06205.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06206.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06207.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06208.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06209.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06210.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06211.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06212.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06213.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06214.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06215.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06216.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06217.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06218.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06219.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06220.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06221.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06222.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06223.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06224.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\t\t<li>\t<img src=\"http://media.oboobs.ru/boobs/06202.jpg\" style=\"width:80px; height:80px;\"></li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    \r\n");
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
      out.write("<script type=\"text/javascript\" src=\"resources/sphere/JQuery.js\"></script>\r\n");
      out.write("\t<script src=\"resources/sphere/3DEngine.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t<script src=\"resources/sphere/Sphere.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t//<![CDATA[\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar camera = new Camera3D();\r\n");
      out.write("\t\t\tcamera.init(0,0,0,250);\r\n");
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
      out.write("\t\t\tvar speed = 2000;\r\n");
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
