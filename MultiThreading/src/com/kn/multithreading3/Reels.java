package com.kn.multithreading3;

public class Reels extends Thread{

	@Override
	public void run() {
		try {
			System.out.println("Reels Making");
			Thread.sleep(2000);
			System.out.println("Upload the reels");
			Thread.sleep(2000);
			System.out.println("Sharing the reels");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

