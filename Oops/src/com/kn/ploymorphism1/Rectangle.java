package com.kn.ploymorphism1;

public class Rectangle extends Shape {
	double l=5.5,b=10.5;

	@Override
	public void draw() {
		System.out.println("Drawing rectangle Shape.");
	}

	@Override
	public double calculateArea() {
		return l*b;
	}
	
	public double calculatePerimeter() {
		return 2*(l+b);
	}
	
}
