<%-- 
    Document   : MasukParkiran
    Created on : Mar 14, 2017, 11:19:51 PM
    Author     : Edric-PC
--%>

<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SPM || Masuk Pakiran</title>
    </head>
    <body>
        
        <form method="post" action="masukParkiranServlet">
            <h1>Masukan Nomor Kendaraan Anda</h1>
            <input type="text" name="noKend"><br>
            <h1>Id Anda</h1>
            <input type="text" name="Id"><br>
            <input type="submit" value="Ok">
        </form>
    </body>
</html>
