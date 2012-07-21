package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class show_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>About</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"by Putnik\">\r\n");
      out.write("\r\n");
      out.write("<!-- Le styles -->\r\n");
      out.write("<link href=\"resources/assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tpadding-top: 60px;\r\n");
      out.write("\t/* 60px to make the container go all the way to the bottom of the topbar */\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<style>\r\n");
      out.write("   a { \r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("   } \r\n");
      out.write("  </style>\r\n");
      out.write("<link href=\"resources/assets/css/bootstrap-responsive.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!-- Le fav and touch icons -->\r\n");
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
      out.write("\t\t\t</a> <a class=\"brand\" href=\"../editor\"> <i\r\n");
      out.write("\t\t\t\tclass=\"icon-white icon-edit\"></i> Web Editor\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<div class=\"nav-collapse\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"home\"> <i class=\"icon-white icon-home\"></i>\r\n");
      out.write("\t\t\t\t\t\t\tHome\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"about\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-white icon-book\"></i> About\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"contact\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-white icon-pencil\"></i> Contact\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"listOfPresentations\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-white icon-picture\"></i> List of Presentations\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--/.nav-collapse -->\r\n");
      out.write("\t\t\t<form class=\"navbar-search pull-left\" action=\"\">\r\n");
      out.write("\t\t\t\t<i class=\"icon-white icon-search\"></i><input type=\"text\"\r\n");
      out.write("\t\t\t\t\tclass=\"search-query span2\" placeholder=\"Search\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<ul class=\"nav pull-right\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t<a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"icon-user\"></i> Account <span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"registrationform\">Registration</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"loginform\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"userpage\"> <i class=\"icon-cog\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\tProfile\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"../j_spring_security_logout\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"icon-off\"></i> Logout\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\" style=\"margin-top: 20px;\">\r\n");
      out.write("\r\n");
      out.write("\t<h1>Search</h1>\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<div style=\"width: 255px; float: left; color:black;\">\r\n");
      out.write("\t\t<form class=\"well\">\r\n");
      out.write("\t\t\t<label>Title: </label>\r\n");
      out.write("\t\t\t<textarea id=\"title-text-area\" rows=\"1\"></textarea>\r\n");
      out.write("\t\t\t<br /> <label>Tags: </label>\r\n");
      out.write("\t\t\t<textarea id=\"tags-text-area\" rows=\"3\"></textarea>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<button id=\"search-btn\" type=\"submit\" class=\"btn\">Search</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"float: left; margin-left: 20px\">\r\n");
      out.write("\t\t<table class=\"table table-striped\"\r\n");
      out.write("\t\t\tstyle=\"width: 875px; margin-top: -10px;\">\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th style=\"width: 300px\">Title</th>\r\n");
      out.write("\t\t\t\t\t<th style=\"width: 495px\">Description</th>\r\n");
      out.write("\t\t\t\t\t<th style=\"width: 80px\">Preview</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- /container -->\r\n");
      out.write("<p> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
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
      out.write("<script src=\"resources/assets/js/jquery-textext-1.3.0.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction previewPresentation(id) {\r\n");
      out.write("\t\talert(\"preview \" + id);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t$('#title-text-area').textext({});\r\n");
      out.write("\r\n");
      out.write("\t$('#tags-text-area').textext({\r\n");
      out.write("\t\tplugins : 'autocomplete tags ajax',\r\n");
      out.write("\t\ttagsItems : new String('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tagsAreaValue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("').split(','),\t\t\t\t\r\n");
      out.write("\t\tajax : {\r\n");
      out.write("\t\t\ttype : 'POST',\r\n");
      out.write("\t\t\turl : 'presentation/show',\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tdataCallback : function(query) {\r\n");
      out.write("\t\t\t\treturn {\r\n");
      out.write("\t\t\t\t\t'query' : query\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t$('#title-text-area').val('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${titleAreaValue}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("');\r\n");
      out.write("\r\n");
      out.write("\t$(\"#search-btn\").click(\r\n");
      out.write("\t\t\tfunction() {\r\n");
      out.write("\t\t\t\tfunction buildTitleURI() {\r\n");
      out.write("\t\t\t\t\tvar titleParam = {\r\n");
      out.write("\t\t\t\t\t\ttitle : JSON.parse('\"' + titleText + '\"')\r\n");
      out.write("\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t\treturn decodeURIComponent($.param(titleParam));\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tfunction buildTagsURI() {\r\n");
      out.write("\t\t\t\t\tvar tagsParam = {\r\n");
      out.write("\t\t\t\t\t\ttag : JSON.parse(tagsText)\r\n");
      out.write("\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t\treturn decodeURIComponent($.param(tagsParam));\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar titleTextArea = $(\"#title-text-area\");\r\n");
      out.write("\t\t\t\tvar titleText = $.trim(titleTextArea.val());\r\n");
      out.write("\t\t\t\tvar tagsTextArea = $(\"#tags-text-area\");\r\n");
      out.write("\t\t\t\tvar tagsText = $.trim(tagsTextArea.textext()[0].hiddenInput()\r\n");
      out.write("\t\t\t\t\t\t.val());\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tif (titleText.length != 0 && tagsText.length != 2) {\r\n");
      out.write("\t\t\t\t\twindow.location = 'presentation/show?' + buildTitleURI() + '&'\r\n");
      out.write("\t\t\t\t\t\t\t+ buildTagsURI();\r\n");
      out.write("\t\t\t\t} else if (titleText.length == 0 && tagsText.length != 2) {\r\n");
      out.write("\t\t\t\t\twindow.location = 'presentation/show?' + buildTagsURI();\r\n");
      out.write("\t\t\t\t} else if (titleText.length != 0 && tagsText.length == 2) {\r\n");
      out.write("\t\t\t\t\twindow.location = 'presentation/show?' + buildTitleURI();\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\twindow.location = 'presentation/show';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t});\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/show.jsp(123,4) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${presentations}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/show.jsp(123,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("presentation");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<tr id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${presentation.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${presentation.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${presentation.description}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t<td><button class=\"btn btn-success\"\r\n");
          out.write("\t\t\t\t\t\t\t\tonclick=\"previewPresentation(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${presentation.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(")\">\r\n");
          out.write("\t\t\t\t\t\t\t\tPreview</button></td>\r\n");
          out.write("\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t");
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
