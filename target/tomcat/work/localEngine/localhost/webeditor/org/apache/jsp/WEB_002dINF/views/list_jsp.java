package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\r\n");
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
      out.write("<link rel=\"shortcut icon\" href=\"resources/assets/ico/favicon.ico\">\r\n");
      out.write("<link rel=\"apple-touch-icon\"\r\n");
      out.write("\thref=\"resources/assets/ico/apple-touch-icon.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"72x72\"\r\n");
      out.write("\thref=\"resources/assets/ico/apple-touch-icon-72x72.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"114x114\"\r\n");
      out.write("\thref=\"resources/assets/ico/apple-touch-icon-114x114.png\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<div class=\"topbar\">\r\n");
      out.write("\t<div class=\"fill\">\r\n");
      out.write("\t\t<div class=\"container\" style=\"width: 760px\">\r\n");
      out.write("\t\t\t<a class=\"brand\" href=\"../editor.html\">Web Editor</a>\r\n");
      out.write("\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"home\">Home</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"presentation/show\">Presentations</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"about\">About</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\" style=\"margin-top: 20px;width: 800px;\">\r\n");
      out.write("\t\t<h1>Listing People</h1>\r\n");
      out.write("\t\t<div id=\"content\" style=\"padding: 30px\">\r\n");
      out.write("\t\t\t<table class=\"table table-striped\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>Id</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Email</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Enabled</th>\r\n");
      out.write("\t\t\t\t\t\t<th>User Role</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody id=\"tbody\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t<a class=\"btn\" id=\"edit\" data-controls-modal=\"modal-from-dom\" data-backdrop=\"true\" data-keyboard=\"true\">Add Person</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div\r\n");
      out.write("\t\tstyle=\"display: none; z-index: 1002; outline: 0px; position: absolute; height: auto; width: 350px; top: 217px; left: 660px;\"\r\n");
      out.write("\t\tclass=\"ui-dialog ui-widget ui-widget-content ui-corner-all ui-draggable ui-resizable\"\r\n");
      out.write("\t\ttabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\t\taria-labelledby=\"ui-dialog-title-dialog-form\">\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tclass=\"ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix\">\r\n");
      out.write("\t\t\t<span class=\"ui-dialog-title\" id=\"ui-dialog-title-dialog-form\">\r\n");
      out.write("\t\t\t\tCreate new user</span><a href=\"#\"\r\n");
      out.write("\t\t\t\tclass=\"ui-dialog-titlebar-close ui-corner-all\" role=\"button\"><span\r\n");
      out.write("\t\t\t\tclass=\"ui-icon ui-icon-closethick\">close</span></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"dialog-form\"\r\n");
      out.write("\t\t\tstyle=\"width: auto; min-height: 0px; height: 216px;\"\r\n");
      out.write("\t\t\tclass=\"ui-dialog-content ui-widget-content\" scrolltop=\"0\"\r\n");
      out.write("\t\t\tscrollleft=\"0\">\r\n");
      out.write("\t\t\t<p class=\"validateTips\" style=\"color: transpanent\"></p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<form>\r\n");
      out.write("\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<label for=\"name\">Name</label> <input type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\tid=\"name\" class=\"text ui-widget-content ui-corner-all\"> <label\r\n");
      out.write("\t\t\t\t\t\tfor=\"email\">Email</label> <input type=\"text\" name=\"email\"\r\n");
      out.write("\t\t\t\t\t\tid=\"email\" value=\"\" class=\"text ui-widget-content ui-corner-all\">\r\n");
      out.write("\t\t\t\t\t<label for=\"password\">Password</label> <input type=\"password\"\r\n");
      out.write("\t\t\t\t\t\tname=\"password\" id=\"password\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"text ui-widget-content ui-corner-all\">\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"ui-resizable-handle ui-resizable-n\" style=\"z-index: 1000;\"></div>\r\n");
      out.write("\t\t<div class=\"ui-resizable-handle ui-resizable-e\" style=\"z-index: 1000;\"></div>\r\n");
      out.write("\t\t<div class=\"ui-resizable-handle ui-resizable-s\" style=\"z-index: 1000;\"></div>\r\n");
      out.write("\t\t<div class=\"ui-resizable-handle ui-resizable-w\" style=\"z-index: 1000;\"></div>\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tclass=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se ui-icon-grip-diagonal-se\"\r\n");
      out.write("\t\t\tstyle=\"z-index: 1000;\"></div>\r\n");
      out.write("\t\t<div class=\"ui-resizable-handle ui-resizable-sw\"\r\n");
      out.write("\t\t\tstyle=\"z-index: 1000;\"></div>\r\n");
      out.write("\t\t<div class=\"ui-resizable-handle ui-resizable-ne\"\r\n");
      out.write("\t\t\tstyle=\"z-index: 1000;\"></div>\r\n");
      out.write("\t\t<div class=\"ui-resizable-handle ui-resizable-nw\"\r\n");
      out.write("\t\t\tstyle=\"z-index: 1000;\"></div>\r\n");
      out.write("\t\t<div class=\"ui-dialog-buttonpane ui-widget-content ui-helper-clearfix\">\r\n");
      out.write("\t\t\t<div class=\"ui-dialog-buttonset\">\r\n");
      out.write("\t\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\t\tclass=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only btn primary\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" aria-disabled=\"false\" style=\"background-color:white;\">\r\n");
      out.write("\t\t\t\t\t<span class=\"btn primary\">Create an account</span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<button type=\"button\"\r\n");
      out.write("\t\t\t\t\tclass=\"ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only btn secondary\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" aria-disabled=\"false\" style=\"background-color:white;\">\r\n");
      out.write("\t\t\t\t\t<span class=\"btn secondary\">Cancel</span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"resources/assets/js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"resources/jquery.ba-dotimeout.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-transition.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-alert.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-modal.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-dropdown.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-scrollspy.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-tab.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-tooltip.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-twipsy.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-popover.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-button.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-collapse.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-carousel.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-typeahead.js\"></script>\r\n");
      out.write("\t<script src=\"resources/deletelist.js\"></script>\r\n");
      out.write("\t<script src=\"resources/checklist.js\"></script>\r\n");
      out.write("\t<script src=\"resources/changelist.js\"></script>\r\n");
      out.write("\t<script src=\"resources/jquery.ui.core.js\"></script>\r\n");
      out.write("\t<script src=\"resources/jquery.ui.widget.js\"></script>\r\n");
      out.write("\t<script src=\"resources/jquery.ui.mouse.js\"></script>\r\n");
      out.write("\t<script src=\"resources/jquery.ui/jquery.ui.button.js\"></script>\r\n");
      out.write("\t<script src=\"resources/jquery.ui/jquery.ui.draggable.js\"></script>\r\n");
      out.write("\t<script src=\"resources/jquery.ui/jquery.ui.position.js\"></script>\r\n");
      out.write("\t<script src=\"resources/jquery.ui/jquery.ui.resizable.js\"></script>\r\n");
      out.write("\t<script src=\"resources/jquery.ui/jquery.ui.dialog.js\"></script>\r\n");
      out.write("\t<script src=\"resources/jquery.ui/jquery.effects.core.js\"></script>\r\n");
      out.write("\t<script src=\"resources/createuserdialog.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/views/list.jsp(55,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${authenticated}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<form class=\"pull-right\">\r\n");
        out.write("\t\t\t\t\t\t<button class=\"btn\" type=\"submit\"\r\n");
        out.write("\t\t\t\t\t\t\tonClick=\"window.location='../j_spring_security_logout'; return false;\">Log\r\n");
        out.write("\t\t\t\t\t\t\tout</button>\r\n");
        out.write("\t\t\t\t\t</form>\r\n");
        out.write("\t\t\t\t\t<p class=\"pull-right\" style=\"margin-right: 10px\">\r\n");
        out.write("\t\t\t\t\t\tLogged in as <a href=\"userpage\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a>\r\n");
        out.write("\t\t\t\t\t</p>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<form class=\"pull-right\">\r\n");
        out.write("\t\t\t\t\t\t<button class=\"btn\" type=\"submit\"\r\n");
        out.write("\t\t\t\t\t\t\tonClick=\"window.location='login'; return false;\">Log in</button>\r\n");
        out.write("\t\t\t\t\t\t<button class=\"btn\" type=\"submit\"\r\n");
        out.write("\t\t\t\t\t\t\tonClick=\"window.location='register'; return false;\">Register</button>\r\n");
        out.write("\t\t\t\t\t</form>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/list.jsp(92,5) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${people}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/list.jsp(92,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("v_person");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<tr id=\"tr");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t<td><span class=\"label success\"><a\r\n");
          out.write("\t\t\t\t\t\t\t\t\tstyle=\"color: #FFF\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></span></td>\r\n");
          out.write("\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t<td>");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write(' ');
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<td><select class=\"medium\" id=\"span");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"\r\n");
          out.write("\t\t\t\t\t\t\t\tonclick=\"change(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<option>User</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<option>Admin</option>\r\n");
          out.write("\t\t\t\t\t\t\t</select></td>\r\n");
          out.write("\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<img src=\"resources/assets/png/glyphicons_207_remove_2.png\" id=\"del");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" onclick=\"del(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\"/>\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/list.jsp(100,11) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.enabled}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn success\" id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.id\r\n										}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tvalue=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.enabled\r\n										}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"check(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(',');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.enabled}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(")\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.enabled}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</button>\r\n");
        out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/views/list.jsp(107,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!v_person.enabled}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn danger\" id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.id\r\n										}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tvalue=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.enabled\r\n										}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"check(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(',');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.enabled}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(")\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${v_person.enabled}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</button>\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }
}
