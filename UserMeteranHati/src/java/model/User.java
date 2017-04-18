package model;
// Generated Apr 17, 2017 6:33:02 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private String rfid;
     private int saldo;
     private String nama;
     private String statusKartu;
     private Set<Mobil> mobils = new HashSet<Mobil>(0);

    public User() {
    }

	
    public User(String rfid, int saldo, String nama, String statusKartu) {
        this.rfid = rfid;
        this.saldo = saldo;
        this.nama = nama;
        this.statusKartu = statusKartu;
    }
    public User(String rfid, int saldo, String nama, String statusKartu, Set<Mobil> mobils) {
       this.rfid = rfid;
       this.saldo = saldo;
       this.nama = nama;
       this.statusKartu = statusKartu;
       this.mobils = mobils;
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
    public Set<Mobil> getMobils() {
        return this.mobils;
    }
    
    public void setMobils(Set<Mobil> mobils) {
        this.mobils = mobils;
    }




}


