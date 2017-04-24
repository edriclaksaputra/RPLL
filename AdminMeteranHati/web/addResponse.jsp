<%-- 
    Document   : addResponse
    Created on : Apr 21, 2017, 8:11:45 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <link rel="stylesheet" href="css/style.css">

	<!-- Styleswitcher ( This style is for demo purposes only, you may delete this anytime. ) -->
	<link rel="stylesheet" id="theme-switch" href="css/style.css">
	<!-- End demo purposes only -->
    </head>
    
    <body>
        <br><br><br><br><br>
        <%
            String code = request.getParameter("code");
            String id = request.getParameter("id");
            
            if(code.equalsIgnoreCase("success")){
        %>
        <div class="col-md-12 section-heading text-center">
            <h2 class="to-animate">Congratulations! <%=id%>'s card is added.</h2>
        </div>
        <%
            }else if(code.equalsIgnoreCase("fail")){
            %>
        <div class="col-md-12 section-heading text-center">
            <h2 class="to-animate">Sorry :( Fail to proceed...</h2>
        </div>    
        <%
            }else{
            %>
        <div class="col-md-12 section-heading text-center">
            <h2 class="to-animate"><%=id%>'s Already Exist!!</h2>
        </div>
        <%}%>
        <div class="col-md-12 text-center">
            <div class="row">
                 <a href="index.jsp" class="btn btn-info" role="button"> Back </a>
            </div>
        </div>
    </body>
</html>
