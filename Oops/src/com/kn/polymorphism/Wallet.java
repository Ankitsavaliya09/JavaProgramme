package com.kn.polymorphism;

public class Wallet extends Payment {

	@Override
	public void pay() {
		System.out.println("Payment made via Wallet.");
	}

	
}
