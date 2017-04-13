/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Mobil;
import model.User;

/**
 *
 * @author Edric-PC
 */
public class cekKendaraan {
    
    public String cekMobil(String nokend) throws SQLException{
        String refId = null;
        CM conn = new CM();
        conn.connect();
        Statement stm = conn.con.createStatement();
        ResultSet hasil = stm.executeQuery("Select * from mobil where noKendaraan = '"+nokend);
        while (hasil.next()) {
            refId = hasil.getString("rfid");
        }
        return refId;
    }
}
