package org.kodnest.hibernate_crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       //create();
       //read();
       //update();
    	delete();
    }

	public static void delete() {
		Configuration conf = new Configuration();
    	conf.configure();
    	
    	SessionFactory factory = conf.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trn =  session.beginTransaction();
        Laptop laptop = session.get(Laptop.class, 111);
        session.delete(laptop);
        trn.commit();
        System.out.println("Deleted Succesfully!");
	}

	public static void update() {
		Configuration conf = new Configuration();
    	conf.configure();
    	
    	SessionFactory factory = conf.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trn =  session.beginTransaction();
        Laptop laptop = session.get(Laptop.class, 111);
        session.save(laptop);
        laptop.setBrandName("Lenovo");
        laptop.setCost(80000);
        trn.commit();
        System.out.println("Updated Succesfully!");
	}

	public static void read() {
		Configuration conf = new Configuration();
    	conf.configure();
    	
    	SessionFactory factory = conf.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trn =  session.beginTransaction();
        Laptop laptop = session.get(Laptop.class, 111);
        trn.commit();
        System.out.println("Laptop fetched from databases - "+laptop);
	}

	public static void create() {
		Laptop laptop = new Laptop(111, "Dell", 50000);
		Configuration conf = new Configuration();
    	conf.configure();
    	
    	SessionFactory factory = conf.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trn =  session.beginTransaction();
        session.save(laptop);
        trn.commit();
        System.out.println("Laptop has been Created - "+laptop);
	}
}
