package com.kn.multithreading4;

public class MyThread extends Thread{

	@Override
	public void run() {
		if(Thread.currentThread().getName().equalsIgnoreCase("number")) {
			printNumbers();
		}else {
			printCharacters();
		}
	}
	
	public void printNumbers() {
		System.out.println("Printing Number Started..");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("Printing Number Completed..");
	}
	
	public void printCharacters() {
		System.out.println("Printing Character Started..");
		for(int i=65;i<=74;i++) {
			System.out.println((char)(i));
		}
		System.out.println("Printing Character Completed..");
	}
}
