package com.kn.multithreading1;

public class PrintCharacter extends Thread{

	@Override
	public void run() {
		for(int i=65;i<=74;i++) {
			System.out.println((char)(i));
		}
	}

	
}
