package model;
// Generated Apr 20, 2017 10:34:59 AM by Hibernate Tools 4.3.1



/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private String rfid;
     private int saldo;
     private String nama;
     private String statusKartu;

    public User() {
    }

    public User(String rfid, int saldo, String nama, String statusKartu) {
       this.rfid = rfid;
       this.saldo = saldo;
       this.nama = nama;
       this.statusKartu = statusKartu;
    }
   
    public String getRfid() {
        return this.rfid;
    }
    
    public void setRfid(String rfid) {
        this.rfid = rfid;
    }
    public int getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getStatusKartu() {
        return this.statusKartu;
    }
    
    public void setStatusKartu(String statusKartu) {
        this.statusKartu = statusKartu;
    }




}


