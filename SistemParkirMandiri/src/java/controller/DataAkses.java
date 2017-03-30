/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.hibernate.SessionFactory;
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
    
    
}
