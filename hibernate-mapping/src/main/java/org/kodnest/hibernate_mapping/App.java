package org.kodnest.hibernate_mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Technology t1 = new Technology();
    	Technology t2 = new Technology();
    	Technology t3 = new Technology();
    	Technology t4 = new Technology();
    	List<Technology> tech1 = new ArrayList<Technology>();
    	tech1.add(t1);
    	tech1.add(t3);
    	tech1.add(t4);
    	List<Technology> tech2 = new ArrayList<Technology>();
    	tech2.add(t2);
    	tech2.add(t3);
    	List<Technology> tech3 = new ArrayList<Technology>();
    	tech3.add(t1);
    	tech3.add(t2);
    	tech3.add(t3);
    	List<Technology> tech4 = new ArrayList<Technology>();
    	tech4.add(t3);
    	tech4.add(t4);
    	List<Technology> tech5 = new ArrayList<Technology>();
    	tech5.add(t1);
    	tech5.add(t2);
    	tech5.add(t3);
    	tech5.add(t4);
    	
    	Employee e1 = new Employee(1, "Amit", 'B', tech1);
    	Employee e2 = new Employee(2, "Ankit", 'A', tech2);
    	Employee e3 = new Employee(3, "Arun", 'C', tech3);
    	Employee e4 = new Employee(4, "Arav", 'B', tech4);
    	Employee e5 = new Employee(5, "Anjali", 'A', tech5);
    	
    	List<Employee> emp1 = new ArrayList<Employee>();
    	emp1.add(e1);
    	emp1.add(e3);
    	emp1.add(e5);
    	List<Employee> emp2 = new ArrayList<Employee>();
    	emp2.add(e2);
    	emp2.add(e3);
    	emp2.add(e5);
    	List<Employee> emp3 = new ArrayList<Employee>();
    	emp3.add(e1);
    	emp3.add(e2);
    	emp3.add(e3);
    	emp3.add(e4);
    	emp3.add(e5);
    	List<Employee> emp4 = new ArrayList<Employee>();
    	emp4.add(e1);
    	emp4.add(e4);
    	emp4.add(e5);
    	
    	t1.setTech_id(111);
    	t1.setTech_name("Java");
    	t1.setEmployee(emp1);
    	
    	t2.setTech_id(222);
    	t2.setTech_name("Python");
    	t2.setEmployee(emp2);
    	
    	t3.setTech_id(333);
    	t3.setTech_name("MySQL");
    	t3.setEmployee(emp3);
    	
    	t4.setTech_id(444);
    	t4.setTech_name("React");
    	t4.setEmployee(emp4);

    	Configuration conf = new Configuration();
    	conf.configure();
    	
    	SessionFactory factory = conf.buildSessionFactory();
        Session session = factory.openSession();
        Transaction trn =  session.beginTransaction();
        session.save(e1);
        session.save(e2);
        session.save(e3);
        session.save(e4);
        session.save(e5);
        session.save(t1);
        session.save(t2);
        session.save(t3);
        session.save(t4);
        trn.commit();
        System.out.println("==========> Done");
    }
}
