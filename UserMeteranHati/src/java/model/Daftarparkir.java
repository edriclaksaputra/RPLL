package model;
// Generated Apr 20, 2017 11:31:18 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Daftarparkir generated by hbm2java
 */
public class Daftarparkir  implements java.io.Serializable {


     private Integer idParkirMasuk;
     private String idUser;
     private String noKend;
     private Date startTime;

    public Daftarparkir() {
    }

    public Daftarparkir(String idUser, String noKend, Date startTime) {
       this.idUser = idUser;
       this.noKend = noKend;
       this.startTime = startTime;
    }
   
    public Integer getIdParkirMasuk() {
        return this.idParkirMasuk;
    }
    
    public void setIdParkirMasuk(Integer idParkirMasuk) {
        this.idParkirMasuk = idParkirMasuk;
    }
    public String getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
    public String getNoKend() {
        return this.noKend;
    }
    
    public void setNoKend(String noKend) {
        this.noKend = noKend;
    }
    public Date getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }




}


