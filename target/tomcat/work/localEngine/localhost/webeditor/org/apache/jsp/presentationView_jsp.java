package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class presentationView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<META HTTP-EQUIV=\"Cache-Control\" CONTENT=\"max-age=0\">\r\n");
      out.write("<META HTTP-EQUIV=\"Cache-Control\" CONTENT=\"no-cache\">\r\n");
      out.write("<META http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<META HTTP-EQUIV=\"Expires\" CONTENT=\"Tue, 01 Jan 1980 1:00:00 GMT\">\r\n");
      out.write("<META HTTP-EQUIV=\"Pragma\" CONTENT=\"no-cache\">\r\n");
      out.write("<title>Strut - ALPHA</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"res/css/close-btn.css\"></link>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"res/css/bootstrap.css\"></link>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"res/css/main.css\"></link>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"res/jqplugins/colorpicker/css/colorpicker.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"res/jqplugins/gradient_picker/jquery.gradientPicker.css\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("<link href='preview_export/css/web-fonts.css' rel='stylesheet'\r\n");
      out.write("\ttype='text/css'>\r\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/vendor/A-jquery-1.7-matt.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/vendor/B-jqueryUI.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/vendor/C-underscore.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/vendor/D-bootstrap.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"scripts/vendor/E-bootstrapDropdown.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"res/jqplugins/colorpicker/js/colorpicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"res/jqplugins/gradient_picker/jquery.gradientPicker.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write(".disp-none {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".underline {\r\n");
      out.write("\ttext-decoration: underline;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("html,body,.editor {\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tbackground: #222;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("    \tjQuery.fn.selectText = function(){\r\n");
      out.write("\t\t    var doc = document;\r\n");
      out.write("\t\t    var element = this[0];\r\n");
      out.write("\t\t    if (doc.body.createTextRange) {\r\n");
      out.write("\t\t        var range = document.body.createTextRange();\r\n");
      out.write("\t\t        range.moveToElementText(element);\r\n");
      out.write("\t\t        range.select();\r\n");
      out.write("\t\t    } else if (window.getSelection) {\r\n");
      out.write("\t\t        var selection = window.getSelection();        \r\n");
      out.write("\t\t        var range = document.createRange();\r\n");
      out.write("\t\t        range.selectNodeContents(element);\r\n");
      out.write("\t\t        selection.removeAllRanges();\r\n");
      out.write("\t\t        selection.addRange(range);\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    return this;\r\n");
      out.write("\t\t};\r\n");
      out.write("    \t</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" data-main=\"scripts/main\"\r\n");
      out.write("\tsrc=\"scripts/require.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"preview_export/scripts/impress.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=$(\"#present\").click();>\r\n");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
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
    // /presentationView.jsp(70,0) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jsonResponse}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /presentationView.jsp(70,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("v_person");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\tconsole.log({v_person});\r\n");
          out.write("            ");
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
