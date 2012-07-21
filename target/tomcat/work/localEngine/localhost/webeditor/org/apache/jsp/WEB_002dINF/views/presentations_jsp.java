package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class presentations_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>WebEditor: Home</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Le styles -->\r\n");
      out.write("<link href=\"resources/assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tpadding-top: 60px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<!-- Le fav and touch icons -->\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"resources/assets/ico/favicon.ico\">\r\n");
      out.write("<link rel=\"apple-touch-icon\"\r\n");
      out.write("\thref=\"resources/assets/ico/apple-touch-icon.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"72x72\"\r\n");
      out.write("\thref=\"resources/assets/ico/apple-touch-icon-72x72.png\">\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"114x114\"\r\n");
      out.write("\thref=\"resources/assets/ico/apple-touch-icon-114x114.png\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"topbar\">\r\n");
      out.write("\t\t<div class=\"fill\">\r\n");
      out.write("\t\t\t<div class=\"container\" style=\"width: 760px\">\r\n");
      out.write("\t\t\t\t<a class=\"brand\" href=\"../editor.html\">Web Editor</a>\r\n");
      out.write("\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"home\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"presentations\">Presentations</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"about\">About</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<form class=\"navbar-search pull-left\" action=\"presentations\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"search-query\" id=\"search-input\" name=\"title\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"margin-top: 3px; width: 120px\" placeholder=\"Search\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\" style=\"width: 800px\">\r\n");
      out.write("\t\t<div style=\"width: 255px; float: left; color: black;\">\r\n");
      out.write("\t\t\t<form class=\"well\">\r\n");
      out.write("\t\t\t\t<label style=\"width:0\">Title:</label><br /><br />\r\n");
      out.write("\t\t\t\t<textarea id=\"title-text-area\" rows=\"1\"></textarea>\r\n");
      out.write("\t\t\t\t<br /> <label style=\"width:0\">Tags:</label><br /><br />\r\n");
      out.write("\t\t\t\t<textarea id=\"tags-text-area\" rows=\"3\"></textarea>\r\n");
      out.write("\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t<button id=\"search-btn\" type=\"submit\" class=\"btn primary\">Search</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"float: left; margin-left: 20px\">\r\n");
      out.write("\t\t\t<table class=\"table table-striped\"\r\n");
      out.write("\t\t\t\tstyle=\"width: 460; margin-top: -10px;\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"width: 160px\">Title</th>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"width: 220px\">Description</th>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"width: 80px\">Preview</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /container -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- Le javascript -->\r\n");
      out.write("\t<script src=\"resources/assets/js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/less-1.1.5.min.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-alerts.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-buttons.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-dropdown.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-modal.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-scrollspy.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-tabs.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-twipsy.js\"></script>\r\n");
      out.write("\t<script src=\"resources/assets/js/jquery-textext-1.3.0.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\t\r\n");
      out.write("\t    function previewPresentation(id) {\r\n");
      out.write("\t        alert(\"preview \" + id);\r\n");
      out.write("\t    }\r\n");
      out.write("\t\r\n");
      out.write("\t    $('#title-text-area').textext({});\r\n");
      out.write("\t\r\n");
      out.write("\t    $('#tags-text-area').textext({\r\n");
      out.write("\t        plugins : 'autocomplete tags ajax',\r\n");
      out.write("\t        tagsItems : new String('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tagsAreaValue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("').split(','),              \r\n");
      out.write("\t        ajax : {\r\n");
      out.write("\t            type : 'POST',\r\n");
      out.write("\t            url : 'presentations',\r\n");
      out.write("\t            dataType : 'json',\r\n");
      out.write("\t            dataCallback : function(query) {\r\n");
      out.write("\t                return {\r\n");
      out.write("\t                    'query' : query\r\n");
      out.write("\t                }\r\n");
      out.write("\t            }\r\n");
      out.write("\t        }\r\n");
      out.write("\t    });\r\n");
      out.write("\t        \r\n");
      out.write("\t    $('#title-text-area').val('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titleAreaValue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\t\r\n");
      out.write("\t    $(\"#search-btn\").click(\r\n");
      out.write("\t            function() {\r\n");
      out.write("\t                function buildTitleURI() {\r\n");
      out.write("\t                    var titleParam = {\r\n");
      out.write("\t                        title : JSON.parse('\"' + titleText + '\"')\r\n");
      out.write("\t                    };\r\n");
      out.write("\t                    return decodeURIComponent($.param(titleParam));\r\n");
      out.write("\t                }\r\n");
      out.write("\t\r\n");
      out.write("\t                function buildTagsURI() {\r\n");
      out.write("\t                    var tagsParam = {\r\n");
      out.write("\t                        tag : JSON.parse(tagsText)\r\n");
      out.write("\t                    };\r\n");
      out.write("\t                    return decodeURIComponent($.param(tagsParam));\r\n");
      out.write("\t                }\r\n");
      out.write("\t\r\n");
      out.write("\t                var titleTextArea = $(\"#title-text-area\");\r\n");
      out.write("\t                var titleText = $.trim(titleTextArea.val());\r\n");
      out.write("\t                var tagsTextArea = $(\"#tags-text-area\");\r\n");
      out.write("\t                var tagsText = $.trim(tagsTextArea.textext()[0].hiddenInput()\r\n");
      out.write("\t                        .val());\r\n");
      out.write("\t\r\n");
      out.write("\t                if (titleText.length != 0 && tagsText.length != 2) {\r\n");
      out.write("\t                    window.location = 'presentations?' + buildTitleURI() + '&'\r\n");
      out.write("\t                            + buildTagsURI();\r\n");
      out.write("\t                } else if (titleText.length == 0 && tagsText.length != 2) {\r\n");
      out.write("\t                    window.location = 'presentations?' + buildTagsURI();\r\n");
      out.write("\t                } else if (titleText.length != 0 && tagsText.length == 2) {\r\n");
      out.write("\t                    window.location = 'presentations?' + buildTitleURI();\r\n");
      out.write("\t                } else {\r\n");
      out.write("\t                    window.location = 'presentations';\r\n");
      out.write("\t                }\r\n");
      out.write("\t                \r\n");
      out.write("\t                return false;\r\n");
      out.write("\t            });\r\n");
      out.write("\t</script>\r\n");
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
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
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
    // /WEB-INF/views/presentations.jsp(44,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${authenticated}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t<form class=\"pull-right\">\r\n");
        out.write("\t\t\t\t\t\t\t<button class=\"btn\" type=\"submit\"\r\n");
        out.write("\t\t\t\t\t\t\t\tonClick=\"window.location='../j_spring_security_logout'; return false;\">Log\r\n");
        out.write("\t\t\t\t\t\t\t\tout</button>\r\n");
        out.write("\t\t\t\t\t\t</form>\r\n");
        out.write("\t\t\t\t\t\t<p class=\"pull-right\" style=\"margin-right: 10px\">\r\n");
        out.write("\t\t\t\t\t\t\tLogged in as <a href=\"#\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a>\r\n");
        out.write("\t\t\t\t\t\t</p>\r\n");
        out.write("\t\t\t\t\t");
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
        out.write("\t\t\t\t\t\t<form class=\"pull-right\">\r\n");
        out.write("\t\t\t\t\t\t\t<button class=\"btn\" type=\"submit\"\r\n");
        out.write("\t\t\t\t\t\t\t\tonClick=\"window.location='login'; return false;\">Log in</button>\r\n");
        out.write("\t\t\t\t\t\t\t<button class=\"btn\" type=\"submit\"\r\n");
        out.write("\t\t\t\t\t\t\t\tonClick=\"window.location='register'; return false;\">Register</button>\r\n");
        out.write("\t\t\t\t\t\t</form>\r\n");
        out.write("\t\t\t\t\t");
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
    // /WEB-INF/views/presentations.jsp(89,5) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${presentations}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/presentations.jsp(89,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("presentation");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<tr id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${presentation.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${presentation.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${presentation.description}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t<td><button class=\"btn btn-success\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\tonclick=\"previewPresentation(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${presentation.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\tPreview</button></td>\r\n");
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
}
