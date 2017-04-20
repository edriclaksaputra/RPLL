/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
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

    public DataAkses() {
        System.out.println("in to Data Akses");
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable e) {
            System.err.println("Failed to create sessionFactory object." + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public User getUser(String id) {
        Session session = factory.openSession();
        ArrayList<User> userLogin = null;
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from User where rfid='" + id + "'");
        userLogin = (ArrayList<User>) q.list();
        tx.commit();
        session.close();
        if (userLogin.size()==0) {
            return null;
        } else {
            return userLogin.get(0);
        }
    }

    public boolean updateDuitUser(String id, int duit) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        User user = (User) session.get(User.class, id);

        int total = user.getSaldo() + duit;
        if (user.getStatusKartu().equals("block")) {
            return false;
        } else {
            user.setSaldo(total);
            tx.commit();
            session.close();
            return true;
        }
    }
}
