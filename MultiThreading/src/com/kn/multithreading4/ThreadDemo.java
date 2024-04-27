package com.kn.multithreading4;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		
		MyThread t2 = new MyThread();
		
		t1.setName("number");
		t2.setName("Character");
		
		t1.start();
		t2.start();

	}

}
