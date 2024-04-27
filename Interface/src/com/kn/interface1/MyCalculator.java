package com.kn.interface1;

abstract public class MyCalculator implements Calculator2,Calculator1{

	@Override
	public void multiplication() {
		System.out.println("Multiplication");
	}

	@Override
	public void division() {
		System.out.println("Division");
	}

	
}
