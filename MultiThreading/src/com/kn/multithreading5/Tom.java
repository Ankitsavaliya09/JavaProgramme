package com.kn.multithreading5;

public class Tom implements Runnable{

	Hospital h;

	public Tom(Hospital h) {
		this.h=h;
	}
	@Override
	public void run() {
		h.treatTom(); 
	}
	
	
}
