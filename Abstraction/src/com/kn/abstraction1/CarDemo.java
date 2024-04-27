package com.kn.abstraction1;

public class CarDemo {

	public static void main(String[] args) {
		ElectricCar ec = new ElectricCar();
		PetrolCar pc = new PetrolCar();
		DieselCar dc = new DieselCar();
		
		ec.start();
		ec.stop();
		ec.refuel();
		System.out.println("----------------------------------");
		
		pc.start();
		pc.stop();
		pc.refuel();
		System.out.println("----------------------------------");

		dc.start();
		dc.stop();
		dc.refuel();
	}

}
