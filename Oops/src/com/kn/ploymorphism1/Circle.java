package com.kn.ploymorphism1;

public class Circle extends Shape {
	double r=2.5;

	@Override
	public void draw() {
		System.out.println("Drawing Circle Shape.");
	}

	@Override
	public double calculateArea() {
		return Math.PI*r*r;
	}
	
	public double calculatePerimeter() {
		return 2*Math.PI*r;
	}
}
