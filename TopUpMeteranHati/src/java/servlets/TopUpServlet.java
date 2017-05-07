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
import javax.servlet.http.HttpSession;
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
        PrintWriter out = response.getWriter();

        String id = request.getParameter("rfid");
        String value = request.getParameter("duit");

        boolean status = false;

        System.out.println(status);
        if (value == null) {
            RequestDispatcher rd = request.getRequestDispatcher("topup.jsp?hasil=Mohon Input Nominal Top Up");
            rd.forward(request, response);
        } else {
            int duit = Integer.parseInt(value);
            status = new DataAkses().updateDuitUser(id, duit);
            if (status == true) {
                User userLogin = new DataAkses().getUser(id);
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp?hasil=Terimakasih, username dengan id : " + id + " telah berhasil di top up sebesar : " + duit + " Rupiah, Total Saldo : " + userLogin.getSaldo());
                rd.forward(request, response);
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("topup.jsp?hasil=MAMPUS KARTU DI BLOCK");
                rd.forward(request, response);
            }
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
