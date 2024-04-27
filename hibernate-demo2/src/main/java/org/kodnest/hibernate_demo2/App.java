package org.kodnest.hibernate_demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Student s1 = new Student(1, "Ankit", 94);
    	Student s2 = new Student(2, "Nirav", 56);
    	Student s3 = new Student(3, "Riten", 77);

    	Bike b1 = new Bike(101, "KTM", 120000.0);
    	Bike b2 = new Bike(102, "Yamaha", 140000.0);
    	Bike b3 = new Bike(103, "Royal Enfield", 320000.0);

    	Configuration conf = new Configuration();
    	conf.configure();
    	
    	SessionFactory factory = conf.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trn =  session.beginTransaction();
        
        session.save(s1);
        session.save(s2);
        session.save(s3);
        session.save(b1);
        session.save(b2);
        session.save(b3);
        
        trn.commit();
        System.out.println("---> Done!");
    }
}
