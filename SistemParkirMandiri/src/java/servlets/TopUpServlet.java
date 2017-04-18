/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import controller.DataAkses;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author Lenovo
 */
@WebServlet(name = "TopUpServlet", urlPatterns = {"/TopUpServlet"})
public class TopUpServlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        DataAkses da = new DataAkses();
        PrintWriter out = response.getWriter();
        String idDriver = request.getParameter("idDriver");
        int jmlTopUp = Integer.parseInt(request.getParameter("jmlTopUp"));
        System.out.println("jumlah top up = "+jmlTopUp);
        User u = da.getUser(idDriver);
        if(u.getRfid().equalsIgnoreCase(idDriver) && u.getStatusKartu().equalsIgnoreCase("aktif")){
            User baru = new User();
            baru.setRfid(idDriver);
            baru.setSaldo(jmlTopUp);
            if(da.updateUser(baru)){
                System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            };
        }else{
            out.println("<h1>Tidak dapat diproses!</h1>");
        }
        request.setAttribute("rfid", idDriver);
        request.setAttribute("jml", jmlTopUp);
        RequestDispatcher rs = request.getRequestDispatcher("TopUpEnd.jsp");
        rs.include(request, response);
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
