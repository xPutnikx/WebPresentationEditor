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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>WebEditor: Home</title>\n");
      out.write("\n");
      out.write("<!-- Le styles -->\n");
      out.write("<link href=\"resources/assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("body {\n");
      out.write("\tpadding-top: 60px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!-- Le fav and touch icons -->\n");
      out.write("<link rel=\"shortcut icon\" href=\"resources/assets/ico/favicon.ico\">\n");
      out.write("<link rel=\"apple-touch-icon\"\n");
      out.write("\thref=\"resources/assets/ico/apple-touch-icon.png\">\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"72x72\"\n");
      out.write("\thref=\"resources/assets/ico/apple-touch-icon-72x72.png\">\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"114x114\"\n");
      out.write("\thref=\"resources/assets/ico/apple-touch-icon-114x114.png\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div class=\"topbar\">\n");
      out.write("\t\t<div class=\"fill\">\n");
      out.write("\t\t\t<div class=\"container\" style=\"width: 760px\">\n");
      out.write("\t\t\t\t<a class=\"brand\" href=\"../editor.html\">Web Editor</a>\n");
      out.write("\t\t\t\t<ul class=\"nav\">\n");
      out.write("\t\t\t\t\t<li><a href=\"home\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"presentations\">Presentations</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"about\">About</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<form class=\"navbar-search pull-left\" action=\"presentations\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"search-query\" id=\"search-input\" name=\"title\"\n");
      out.write("\t\t\t\t\t\tstyle=\"margin-top: 3px; width: 120px\" placeholder=\"Search\">\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"container\" style=\"width: 800px\">\n");
      out.write("\t\t<div style=\"width: 255px; float: left; color: black;\">\n");
      out.write("\t\t\t<form class=\"well\">\n");
      out.write("\t\t\t\t<label style=\"width:0\">Title:</label><br /><br />\n");
      out.write("\t\t\t\t<textarea id=\"title-text-area\" rows=\"1\"></textarea>\n");
      out.write("\t\t\t\t<br /> <label style=\"width:0\">Tags:</label><br /><br />\n");
      out.write("\t\t\t\t<textarea id=\"tags-text-area\" rows=\"3\"></textarea>\n");
      out.write("\t\t\t\t<br />\n");
      out.write("\t\t\t\t<button id=\"search-btn\" type=\"submit\" class=\"btn primary\">Search</button>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div style=\"float: left; margin-left: 20px\">\n");
      out.write("\t\t\t<table class=\"table table-striped\"\n");
      out.write("\t\t\t\tstyle=\"width: 460; margin-top: -10px;\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th style=\"width: 160px\">Title</th>\n");
      out.write("\t\t\t\t\t\t<th style=\"width: 300px\">Description</th>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /container -->\n");
      out.write("\n");
      out.write("\t<!-- Le javascript -->\n");
      out.write("\t<script src=\"resources/assets/js/jquery.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/less-1.1.5.min.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-alerts.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-buttons.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-dropdown.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-modal.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-scrollspy.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-tabs.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/bootstrap-twipsy.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/jquery-textext-1.3.0.js\"></script>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\t  \n");
      out.write("\t    $('#title-text-area').textext({});\n");
      out.write("\t\n");
      out.write("\t    $('#tags-text-area').textext({\n");
      out.write("\t        plugins : 'autocomplete tags ajax',\n");
      out.write("\t        tagsItems : new String('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tagsAreaValue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("').split(','),              \n");
      out.write("\t        ajax : {\n");
      out.write("\t            type : 'POST',\n");
      out.write("\t            url : 'presentations',\n");
      out.write("\t            dataType : 'json',\n");
      out.write("\t            dataCallback : function(query) {\n");
      out.write("\t                return {\n");
      out.write("\t                    'query' : query\n");
      out.write("\t                }\n");
      out.write("\t            }\n");
      out.write("\t        }\n");
      out.write("\t    });\n");
      out.write("\t        \n");
      out.write("\t    $('#title-text-area').val('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titleAreaValue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\n");
      out.write("\t\n");
      out.write("\t    $(\"#search-btn\").click(\n");
      out.write("\t            function() {\n");
      out.write("\t                function buildTitleURI() {\n");
      out.write("\t                    var titleParam = {\n");
      out.write("\t                        title : JSON.parse('\"' + titleText + '\"')\n");
      out.write("\t                    };\n");
      out.write("\t                    return decodeURIComponent($.param(titleParam));\n");
      out.write("\t                }\n");
      out.write("\t\n");
      out.write("\t                function buildTagsURI() {\n");
      out.write("\t                    var tagsParam = {\n");
      out.write("\t                        tag : JSON.parse(tagsText)\n");
      out.write("\t                    };\n");
      out.write("\t                    return decodeURIComponent($.param(tagsParam));\n");
      out.write("\t                }\n");
      out.write("\t\n");
      out.write("\t                var titleTextArea = $(\"#title-text-area\");\n");
      out.write("\t                var titleText = $.trim(titleTextArea.val());\n");
      out.write("\t                var tagsTextArea = $(\"#tags-text-area\");\n");
      out.write("\t                var tagsText = $.trim(tagsTextArea.textext()[0].hiddenInput()\n");
      out.write("\t                        .val());\n");
      out.write("\t\n");
      out.write("\t                if (titleText.length != 0 && tagsText.length != 2) {\n");
      out.write("\t                    window.location = 'presentations?' + buildTitleURI() + '&'\n");
      out.write("\t                            + buildTagsURI();\n");
      out.write("\t                } else if (titleText.length == 0 && tagsText.length != 2) {\n");
      out.write("\t                    window.location = 'presentations?' + buildTagsURI();\n");
      out.write("\t                } else if (titleText.length != 0 && tagsText.length == 2) {\n");
      out.write("\t                    window.location = 'presentations?' + buildTitleURI();\n");
      out.write("\t                } else {\n");
      out.write("\t                    window.location = 'presentations';\n");
      out.write("\t                }\n");
      out.write("\t                \n");
      out.write("\t                return false;\n");
      out.write("\t            });\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
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
        out.write("\n");
        out.write("\t\t\t\t\t\t<form class=\"pull-right\">\n");
        out.write("\t\t\t\t\t\t\t<button class=\"btn\" type=\"submit\"\n");
        out.write("\t\t\t\t\t\t\t\tonClick=\"window.location='../j_spring_security_logout'; return false;\">Log\n");
        out.write("\t\t\t\t\t\t\t\tout</button>\n");
        out.write("\t\t\t\t\t\t</form>\n");
        out.write("\t\t\t\t\t\t<p class=\"pull-right\" style=\"margin-right: 10px\">\n");
        out.write("\t\t\t\t\t\t\tLogged in as <a href=\"#\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a>\n");
        out.write("\t\t\t\t\t\t</p>\n");
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
        out.write("\n");
        out.write("\t\t\t\t\t\t<form class=\"pull-right\">\n");
        out.write("\t\t\t\t\t\t\t<button class=\"btn\" type=\"submit\"\n");
        out.write("\t\t\t\t\t\t\t\tonClick=\"window.location='login'; return false;\">Log in</button>\n");
        out.write("\t\t\t\t\t\t\t<button class=\"btn\" type=\"submit\"\n");
        out.write("\t\t\t\t\t\t\t\tonClick=\"window.location='register'; return false;\">Register</button>\n");
        out.write("\t\t\t\t\t\t</form>\n");
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
    // /WEB-INF/views/presentations.jsp(88,5) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${presentations}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/presentations.jsp(88,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("presentation");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t\t<td><a href=\"presentation?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${presentation.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${presentation.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></td>\n");
          out.write("\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${presentation.description}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t</tr>\n");
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
