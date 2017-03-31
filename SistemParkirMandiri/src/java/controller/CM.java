/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author LABKOM
 */
public class CM {
    public Connection con;
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/parkir";
    private String username = "root";
    private String password = "";
    
    public Connection logOn() {
        try {
            // Load JDBC Driver
            Class.forName(driver).newInstance();
            // Buat object Connection
            con = DriverManager.getConnection(url,
                    username, password);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error occoured "
                    + "when LogIn" + ex);
        }
        return con;
    }

    public void logOff() {
        try {
            // Tutup Koneksi
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error occoured when LogOff"
                    + ex);
        }
    }

    public void connect() {
        try {
            con = logOn();
        } catch (Exception e) {
            System.out.println("Error occured " + "when connecting to "
                    + "database");
        }
    }

    public void disconnect() {
        try {
            logOff();
        } catch (Exception e) {
            System.out.println("Error occured " + "when disconnecting to "
                    + "database");
        }
    }
}
