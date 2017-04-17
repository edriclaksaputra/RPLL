/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Locale;
import model.Mobil;
import model.Transaksi;
import model.User;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Lenovo
 */
public class DataAkses {
    private static SessionFactory factory;
    
    public DataAkses(){
        try{
            factory = new Configuration().configure().buildSessionFactory();
        }catch(Throwable ex){
            System.err.println("Failed to create sessionFactory object."+ ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    //User
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
        user.setSaldo(baru.getSaldo());
        tx.commit();
        session.close();
        return true;
    }
    
    public boolean insertUser(User user){
        Session session = factory.openSession();
        ArrayList<User> hasil = null;
        Transaction tx = session.beginTransaction();
        try{
           session.saveOrUpdate(user);
        } catch(Exception e){
            System.out.println("gagal insert");
        }
        
        tx.commit();
        session.close();
        return true;
    }
    
    //Mobil
    
    public boolean statusNoKend(String noKend){
        boolean status = false;
        Session session = factory.openSession();
        ArrayList<Mobil> hasil = null;
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Mobil where noKendaraan = "+noKend);
        hasil= (ArrayList<Mobil>) q.list();
        for( Mobil kendaraan : hasil){
            Hibernate.initialize(tx);
        }
        tx.commit();
        if(hasil != null){
            status = true;
        }
        return status;
    }
    
    public boolean insertParkiran(Transaksi X){
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try{
           session.save(X);
        } catch(Exception e){
            System.out.println("gagal insert");
        }
        tx.commit();
        session.close();
        return true;
    }
}
