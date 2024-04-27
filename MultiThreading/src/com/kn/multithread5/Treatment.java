package com.kn.multithread5;

public class Treatment implements Runnable{

	@Override
	synchronized public void run() {
		try {
			System.out.println("Treatment started for "+Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment in-progress for "+Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment Completed for "+Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
