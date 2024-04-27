package com.kn.multithreading6;

public class Customer implements Runnable{

	PizzaHouse ph;
	int num =1;
	public Customer(PizzaHouse ph) {
		this.ph=ph;
	}
	
	@Override
	public void run() {
		while(true) {
			ph.eat();
		}
	}
}
