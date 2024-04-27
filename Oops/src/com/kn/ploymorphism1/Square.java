package com.kn.ploymorphism1;

public class Square extends Shape {
	double side=10.5;

	@Override
	public void draw() {
		System.out.println("Drawing Square Shape.");
	}

	@Override
	public double calculateArea() {
		return side*side;
	}
	
	public double calculatePerimeter() {
		return 4*side;
	}
	
}
