package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changepassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fmethod_005fcommandName_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fmethod_005fcommandName_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fmethod_005fcommandName_005faction.release();
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
      out.write("<title>Change Password</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"by Putnik\">\r\n");
      out.write("<link href=\"resources/assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../res/css/jquery.ui.all.css\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tpadding-top: 60px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<style>\r\n");
      out.write("a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
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
      out.write("<div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("\t<div class=\"navbar-inner\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<a class=\"btn btn-navbar\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\tdata-target=\".nav-collapse\"> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t</a> <a class=\"brand\" href=\"../editor.html\"> <i\r\n");
      out.write("\t\t\t\tclass=\"icon-white icon-edit\"></i> Web editor\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<div class=\"nav-collapse\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"home\"> <i class=\"icon-white icon-home\"></i>\r\n");
      out.write("\t\t\t\t\t\t\tHome\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"about\"> <i class=\"icon-white icon-book\"></i>\r\n");
      out.write("\t\t\t\t\t\t\tAbout\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"contact\"> <i class=\"icon-white icon-pencil\"></i>\r\n");
      out.write("\t\t\t\t\t\t\tContact\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"listOfPresentations\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-white icon-picture\"></i> List of Presentations\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<form class=\"navbar-search pull-left\" action=\"\">\r\n");
      out.write("\t\t\t\t<i class=\"icon-white icon-search\"></i><input type=\"text\"\r\n");
      out.write("\t\t\t\t\tclass=\"search-query span2\" placeholder=\"Search\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<ul class=\"nav pull-right\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t<a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-user\"></i> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" <span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"userpage\"> <i class=\"icon-cog\"></i> Profile\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"../j_spring_security_logout\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"icon-off\"></i> Logout\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\" style=\"margin-top: 20px;\">\r\n");
      out.write("\t<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" change your password</h1>\r\n");
      out.write("\t<input type=hidden id=\"userPassword\" name=\"userPassword\"\r\n");
      out.write("\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${password}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /> <input type=hidden id=\"userId\" name=\"userId\"\r\n");
      out.write("\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div\r\n");
      out.write("\tstyle=\"display: none; z-index: 1000; outline: 0px; position: absolute; background-color: whiteSmoke;\"\r\n");
      out.write("\tclass=\"ui-dialog ui-widget ui-widget-content-error ui-corner-all ui-draggable ui-resizable\"\r\n");
      out.write("\ttabindex=\"-1\" role=\"dialog\" aria-labelledby=\"ui-dialog-title-dialog\">\r\n");
      out.write("\t<div\r\n");
      out.write("\t\tclass=\"ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix\" >\r\n");
      out.write("\t\t<span class=\"ui-dialog-title\" id=\"ui-dialog-title-dialog\">Basic\r\n");
      out.write("\t\t\tdialog</span><a href=\"#\" class=\"ui-dialog-titlebar-close ui-corner-all\"\r\n");
      out.write("\t\t\trole=\"button\"><span class=\"ui-icon ui-icon-closethick\">close</span></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"dialog\" style=\"\" class=\"ui-dialog-content ui-widget-content\" style=\"background-color: whiteSmoke;\">\r\n");
      out.write("\t\t<p></p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"ui-resizable-handle ui-resizable-n\" style=\"z-index: 1000;\"></div>\r\n");
      out.write("\t<div class=\"ui-resizable-handle ui-resizable-e\" style=\"z-index: 1000;\"></div>\r\n");
      out.write("\t<div class=\"ui-resizable-handle ui-resizable-s\" style=\"z-index: 1000;\"></div>\r\n");
      out.write("\t<div class=\"ui-resizable-handle ui-resizable-w\" style=\"z-index: 1000;\"></div>\r\n");
      out.write("\t<div\r\n");
      out.write("\t\tclass=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se ui-icon-grip-diagonal-se\"\r\n");
      out.write("\t\tstyle=\"z-index: 1000;\"></div>\r\n");
      out.write("\t<div class=\"ui-resizable-handle ui-resizable-sw\" style=\"z-index: 1000;\"></div>\r\n");
      out.write("\t<div class=\"ui-resizable-handle ui-resizable-ne\" style=\"z-index: 1000;\"></div>\r\n");
      out.write("\t<div class=\"ui-resizable-handle ui-resizable-nw\" style=\"z-index: 1000;\"></div>\r\n");
      out.write("</div>\r\n");
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
      out.write("<script src=\"resources/changepassword.js\"></script>\r\n");
      out.write("<script src=\"resources/jquery.ui.core.js\"></script>\r\n");
      out.write("<script src=\"resources/jquery.ui.widget.js\"></script>\r\n");
      out.write("<script src=\"resources/jquery.ui.mouse.js\"></script>\r\n");
      out.write("<script src=\"resources/jquery.ui/jquery.ui.button.js\"></script>\r\n");
      out.write("<script src=\"resources/jquery.ui/jquery.ui.draggable.js\"></script>\r\n");
      out.write("<script src=\"resources/jquery.ui/jquery.ui.position.js\"></script>\r\n");
      out.write("<script src=\"resources/jquery.ui/jquery.ui.resizable.js\"></script>\r\n");
      out.write("<script src=\"resources/jquery.ui/jquery.ui.dialog.js\"></script>\r\n");
      out.write("<script src=\"resources/jquery.ui/jquery.effects.core.js\"></script>\r\n");
      out.write("<script src=\"resources/jquery-ui-1.8.21.custom.min.js\"></script>\r\n");
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

  private boolean _jspx_meth_form_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fmethod_005fcommandName_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/views/changepassword.jsp(87,1) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("Post");
    // /WEB-INF/views/changepassword.jsp(87,1) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction("changepassword");
    // /WEB-INF/views/changepassword.jsp(87,1) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setCommandName("changepassword");
    // /WEB-INF/views/changepassword.jsp(87,1) null
    _jspx_th_form_005fform_005f0.setDynamicAttribute(null, "style", new String("margin-top: 40px;"));
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<div class=\"well\" style=\"color: black;\">\r\n");
          out.write("\t\t\tCurrent password<br /> <input type=\"password\" id=\"currentpassword\" />\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t\t<div class=\"well\" style=\"color: black;\">\r\n");
          out.write("\t\t\tNew password<br /> <input type=\"password\" id=\"newpassword\" />\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t\t<div class=\"well\" style=\"color: black;\">\r\n");
          out.write("\t\t\tConfirm password<br /> <input type=\"password\" id=\"confirmpassword\" />\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t\t<input class=\"btn\" value=\"Save\" onclick=\"sub()\" />\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fmethod_005fcommandName_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }
}
