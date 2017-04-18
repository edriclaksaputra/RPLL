/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
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
   
   public boolean insertUser(User user){
       Session session = factory.openSession();
       Transaction tx = session.beginTransaction();
       session.save(user);
       tx.commit();
       session.close();
       return true;
   }
   
   public boolean blockUser(String id){
       Session session = factory.openSession();
       Transaction tx = session.beginTransaction();
       User oldUser = (User)session.get(User.class, id);
       oldUser.setStatusKartu("block");
       tx.commit();
       session.close();
       return true;
   }
}
