package com.kn.static1;

public class Program {

	// static var
	static int x, y;

	// static block
	static {
		x = 10;
		y = 20;
	}

	// static method
	public static void display1() {
		System.out.println("Method Display1");
		System.out.println("X=" + x);
		System.out.println("Y=" + y);
	}

	// instance var
	int a, b;

	// instance block
	{
		a = 100;
		b = 200;
		x = 50;
		y = 60;
	}

	// instance method
	public void display2() {
		System.out.println("Method Display2");
		System.out.println("X=" + x);
		System.out.println("Y=" + y);
		System.out.println("A=" + a);
		System.out.println("B=" + b);
	}

	// called constructor
	public Program() {
		System.out.println("Called Constructor");
	}

}
