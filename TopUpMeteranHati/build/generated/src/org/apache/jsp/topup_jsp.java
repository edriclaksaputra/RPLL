package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class topup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->\n");
      out.write("<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->\n");
      out.write("<!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Elate &mdash; 100% Free Fully Responsive HTML5 Template by FREEHTML5.co</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"Free HTML5 Template by FREEHTML5.CO\" />\n");
      out.write("        <meta name=\"keywords\" content=\"free html5, free template, free bootstrap, html5, css3, mobile first, responsive\" />\n");
      out.write("        <meta name=\"author\" content=\"FREEHTML5.CO\" />\n");
      out.write("\n");
      out.write("        <!-- \n");
      out.write("              //////////////////////////////////////////////////////\n");
      out.write("      \n");
      out.write("              FREE HTML5 TEMPLATE \n");
      out.write("              DESIGNED & DEVELOPED by FREEHTML5.CO\n");
      out.write("                      \n");
      out.write("              Website: \t\thttp://freehtml5.co/\n");
      out.write("              Email: \t\t\tinfo@freehtml5.co\n");
      out.write("              Twitter: \t\thttp://twitter.com/fh5co\n");
      out.write("              Facebook: \t\thttps://www.facebook.com/fh5co\n");
      out.write("      \n");
      out.write("              //////////////////////////////////////////////////////\n");
      out.write("        -->\n");
      out.write("\n");
      out.write("        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\">\n");
      out.write("\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,300,600,400italic,700' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <!-- Animate.css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("        <!-- Icomoon Icon Fonts-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("        <!-- Simple Line Icons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/simple-line-icons.css\">\n");
      out.write("        <!-- Magnific Popup -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("        <!-- Bootstrap  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\n");
      out.write("        <!-- \n");
      out.write("        Default Theme Style \n");
      out.write("        You can change the style.css (default color purple) to one of these styles\n");
      out.write("        \n");
      out.write("        1. pink.css\n");
      out.write("        2. blue.css\n");
      out.write("        3. turquoise.css\n");
      out.write("        4. orange.css\n");
      out.write("        5. lightblue.css\n");
      out.write("        6. brown.css\n");
      out.write("        7. green.css\n");
      out.write("\n");
      out.write("        -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style4.css\">\n");
      out.write("\n");
      out.write("        <!-- Styleswitcher ( This style is for demo purposes only, you may delete this anytime. ) -->\n");
      out.write("        <link rel=\"stylesheet\" id=\"theme-switch\" href=\"css/style4.css\">\n");
      out.write("        <!-- End demo purposes only -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            /* For demo purpose only */\n");
      out.write("\n");
      out.write("            /* For Demo Purposes Only ( You can delete this anytime :-) */\n");
      out.write("            #colour-variations {\n");
      out.write("                padding: 10px;\n");
      out.write("                -webkit-transition: 0.5s;\n");
      out.write("                -o-transition: 0.5s;\n");
      out.write("                transition: 0.5s;\n");
      out.write("                width: 140px;\n");
      out.write("                position: fixed;\n");
      out.write("                left: 0;\n");
      out.write("                top: 100px;\n");
      out.write("                z-index: 999999;\n");
      out.write("                background: #fff;\n");
      out.write("                /*border-radius: 4px;*/\n");
      out.write("                border-top-right-radius: 4px;\n");
      out.write("                border-bottom-right-radius: 4px;\n");
      out.write("                -webkit-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);\n");
      out.write("                -moz-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);\n");
      out.write("                -ms-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);\n");
      out.write("                box-shadow: 0 0 9px 0 rgba(0,0,0,.1);\n");
      out.write("            }\n");
      out.write("            #colour-variations.sleep {\n");
      out.write("                margin-left: -140px;\n");
      out.write("            }\n");
      out.write("            #colour-variations h3 {\n");
      out.write("                text-align: center;;\n");
      out.write("                font-size: 11px;\n");
      out.write("                letter-spacing: 2px;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                color: #777;\n");
      out.write("                margin: 0 0 10px 0;\n");
      out.write("                padding: 0;;\n");
      out.write("            }\n");
      out.write("            #colour-variations ul,\n");
      out.write("            #colour-variations ul li {\n");
      out.write("                padding: 0;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("            #colour-variations li {\n");
      out.write("                list-style: none;\n");
      out.write("                display: block;\n");
      out.write("                margin-bottom: 5px!important;\n");
      out.write("                float: left;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            #colour-variations li a {\n");
      out.write("                width: 100%;\n");
      out.write("                position: relative;\n");
      out.write("                display: block;\n");
      out.write("                overflow: hidden;\n");
      out.write("                -webkit-border-radius: 4px;\n");
      out.write("                -moz-border-radius: 4px;\n");
      out.write("                -ms-border-radius: 4px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                -webkit-transition: 0.4s;\n");
      out.write("                -o-transition: 0.4s;\n");
      out.write("                transition: 0.4s;\n");
      out.write("            }\n");
      out.write("            #colour-variations li a:hover {\n");
      out.write("                opacity: .9;\n");
      out.write("            }\n");
      out.write("            #colour-variations li a > span {\n");
      out.write("                width: 33.33%;\n");
      out.write("                height: 20px;\n");
      out.write("                float: left;\n");
      out.write("                display: -moz-inline-stack;\n");
      out.write("                display: inline-block;\n");
      out.write("                zoom: 1;\n");
      out.write("                *display: inline;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .option-toggle {\n");
      out.write("                position: absolute;\n");
      out.write("                right: 0;\n");
      out.write("                top: 0;\n");
      out.write("                margin-top: 5px;\n");
      out.write("                margin-right: -30px;\n");
      out.write("                width: 30px;\n");
      out.write("                height: 30px;\n");
      out.write("                background: #f64662;\n");
      out.write("                text-align: center;\n");
      out.write("                border-top-right-radius: 4px;\n");
      out.write("                border-bottom-right-radius: 4px;\n");
      out.write("                color: #fff;\n");
      out.write("                cursor: pointer;\n");
      out.write("                -webkit-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);\n");
      out.write("                -moz-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);\n");
      out.write("                -ms-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);\n");
      out.write("                box-shadow: 0 0 9px 0 rgba(0,0,0,.1);\n");
      out.write("            }\n");
      out.write("            .option-toggle i {\n");
      out.write("                top: 2px;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            .option-toggle:hover, .option-toggle:focus, .option-toggle:active {\n");
      out.write("                color:  #fff;\n");
      out.write("                text-decoration: none;\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <!-- End demo purposes only -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Modernizr JS -->\n");
      out.write("        <script src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("        <!-- FOR IE9 below -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header role=\"banner\" id=\"fh5co-header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- <div class=\"row\"> -->\n");
      out.write("                <nav class=\"navbar navbar-default\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <!-- Mobile Toggle Menu Button -->\n");
      out.write("                        <a href=\"#\" class=\"js-fh5co-nav-toggle fh5co-nav-toggle\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\"><i></i></a>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"index.html\">Meteran Patah Hati</a> \n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li class=\"active\"><a href=\"#\" data-nav-section=\"home\"><span>Home</span></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                <!-- </div> -->\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <section id=\"fh5co-about\" data-section=\"top-up\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12 section-heading text-center\">\n");
      out.write("                        <h2 class=\"to-animate\">Top Up Your Cards</h2>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-8 col-md-offset-2 subtext to-animate\">\n");
      out.write("                                <h3>Please fill in the following form for top up cards.</h3>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-12 to-animate\">\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-3 text-center col-md-offset-3\">\n");
      out.write("                            <h3 style='font-family:\"Source Sans Pro\", Arial, sans-serif'><font color=\"#929292\">Input your top up value: </font></h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3 text-center\">\n");
      out.write("                            <div class=\"btn-group\" data-toggle=\"buttons\">\n");
      out.write("                                <label class=\"btn btn-default\"><input type=\"radio\" name=\"opttopup\">10k</label>\n");
      out.write("                                <label class=\"btn btn-default\"><input type=\"radio\" name=\"opttopup\">50k</label>\n");
      out.write("                                <label class=\"btn btn-default\"><input type=\"radio\" name=\"opttopup\">100k</label> \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <center>\n");
      out.write("                        <div class=\"form-group \">\n");
      out.write("                            <input class=\"btn btn-primary btn-lg\" value=\"Submit\" type=\"submit\">\n");
      out.write("                        </div>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\t\n");
      out.write("        <footer id=\"footer\" role=\"contentinfo\">\n");
      out.write("            <a href=\"#\" class=\"gotop js-gotop\"><i class=\"icon-arrow-up2\"></i></a>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <div class=\"col-md-12 text-center\">\n");
      out.write("                        <p>&copy; Elate Free HTML5. All Rights Reserved. <br>Created by <a href=\"http://freehtml5.co/\" target=\"_blank\">FREEHTML5.co</a> Images: <a href=\"http://pexels.com/\" target=\"_blank\">Pexels</a>, <a href=\"http://plmd.me/\" target=\"_blank\">plmd.me</a></p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12 text-center\">\n");
      out.write("                        <ul class=\"social social-circle\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"icon-twitter\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"icon-facebook\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\"><i class=\"icon-youtube\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div id=\"myModal\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                <!-- Modal content-->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h4 class=\"modal-title\">Modal Header</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <p>Some text in the modal.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <!-- jQuery Easing -->\n");
      out.write("        <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Waypoints -->\n");
      out.write("        <script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("        <!-- Stellar Parallax -->\n");
      out.write("        <script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("        <!-- Counter -->\n");
      out.write("        <script src=\"js/jquery.countTo.js\"></script>\n");
      out.write("        <!-- Magnific Popup -->\n");
      out.write("        <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("        <script src=\"js/magnific-popup-options.js\"></script>\n");
      out.write("        <!-- Google Map -->\n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCefOgb1ZWqYtj7raVSmN4PL2WkTrc-KyA&sensor=false\"></script>\n");
      out.write("        <script src=\"js/google_map.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- For demo purposes only styleswitcher ( You may delete this anytime ) -->\n");
      out.write("        <script src=\"js/jquery.style.switcher.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $('#colour-variations ul').styleSwitcher({\n");
      out.write("                    defaultThemeId: 'theme-switch',\n");
      out.write("                    hasPreview: false,\n");
      out.write("                    cookie: {\n");
      out.write("                        expires: 30,\n");
      out.write("                        isManagingLoad: true\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                $('.option-toggle').click(function () {\n");
      out.write("                    $('#colour-variations').toggleClass('sleep');\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- End demo purposes only -->\n");
      out.write("\n");
      out.write("        <!-- Main JS (Do not remove) -->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
