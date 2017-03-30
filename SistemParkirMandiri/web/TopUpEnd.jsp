<%-- 
    Document   : TopUpEnd
    Created on : Mar 14, 2017, 5:39:27 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Top Up End</title>
    </head>
    <body>
        <%
            String rfid = (String)request.getAttribute("rfid");
            int jml = (Integer)request.getAttribute("jml");
            %>
        <h1>ID <%=rfid%></h1>
        <h1>Telah Di Top Up Sebesar</h1>
        <h1>Rp<%=jml+""%>,-</h1>
        <button type="button">Keluar</button>
    </body>
</html>
