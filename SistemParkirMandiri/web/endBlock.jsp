<%-- 
    Document   : endBlock
    Created on : Mar 14, 2017, 5:43:46 PM
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
        <%
            String rfid = (String)request.getAttribute("rfid");
            %>
        <h1>ID <%=rfid%></h1>
        <br>
        <h1>Telah Di Block</h1>
        <br>
        <input type="submit" value="Back" href="block.jsp">
        
    </body>
</html>
