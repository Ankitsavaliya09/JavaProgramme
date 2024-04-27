package com.kn.multithreading3;

public class Chatting extends Thread{

	@Override
	public void run() {
		try {
			System.out.println("Chatting Started..");
			Thread.sleep(2000);
			System.out.println("Chitt chat chitt chat");
			Thread.sleep(2000);
			System.out.println("Chatting ended");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	
}
