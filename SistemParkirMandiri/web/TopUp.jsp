<%-- 
    Document   : TopUp
    Created on : Mar 14, 2017, 5:28:27 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Top up</title>
    </head>
    <body>
        
        <form action="TopUpServlet" method="POST">
            <h1>No. ID Driver: </h1>
            <input type="text" name="idDriver"><br>
            <h1>Jumlah Top Up: </h1>
            <input type="text" name="jmlTopUp"><br>
            <input type="submit" value="OK">
        </form>
    </body>
</html>
