package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Web Editor List</title>\r\n");
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
      out.write("<div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("\t\t<div class=\"navbar-inner\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<a class=\"btn btn-navbar\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\tdata-target=\".nav-collapse\"> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</a> <a class=\"brand\" href=\"../editor.html\">\r\n");
      out.write("\t\t\t\t<i class=\"icon-white icon-edit\"></i> Web Editor</a>\r\n");
      out.write("\t\t\t\t<div class=\"nav-collapse\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"home.html\">\r\n");
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
      out.write("             \t\t\t <i class=\"icon-user\"></i> Username\r\n");
      out.write("             \t\t\t <span class=\"caret\"></span>\r\n");
      out.write("           \t\t\t\t </a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"registrationform.html\">Registration</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"loginform.html\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"userpage.html\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-cog\"></i> Profile</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"../j_spring_security_logout\">\r\n");
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
      out.write("\t\t<h1>Listing People</h1>\r\n");
      out.write("\t\t<div id=\"content\" style=\"padding: 30px\">\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</br> </br> <a href=\"edit\"> Add Person</a>\r\n");
      out.write("\t\t</div>\r\n");
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
      out.write("\t<script src=\"resources/assets/js/bootstrap-typeahead.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/list.jsp(81,3) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${people}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/list.jsp(81,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("v_person");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<a href=\"edit?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" -\r\n");
          out.write("\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.password}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" </a>\r\n");
          out.write("\t\t\t\t<br />\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
