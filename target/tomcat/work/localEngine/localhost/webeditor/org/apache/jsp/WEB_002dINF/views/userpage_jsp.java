package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>User Page</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"by Putnik\">\r\n");
      out.write("\r\n");
      out.write("<!-- Le styles -->\r\n");
      out.write("<link href=\"resources/assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tpadding-top: 60px;\r\n");
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
      out.write("\t\t\t\t\t\t<li><a href=\"contact\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"icon-white icon-pencil\"></i> Contact\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"listOfPresentations\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"icon-white icon-picture\"></i> List of Presentations\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--/.nav-collapse -->\r\n");
      out.write("\t\t\t\t<form class=\"navbar-search pull-left\" action=\"\">\r\n");
      out.write("\t\t\t\t\t<i class=\"icon-white icon-search\"></i><input id=\"searchbox\"\r\n");
      out.write("\t\t\t\t\t   type=\"text\" data-provide=\"typeahead\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"search-query span2\" placeholder=\"Search\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<ul class=\"nav pull-right\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-user\"></i> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" <span class=\"caret\"></span>\r\n");
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
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\" style=\"margin-top: 20px;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<h1>Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h1>\r\n");
      out.write("\t\t<p></p>\r\n");
      out.write("\t\t<p></p>\r\n");
      out.write("\t\t<div class=\"accordion\" id=\"accordion2\">\r\n");
      out.write("\t\t\t<div class=\"accordion-group\">\r\n");
      out.write("\t\t\t\t<div class=\"accordion-heading\">\r\n");
      out.write("\t\t\t\t\t<a class=\"accordion-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\t\tdata-parent=\"#accordion2\" href=\"#collapseOne\" style=\"color:white;\"> Information </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"collapseOne\" class=\"accordion-body in collapse\"\r\n");
      out.write("\t\t\t\t\tstyle=\"height: auto;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"well\" id=\"\">\r\n");
      out.write("\t\t\t\t\t\t<p style=\"color: black;\">Nickname : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t<p style=\"color: black;\">Role : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userrole}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"accordion-group\">\r\n");
      out.write("\t\t\t\t<div class=\"accordion-heading\">\r\n");
      out.write("\t\t\t\t\t<a class=\"accordion-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\t\tdata-parent=\"#accordion2\" href=\"#collapseTwo\" style=\"color:white;\"> Storage </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"collapseTwo\" class=\"accordion-body collapse\"\r\n");
      out.write("\t\t\t\t\tstyle=\"height: 0px;\" >\r\n");
      out.write("\t\t\t\t\t<div class=\"accordion-inner\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"well\" id=\"\">\r\n");
      out.write("\t\t\t\t\t<a href=\"mypresentations\" class=\"btn btn-danger\" rel=\"popover\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-content=\"And here's some amazing content. It's very engaging. right?\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original-title=\"A Title\">Go to storage</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"accordion-group\">\r\n");
      out.write("\t\t\t\t<div class=\"accordion-heading\">\r\n");
      out.write("\t\t\t\t\t<a class=\"accordion-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\t\tdata-parent=\"#accordion2\" href=\"#collapseThree\" style=\"color:white;\"> Change\r\n");
      out.write("\t\t\t\t\t\tPassword </a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"collapseThree\" class=\"accordion-body collapse\"\r\n");
      out.write("\t\t\t\t\tstyle=\"height: 0px;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"well\" id=\"\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"changepassword\" class=\"btn btn-danger\" rel=\"popover\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-content=\"And here's some amazing content. It's very engaging. right?\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original-title=\"A Title\">Accept</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
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
      out.write("\t<script src=\"resources/assets/js/bootstrap-typeahead.js\">\r\n");
      out.write("\t\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/userpage.jsp(81,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userrole=='ROLE_ADMIN'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"list\">Administration tools</a></li>\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
