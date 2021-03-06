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
   
   public User getUser(String id){
        Session session = factory.openSession();
        ArrayList<User> hasil = null;
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from User where rfid= :id");
        q.setParameter("id", id);
        hasil = (ArrayList<User>) q.list();
        tx.commit();
        session.close();
        return hasil.get(0);
    }
   
   public boolean updateUser(User baru){
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        User user = (User)session.get(User.class, baru.getRfid());

        System.out.println("UPDATE = "+ user.getSaldo());
        System.out.println("UPDATE 2 = "+ baru.getSaldo());
        int sum = user.getSaldo()+baru.getSaldo();
        user.setSaldo(sum);
        tx.commit();
        session.close();
        return true;
    }
}
