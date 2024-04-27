package com.kn.multithreading;

public class MyThreadDemo {

	public static void main(String[] args) {
		Thread t2 = Thread.currentThread();
		System.out.println(t2);
		
		MyThread mt = new MyThread();
		mt.start();
		mt.setName("MyThread");
		mt.setPriority(7);
	}

}
