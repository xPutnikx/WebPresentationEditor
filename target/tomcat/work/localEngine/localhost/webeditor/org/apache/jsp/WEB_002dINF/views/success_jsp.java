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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>About</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"by Putnik\">\n");
      out.write("\n");
      out.write("<!-- Le styles -->\n");
      out.write("<link href=\"resources/assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("<style type=\"text/css\" media=\"screen\">\n");
      out.write("#item {\n");
      out.write("\twidth: 100px;\n");
      out.write("\theight: 100px;\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("\ttop: 300px;\n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul {\n");
      out.write("\tlist-style-type: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("\tbackground-color: transparent;\n");
      out.write("\tcolor: #69c;\n");
      out.write("\tfont-family: Arial, \"MS Trebuchet\", sans-serif;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tfont-size: 2em;\n");
      out.write("}\n");
      out.write("</style>\n");
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
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<div class=\"nav-collapse\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://oboobs.ru/\">HOME</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--/.nav-collapse -->\n");
      out.write("\t\t\t\t<ul class=\"nav pull-right\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t<div id=\"item\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06202.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06202.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06203.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06203.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06204.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06204.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06205.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06205.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06206.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06206.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06207.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06207.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06208.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06208.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06209.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06209.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06210.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06210.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06211.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06211.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06212.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06212.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06213.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06213.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06214.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06214.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06215.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06215.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06216.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06216.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06217.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06217.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06218.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06218.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06219.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06219.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06220.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06220.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06221.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06221.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06222.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06222.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06223.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06223.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06224.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06224.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06225.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06225.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06226.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06226.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06227.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06227.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06228.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06228.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06229.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06229.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06230.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06230.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06231.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06231.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06232.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06232.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06233.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06233.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06202.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06202.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06203.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06203.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06204.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06204.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06205.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06205.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06206.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06206.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06207.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06207.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06208.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06208.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06209.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06209.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06210.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06210.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06211.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06211.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06212.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06212.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06213.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06213.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06214.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06214.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06215.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06215.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06216.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06216.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06217.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06217.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06218.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06218.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06219.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06219.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06220.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06220.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06221.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06221.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06222.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06222.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06223.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06223.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06224.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06224.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06225.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06225.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06226.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06226.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06227.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06227.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06228.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06228.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06229.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06229.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06230.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06230.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06231.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06231.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06232.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06232.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\t\t<li><a href=\"http://media.oboobs.ru/boobs/06233.jpg\"><img\n");
      out.write("\t\t\t\t\t\tsrc=\"http://media.oboobs.ru/boobs/06233.jpg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 80px; height: 80px;\"></a></li>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
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
      out.write("\t<script type=\"text/javascript\" src=\"resources/sphere/JQuery.js\"></script>\n");
      out.write("\t<script src=\"resources/sphere/3DEngine.js\" type=\"text/javascript\"\n");
      out.write("\t\tcharset=\"utf-8\"></script>\n");
      out.write("\t<script src=\"resources/sphere/Sphere.js\" type=\"text/javascript\"\n");
      out.write("\t\tcharset=\"utf-8\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t//         \n");
      out.write("\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\n");
      out.write("\t\t\tvar camera = new Camera3D();\n");
      out.write("\t\t\tcamera.init(0, 0, 0, 250);\n");
      out.write("\n");
      out.write("\t\t\tvar container = $(\"#item\")\n");
      out.write("\n");
      out.write("\t\t\tvar item = new Object3D(container);\n");
      out.write("\n");
      out.write("\t\t\titem.addChild(new Sphere(200, 10, 100));\n");
      out.write("\n");
      out.write("\t\t\tvar scene = new Scene3D();\n");
      out.write("\t\t\tscene.addToScene(item);\n");
      out.write("\n");
      out.write("\t\t\tvar mouseX, mouseY = 0;\n");
      out.write("\t\t\tvar offsetX = $(\"#item\").offset().left;\n");
      out.write("\t\t\tvar offsetY = $(\"#item\").offset().top;\n");
      out.write("\t\t\tvar speed = 20000;\n");
      out.write("\n");
      out.write("\t\t\t$().mousemove(function(e) {\n");
      out.write("\t\t\t\tmouseX = e.clientX - offsetX - (container.width() / 2);\n");
      out.write("\t\t\t\tmouseY = e.clientY - offsetY - (container.height() / 2);\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\tvar animateIt = function() {\n");
      out.write("\t\t\t\tif (mouseX != undefined) {\n");
      out.write("\t\t\t\t\taxisRotation.y += (mouseX) / speed\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif (mouseY != undefined) {\n");
      out.write("\t\t\t\t\taxisRotation.x -= mouseY / speed;\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\tscene.renderCamera(camera);\n");
      out.write("\n");
      out.write("\t\t\t};\n");
      out.write("\n");
      out.write("\t\t\tsetInterval(animateIt, 20);\n");
      out.write("\n");
      out.write("\t\t});\n");
      out.write("\t\t//\n");
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
