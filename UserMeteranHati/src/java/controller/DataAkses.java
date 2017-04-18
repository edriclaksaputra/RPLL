/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Daftarparkir;
import model.Transaksi;
import model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author natasya angelia
 */
public class DataAkses {
    
    private static SessionFactory factory;
   
   public DataAkses(){
       System.out.println("in to Data Akses");
       try {
           factory = new Configuration().configure().buildSessionFactory();
       } catch (Throwable e) {
           System.err.println("Failed to create sessionFactory object."+e);
           throw new ExceptionInInitializerError(e);
       }
   }
   
   public boolean cekCard(String id){
       boolean status = false;
       Session session = factory.openSession();
       ArrayList<User> hasil = null;
       Transaction tx = session.beginTransaction();
       Query q = session.createQuery("from User where rfid = "+id);
       hasil = (ArrayList<User>) q.list();
       tx.commit();
       session.close();
       
       if(q!=null){
           status = true;
       }
       return status;
   }
   
   public Daftarparkir cekPark(String id,String noKend){
       boolean status = false;
       Session session = factory.openSession();
       ArrayList<Daftarparkir> hasil = null;
       Transaction tx = session.beginTransaction();
       Query q = session.createQuery("from daftarparkir where idUser = "+id+" and noKend = "+noKend);
       hasil = (ArrayList<Daftarparkir>) q.list();
       tx.commit();
       session.close();
       
       if(q!=null){
           status = true;
       }
       return hasil.get(0);
   }
   
   public boolean deleteParkir(int idPark){
       Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Daftarparkir park = (Daftarparkir) session.get(Daftarparkir.class, idPark);
        session.delete(park);
        tx.commit();
        session.close();
        return true;
   }
   
   public boolean insertTransaksi(Transaksi transaksi){
       Session session = factory.openSession();
       Transaction tx = session.beginTransaction();
       session.save(transaksi);
       tx.commit();
       session.close();
       return true;
   }
   
   public boolean insertDaftarParkir(Daftarparkir park){
       Session session = factory.openSession();
       Transaction tx = session.beginTransaction();
       session.save(park);
       tx.commit();
       session.close();
       return true;
   }
   
   public boolean updateUserMoney(String id,int money){
       Session session = factory.openSession();
       Transaction tx = session.beginTransaction();
       User oldUser = (User)session.get(User.class, id);
       oldUser.setSaldo(oldUser.getSaldo()-money);
       tx.commit();
       session.close();
       return true;
   }
}
