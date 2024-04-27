package com.kn.multithreading3;

public class InstagramApp {

	public static void main(String[] args) {
		System.out.println("Instagram applicatin started");
		
		Chatting c1 = new Chatting();
		Reels r1 = new Reels();
		
		c1.start();
		r1.start();
		
		try {
			c1.join();
			r1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Instagram applicatin Ended");

	}

}
