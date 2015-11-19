package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrarPaciente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sql_setDataSource_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sql_setDataSource_user_url_password_driver_nobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("<head>\n");
      out.write("    ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<title>Cuestionario</title>\n");
      out.write("<meta charset=\"iso-8859-1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/layout.css\" type=\"text/css\">\n");
      out.write("<script type=\"text/javascript\" src=\"calendar.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"wrapper row1\">\n");
      out.write("  <header id=\"header\" class=\"clear\">\n");
      out.write("    <div id=\"hgroup\">\n");
      out.write("    <a href=\"/\"><img src=\"images/sanalogo.png\" height=\"75\" width=\"156\" /></a>\n");
      out.write("   </div>\n");
      out.write("    <form action=\"#\" method=\"post\">\n");
      out.write("      <fieldset>\n");
      out.write("        <legend>Search:</legend>\n");
      out.write("        <input type=\"text\" value=\"Search Our Website&hellip;\" onFocus=\"this.value=(this.value=='Search Our Website&hellip;')? '' : this.value ;\">\n");
      out.write("        <input type=\"submit\" id=\"sf_submit\" value=\"submit\">\n");
      out.write("      </fieldset>\n");
      out.write("    </form>\n");
      out.write("    <nav>\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"#\">Inicio</a></li>\n");
      out.write("        <li><a href=\"RegistrarPaciente.html\">Registrar Paciente</a></li>\n");
      out.write("        <li><a href=\"#\">Consultar Paciente  </a></li>\n");
      out.write("        <li><a href=\"#\">Nosotros</a></li>\n");
      out.write("        <li  class=\"last\"><a href=\"index.html\">Salir</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("  </header>\n");
      out.write("</div>\n");
      out.write("<!-- content -->\n");
      out.write("<div class=\"wrapper row2\">\n");
      out.write("  <table>\n");
      out.write("      <div class=\"form_description\">\n");
      out.write("        <td><h2>Datos de Contacto</h2></td>\n");
      out.write("        <td><p>llene los datos de contacto con el paciente.</p></td>\n");
      out.write("      </div>  \n");
      out.write("      <td><form id=\"\" class=\"questionaire\"  method=\"post\" action=\"\">          \n");
      out.write("    <ul style=\"list-style-type:none\">      \n");
      out.write("          <li id=\"li_1\" >\n");
      out.write("    <label class=\"description\" for=\"element_1\">Nombre </label>\n");
      out.write("    <div>\n");
      out.write("      <input id=\"element_1\" name=\"element_1\" class=\"element text medium\" type=\"text\" maxlength=\"255\" value=\"\"/> \n");
      out.write("    </div> \n");
      out.write("    </li>   <li id=\"li_2\" >\n");
      out.write("    <label class=\"description\" for=\"element_2\">Apellido </label>\n");
      out.write("    <div>\n");
      out.write("      <input id=\"element_2\" name=\"element_2\" class=\"element text medium\" type=\"text\" maxlength=\"255\" value=\"\"/> \n");
      out.write("    </div> \n");
      out.write("    </li>   <li id=\"li_4\" >\n");
      out.write("    <label class=\"description\" for=\"element_4\">Fecha de nacimiento </label>\n");
      out.write("    <span>\n");
      out.write("      <input id=\"element_4_1\" name=\"element_4_1\" class=\"element text\" size=\"2\" maxlength=\"2\" value=\"\" type=\"text\"> /\n");
      out.write("      <label for=\"element_4_1\">DD</label>\n");
      out.write("    </span>\n");
      out.write("    <span>\n");
      out.write("      <input id=\"element_4_2\" name=\"element_4_2\" class=\"element text\" size=\"2\" maxlength=\"2\" value=\"\" type=\"text\"> /\n");
      out.write("      <label for=\"element_4_2\">MM</label>\n");
      out.write("    </span>\n");
      out.write("    <span>\n");
      out.write("      <input id=\"element_4_3\" name=\"element_4_3\" class=\"element text\" size=\"4\" maxlength=\"4\" value=\"\" type=\"text\">\n");
      out.write("      <label for=\"element_4_3\">YYYY</label>\n");
      out.write("    </span>\n");
      out.write("  \n");
      out.write("    <span id=\"calendar_4\">\n");
      out.write("      <img id=\"cal_img_4\" class=\"datepicker\" src=\"images/calendar.gif\" alt=\"Pick a date.\">  \n");
      out.write("    </span>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("      Calendar.setup({\n");
      out.write("      inputField   : \"element_4_3\",\n");
      out.write("      baseField    : \"element_4\",\n");
      out.write("      displayArea  : \"calendar_4\",\n");
      out.write("      button     : \"cal_img_4\",\n");
      out.write("      ifFormat   : \"%B %e, %Y\",\n");
      out.write("      onSelect   : selectEuropeDate\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("     \n");
      out.write("    </li>   <li id=\"li_7\" >\n");
      out.write("    <label class=\"description\" for=\"element_7\">Estado civil </label>\n");
      out.write("    <div>\n");
      out.write("    <select class=\"element select medium\" id=\"element_7\" name=\"element_7\"> \n");
      out.write("      <option value=\"\" selected=\"selected\"></option>\n");
      out.write("<option value=\"1\" >Soltero</option>\n");
      out.write("<option value=\"2\" >Casado</option>\n");
      out.write("<option value=\"3\" >Divorciado</option>\n");
      out.write("<option value=\"4\" >Viudo</option>\n");
      out.write("\n");
      out.write("    </select>\n");
      out.write("    </div> \n");
      out.write("    </li>   <li id=\"li_3\" >\n");
      out.write("    <label class=\"description\" for=\"element_3\">Telefono </label>\n");
      out.write("    <div>\n");
      out.write("      <input id=\"element_3\" name=\"element_3\" class=\"element text medium\" type=\"text\" maxlength=\"255\" value=\"\"/> \n");
      out.write("    </div> \n");
      out.write("    </li>   <li id=\"li_5\" >\n");
      out.write("    <label class=\"description\" for=\"element_5\">Email </label>\n");
      out.write("    <div>\n");
      out.write("      <input id=\"element_5\" name=\"element_5\" class=\"element text medium\" type=\"text\" maxlength=\"255\" value=\"\"/> \n");
      out.write("    </div> \n");
      out.write("    </li>\n");
      out.write("      \n");
      out.write("          <li class=\"buttons\">\n");
      out.write("          <input type=\"hidden\" name=\"form_id\" value=\"1073662\" />\n");
      out.write("          \n");
      out.write("        <input id=\"saveForm\" class=\"button_text\" type=\"submit\" name=\"submit\" value=\"Submit\" />\n");
      out.write("    </li>\n");
      out.write("      </ul>\n");
      out.write("    </form></td> \n");
      out.write("    <td><a href=\"exito.html\"><input type=\"submit\"></a></td>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("<div id=\"container\" class=\"clear\">\n");
      out.write("    <!-- Slider --><!-- main content --><!-- ########################################################################################## -->\n");
      out.write("    <!-- ########################################################################################## -->\n");
      out.write("    <!-- ########################################################################################## -->\n");
      out.write("    <!-- ########################################################################################## --><!-- / content body -->\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- Footer -->\n");
      out.write("<div class=\"wrapper row3\">\n");
      out.write("  <footer id=\"footer\" class=\"clear\">\n");
      out.write("    <p class=\"fl_left\">Copyright &copy; 2012 - All Rights Reserved - <a href=\"#\">Domain Name</a></p>\n");
      out.write("    <p class=\"fl_right\">Equipo Verde</p>\n");
      out.write("  </footer>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.el.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost:3306/fragilidad?zeroDateTimeBehavior=convertToNull");
    _jspx_th_sql_setDataSource_0.setUser("andresvilla");
    _jspx_th_sql_setDataSource_0.setPassword("81092");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }
}
