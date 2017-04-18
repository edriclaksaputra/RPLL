<%-- 
    Document   : confirmBlock
    Created on : Mar 14, 2017, 5:40:37 PM
    Author     : Imelda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Apakah Anda yakin untuk memblock ID</h1>
        <br>
        <%
            String rfid = (String)request.getAttribute("rfid");
            %>
        <h1>ID <%=rfid%></h1>
        
        <input type="submit" value="YES" href="endBlock">
        <input type="submit" value="NO" href="block.jsp">
        
        
    </body>
</html>
