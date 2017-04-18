/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import controller.DataAkses;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Daftarparkir;
import model.Mobil;
import model.Transaksi;

/**
 *
 * @author natasya angelia
 */
@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {

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
            out.println("<title>Servlet UserServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UserServlet at " + request.getContextPath() + "</h1>");
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
        String id = request.getParameter("rfid");
        id = "1234";
        String noKend = request.getParameter("noKend");
        DataAkses da = new DataAkses();
        Daftarparkir parkCar = da.cekPark(id, noKend);
        if(parkCar.getIdUser().isEmpty()){
            System.out.println("tidak ada parkir");
        }else{
            String myTime = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
            Date date = null;
            try {
                date = sdf.parse(myTime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            int hourAwal = parkCar.getStartTime().getHours();
            int minuteAwal = parkCar.getStartTime().getMinutes();
            int secondAwal = parkCar.getStartTime().getSeconds();
            int hourAkhir = date.getHours();
            int minuteAkhir = date.getMinutes();
            int secondAkhir = date.getSeconds();
            
            int h =(hourAwal*3600)+(minuteAwal*60)+secondAwal;
            int h1=(hourAkhir*3600)+(minuteAkhir*60)+secondAkhir;
            int sl = h1 - h;
            int det = sl % 3600;
            int det1 = det % 60;
            int men = det / 60;
            int jam = sl/3600;
            
            String str = jam+":"+men+":"+det1;
            DateFormat formatter = new SimpleDateFormat("hh:mm:ss a");
            Date waktu = null;
            try {
                waktu = formatter.parse(str);
            } catch (ParseException ex) {
                Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            int biaya = jam * 2000;
            Mobil mobil;
            Transaksi transaksi = new Transaksi();
            transaksi.setBill(biaya);
            transaksi.setDate(waktu);
            transaksi.setEndTime(date);
            transaksi.setNoParkir(parkCar.getNoKend());
            transaksi.setStartTime(parkCar.getStartTime());
            transaksi.setStatusTrasaksi("lunas");
            
            int idPard = parkCar.getIdParkirMasuk();
            if(da.deleteParkir(idPard)){
                if(da.insertTransaksi(transaksi)){
                    System.out.println("berhasil dimasukan ke transaksi");
                    if(da.updateUserMoney(id, biaya)){
                        System.out.println("money berhasil di update");
                    }else{
                        System.out.println("money gagal di update");
                    }
                }else{
                    System.out.println("failed transaksi");
                }
            }else{
                System.out.println("failed delete parkir");
            }
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
        processRequest(request, response);
        
        String id = request.getParameter("rfid");
        id = "1234";
        String noKend = request.getParameter("noKend");
        DataAkses da = new DataAkses();
        if(da.cekCard(id)){
            Daftarparkir park = new Daftarparkir();
            park.setIdUser(id);
            park.setNoKend(noKend);
            String myTime = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
            Date date = null;
            try {
                date = sdf.parse(myTime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            park.setStartTime(date);
            
            if(da.insertDaftarParkir(park)){
                System.out.println("insert parkir berhasil");
            }else{
                System.out.println("failed parkir");
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
