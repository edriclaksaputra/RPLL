<%-- 
    Document   : MasukParkiran
    Created on : Mar 14, 2017, 11:19:51 PM
    Author     : Edric-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SPM || Keluar Pakiran</title>
    </head>
    <body>
        <form method='get' action="cekKendaraanServlet">
            <%  String failed = request.getParameter("failed");
                if (failed != null) {
                    out.println("<span style='color:red;'>" + failed + "</span>");
                }
            %>
            <h1 style="text-align: center; font-size: 42px">Masukan Nomor Kendaraan Anda</h1>
            <input style="margin-left: 37%; width: 500px; height: 50px" type="text" name="noKend"><br>
            <br>
            <label style=" float: left; margin-left: 50%;"></label>
            <input type='submit' value='OK' name='ok' style="float:left;margin-left: 50%"/>
        </form>
    </body>
</html>
