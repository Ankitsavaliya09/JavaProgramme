package com.kn.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kn.bean.Laptop;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Laptop l1 = (Laptop) context.getBean("l1");
		System.out.println("---> Object created by Spring = " + l1);
    }
}
