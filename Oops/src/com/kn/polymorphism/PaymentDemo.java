package com.kn.polymorphism;

public class PaymentDemo {

	public static void main(String[] args) {
		Payment p = new Payment();
		p.bill();
		p.offer();
		p.pay();
		p = new Upi();
		p.bill();
		p.offer();
		p.pay();
		p = new Wallet();
		p.bill();
		p.offer();
		p.pay();
		p = new Card();
		p.bill();
		p.offer();
		p.pay();
		
//		System.out.println(((Upi)(p).payment()));
	}

}
