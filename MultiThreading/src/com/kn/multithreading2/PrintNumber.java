package com.kn.multithreading2;

public class PrintNumber implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Number = "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
