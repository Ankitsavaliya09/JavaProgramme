package com.kn.abstraction1;

abstract public class Car {
	
	public void start() {
		System.out.println("Car has been Started.");
	}
	
	public void stop() {
		System.out.println("Car has been Stopped.");
	}
	
	abstract public void refuel();

}
