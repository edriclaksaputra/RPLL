/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import controller.DataAkses;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author natasya angelia
 */
@WebServlet(name = "AddCard", urlPatterns = {"/AddCard"})
public class AddCard extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddCard</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddCard at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        System.out.println("insert get AddCard");
        String idCard = request.getParameter("id-blocked");
        System.out.println("id blocked: "+idCard);
        DataAkses da = new DataAkses();
        boolean status = da.cekCard(idCard);
        if(status){
            if(da.blockUser(idCard)){
                System.out.println("berhasil memblock user");
            }else{
                System.out.println("failed");
            }
        }else{
            System.out.println("failed block user");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        System.out.println("insert post AddCard");
        System.out.println(request.getAttributeNames().toString());
        String idCard = request.getParameter("id-card");
        String name = request.getParameter("name");
        System.out.println("id: "+idCard);
        System.out.println("name: "+name);
        DataAkses da = new DataAkses();
        boolean status = da.cekCard(idCard);
        if(status){
            User user = new User();
            user.setNama(name);
            user.setRfid(idCard);
            user.setSaldo(10000);
            user.setStatusKartu("aktif");
            if(da.insertUser(user)){
                System.out.println("berhasil menambahkan user");
            }else{
                System.out.println("failed");
            }
        }else{
            System.out.println("sudah ada");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
