<%-- 
    Document   : Daftar
    Created on : Mar 31, 2017, 3:56:01 AM
    Author     : natasya angelia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="daftarServlet" method="GET">
           <h1 style="text-align: center; font-size: 42px">Masukan Data Anda </h1><br>
            <h3 style="text-align: center; font-size: 42px"> ID : </h3>
            <input style="margin-left: 37%; width: 500px; height: 50px" type="text" name="rfid"><br>
            <h3 style="text-align: center; font-size: 42px"> Nama : </h3>
            <input style="margin-left: 37%; width: 500px; height: 50px" type="text" name="nama"><br>
            <button type=submit style="float: right; margin-right: 25%">OK</button><br>
            <button style="margin-left: 10%">Cancel</button> 
        </form>
        
    </body>
</html>
