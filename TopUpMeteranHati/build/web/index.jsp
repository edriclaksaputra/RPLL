<%-- 
    Document   : index
    Created on : Apr 20, 2017, 10:07:31 PM
    Author     : Edric-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Elate &mdash; 100% Free Fully Responsive HTML5 Template by FREEHTML5.co</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="Free HTML5 Template by FREEHTML5.CO" />
        <meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
        <meta name="author" content="FREEHTML5.CO" />

        <!-- 
              //////////////////////////////////////////////////////
      
              FREE HTML5 TEMPLATE 
              DESIGNED & DEVELOPED by FREEHTML5.CO
                      
              Website: 		http://freehtml5.co/
              Email: 			info@freehtml5.co
              Twitter: 		http://twitter.com/fh5co
              Facebook: 		https://www.facebook.com/fh5co
      
              //////////////////////////////////////////////////////
        -->

        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
        <link rel="shortcut icon" href="favicon.ico">

        <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,300,600,400italic,700' rel='stylesheet' type='text/css'>

        <!-- Animate.css -->
        <link rel="stylesheet" href="css/animate.css">
        <!-- Icomoon Icon Fonts-->
        <link rel="stylesheet" href="css/icomoon.css">
        <!-- Simple Line Icons -->
        <link rel="stylesheet" href="css/simple-line-icons.css">
        <!-- Magnific Popup -->
        <link rel="stylesheet" href="css/magnific-popup.css">
        <!-- Bootstrap  -->
        <link rel="stylesheet" href="css/bootstrap.css">

        <!-- 
        Default Theme Style 
        You can change the style.css (default color purple) to one of these styles
        
        1. pink.css
        2. blue.css
        3. turquoise.css
        4. orange.css
        5. lightblue.css
        6. brown.css
        7. green.css

        -->
        <link rel="stylesheet" href="css/style4.css">

        <!-- Styleswitcher ( This style is for demo purposes only, you may delete this anytime. ) -->
        <link rel="stylesheet" id="theme-switch" href="css/style4.css">
        <!-- End demo purposes only -->


        <style>
            /* For demo purpose only */

            /* For Demo Purposes Only ( You can delete this anytime :-) */
            #colour-variations {
                padding: 10px;
                -webkit-transition: 0.5s;
                -o-transition: 0.5s;
                transition: 0.5s;
                width: 140px;
                position: fixed;
                left: 0;
                top: 100px;
                z-index: 999999;
                background: #fff;
                /*border-radius: 4px;*/
                border-top-right-radius: 4px;
                border-bottom-right-radius: 4px;
                -webkit-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);
                -moz-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);
                -ms-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);
                box-shadow: 0 0 9px 0 rgba(0,0,0,.1);
            }
            #colour-variations.sleep {
                margin-left: -140px;
            }
            #colour-variations h3 {
                text-align: center;;
                font-size: 11px;
                letter-spacing: 2px;
                text-transform: uppercase;
                color: #777;
                margin: 0 0 10px 0;
                padding: 0;;
            }
            #colour-variations ul,
            #colour-variations ul li {
                padding: 0;
                margin: 0;
            }
            #colour-variations li {
                list-style: none;
                display: block;
                margin-bottom: 5px!important;
                float: left;
                width: 100%;
            }
            #colour-variations li a {
                width: 100%;
                position: relative;
                display: block;
                overflow: hidden;
                -webkit-border-radius: 4px;
                -moz-border-radius: 4px;
                -ms-border-radius: 4px;
                border-radius: 4px;
                -webkit-transition: 0.4s;
                -o-transition: 0.4s;
                transition: 0.4s;
            }
            #colour-variations li a:hover {
                opacity: .9;
            }
            #colour-variations li a > span {
                width: 33.33%;
                height: 20px;
                float: left;
                display: -moz-inline-stack;
                display: inline-block;
                zoom: 1;
                *display: inline;
            }


            .option-toggle {
                position: absolute;
                right: 0;
                top: 0;
                margin-top: 5px;
                margin-right: -30px;
                width: 30px;
                height: 30px;
                background: #f64662;
                text-align: center;
                border-top-right-radius: 4px;
                border-bottom-right-radius: 4px;
                color: #fff;
                cursor: pointer;
                -webkit-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);
                -moz-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);
                -ms-box-shadow: 0 0 9px 0 rgba(0,0,0,.1);
                box-shadow: 0 0 9px 0 rgba(0,0,0,.1);
            }
            .option-toggle i {
                top: 2px;
                position: relative;
            }
            .option-toggle:hover, .option-toggle:focus, .option-toggle:active {
                color:  #fff;
                text-decoration: none;
                outline: none;
            }
        </style>
        <!-- End demo purposes only -->


        <!-- Modernizr JS -->
        <script src="js/modernizr-2.6.2.min.js"></script>
        <!-- FOR IE9 below -->
        <!--[if lt IE 9]>
        <script src="js/respond.min.js"></script>
        <![endif]-->

    </head>
    <body>
        <header role="banner" id="fh5co-header">
            <div class="container">
                <!-- <div class="row"> -->
                <nav class="navbar navbar-default">
                    <div class="navbar-header">
                        <!-- Mobile Toggle Menu Button -->
                        <a href="#" class="js-fh5co-nav-toggle fh5co-nav-toggle" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"><i></i></a>
                        <a class="navbar-brand" href="index.jsp">Meteran Patah Hati</a> 
                    </div>
                    <div id="navbar" class="navbar-collapse collapse">
                        <ul class="nav navbar-nav navbar-right">
                            <li class="active"><a href="#" data-nav-section="home"><span>Home</span></a></li>
                        </ul>
                    </div>
                </nav>
                <!-- </div> -->
            </div>
        </header>

        <%
            String hasil = request.getParameter("hasil");
            if (hasil != null) {
                out.println("<span style='color:red;'>" + hasil + "</span>");
            }
        %>
        
        <section id="fh5co-home" data-section="home" style="background-image: url(images/full_image_2.jpg);" data-stellar-background-ratio="0.5">
            <div class="gradient"></div>
            <div class="container">
                <div class="text-wrap">
                    <div class="text-inner">
                        <div class="row">
                            <div class="col-md-8 col-md-offset-2">
                                <image src="images/insert-card.png" width="100" height="100" class="to-animate"></image>
                                <h2 class="to-animate">Please insert your card</h2>
                            </div>
                        </div>
                        <div class="row">
                            <form method='get' action='Login'>
                                <div class="col-md-3 col-md-offset-4">
                                <div class="form-group">
                                    <label class="sr-only">Id Card</label>
                                    <input name='rfid' class="form-control" placeholder="Id Card" type="text">
                                </div>
                            </div>
                            <div class="col-md-1">
                                <div class="form-group ">
                                    <input class="btn btn-primary btn-lg" value="Ok" type="submit">
                                </div>
                            </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div class="slant"></div>
        </section>	
        <footer id="footer" role="contentinfo">
            <div class="container">
                <div class="">
                    <div class="col-md-12 text-center">
                        <p>&copy; Elate Free HTML5. All Rights Reserved. <br>Created by <a href="http://freehtml5.co/" target="_blank">FREEHTML5.co</a> Images: <a href="http://pexels.com/" target="_blank">Pexels</a>, <a href="http://plmd.me/" target="_blank">plmd.me</a></p>

                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 text-center">
                        <ul class="social social-circle">
                            <li><a href="#"><i class="icon-twitter"></i></a></li>
                            <li><a href="#"><i class="icon-facebook"></i></a></li>
                            <li><a href="#"><i class="icon-youtube"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </footer>
        <!-- Modal -->
        <div id="myModal" class="modal fade" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title">Modal Header</h4>
                    </div>
                    <div class="modal-body">
                        <p>Some text in the modal.</p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>

            </div>
        </div>

        <!-- jQuery -->
        <script src="js/jquery.min.js"></script>
        <!-- jQuery Easing -->
        <script src="js/jquery.easing.1.3.js"></script>
        <!-- Bootstrap -->
        <script src="js/bootstrap.min.js"></script>
        <!-- Waypoints -->
        <script src="js/jquery.waypoints.min.js"></script>
        <!-- Stellar Parallax -->
        <script src="js/jquery.stellar.min.js"></script>
        <!-- Counter -->
        <script src="js/jquery.countTo.js"></script>
        <!-- Magnific Popup -->
        <script src="js/jquery.magnific-popup.min.js"></script>
        <script src="js/magnific-popup-options.js"></script>
        <!-- Google Map -->
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCefOgb1ZWqYtj7raVSmN4PL2WkTrc-KyA&sensor=false"></script>
        <script src="js/google_map.js"></script>

        <!-- For demo purposes only styleswitcher ( You may delete this anytime ) -->
        <script src="js/jquery.style.switcher.js"></script>
        <script>
            $(function () {
                $('#colour-variations ul').styleSwitcher({
                    defaultThemeId: 'theme-switch',
                    hasPreview: false,
                    cookie: {
                        expires: 30,
                        isManagingLoad: true
                    }
                });
                $('.option-toggle').click(function () {
                    $('#colour-variations').toggleClass('sleep');
                });
            });
        </script>
        <!-- End demo purposes only -->

        <!-- Main JS (Do not remove) -->
        <script src="js/main.js"></script>

    </body>
</html>