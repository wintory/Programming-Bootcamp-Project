package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("<header>\n");
      out.write("    <div class=\"header-content\"  style=\"position:absolute; z-index:0;\">\n");
      out.write("        <div class=\"header-content-inner\" style=\"margin-top:50px\" >\n");
      out.write("            <h1>Meeting System</h1>\n");
      out.write("            <p>I don’t remember how we happened to meet each other.\n");
      out.write("                I don’t remember who got along with whom first.\n");
      out.write("                All I can remember is all of us together…always.</p>\n");
      out.write("            <form action=\"Login\" method=\"post\" class=\"form-container\" style=\"margin-left:35%\">\n");
      out.write("                <div class=\"form-title\"><h2>Sign in</h2></div>\n");
      out.write("                <div class=\"form-title\">Email</div>\n");
      out.write("                <input class=\"form-field\" type=\"text\" name=\"email\" /><br />\n");
      out.write("                <div class=\"form-title\">Password</div>\n");
      out.write("                <input class=\"form-field\" type=\"password\" name=\"password\" /><br />\n");
      out.write("                <a class='submit-button' href=\"signup.jsp\">Sign up</a>\n");
      out.write("                <input class=\"submit-button\" type=\"submit\" value=\"Login\" />\n");
      out.write("                <h1 style=\"color:red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("            </form>\n");
      out.write("            <span style=\"color:red;\"></span>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("<section class=\"bg-primary\" style=\" background-color: #3A3635;\"id=\"about\" style=\"margin-top:100px\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div style=\"margin-left:46%\"><h2>Our System</h2></div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-3 col-md-6 text-center\">\n");
      out.write("                <div class=\"service-box\">\n");
      out.write("                    <i class=\"fa fa-4x fa-diamond wow bounceIn text-primary\"></i>\n");
      out.write("\n");
      out.write("                    <p class=\"text-muted\">SIT</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6 text-center\">\n");
      out.write("                <div class=\"service-box\">\n");
      out.write("                    <i class=\"fa fa-4x fa-paper-plane wow bounceIn text-primary\" data-wow-delay=\".1s\"></i>\n");
      out.write("                    <p class=\"text-muted\">Family</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6 text-center\">\n");
      out.write("                <div class=\"service-box\">\n");
      out.write("                    <i class=\"fa fa-4x fa-newspaper-o wow bounceIn text-primary\" data-wow-delay=\".2s\"></i>\n");
      out.write("                    <p class=\"text-muted\">News</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3 col-md-6 text-center\">\n");
      out.write("                <div class=\"service-box\">\n");
      out.write("                    <i class=\"fa fa-4x fa-heart wow bounceIn text-primary\" data-wow-delay=\".3s\"></i>\n");
      out.write("                    <p class=\"text-muted\">Relation</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<section id=\"contact\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-8 col-lg-offset-2 text-center\">\n");
      out.write("                <h2 class=\"section-heading\">Contact us</h2>\n");
      out.write("                <hr class=\"primary\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-lg-offset-2 text-center\">\n");
      out.write("                <i class=\"fa fa-phone fa-3x wow bounceIn\"></i>\n");
      out.write("                <p>02-123-4567</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 text-center\">\n");
      out.write("                <i class=\"fa fa-envelope-o fa-3x wow bounceIn\" data-wow-delay=\".1s\"></i>\n");
      out.write("                <p><a href=\"mailto:your-email@your-domain.com\">alumini@gmail.com</a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
