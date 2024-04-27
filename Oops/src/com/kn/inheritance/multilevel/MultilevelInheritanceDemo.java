package com.kn.inheritance.multilevel;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.regitrationNumber = 1111;
		System.out.println("Registartion Number = " + v1.regitrationNumber);
		v1.move();

		Car c1 = new Car();
		c1.regitrationNumber = 2222;
		System.out.println("Registartion Number = " + c1.regitrationNumber);
		c1.move();

		Baleno b1 = new Baleno();
		b1.regitrationNumber = 3333;
		System.out.println("Registartion Number = " + b1.regitrationNumber);
		b1.move();
	}

}
