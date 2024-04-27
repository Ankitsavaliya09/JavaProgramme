package com.kn.ploymorphism1;

public class Geometry {

	public void doActivity(Shape sh) {
		sh.draw();
		System.out.println(sh.calculateArea());
		
		if(sh instanceof Circle) {
			System.out.println("Circle Perimeter="+(((Circle) (sh)).calculatePerimeter()));
		}else if(sh instanceof Square) {
			System.out.println("Square Perimeter="+(((Square) (sh)).calculatePerimeter()));
		}else {
			System.out.println("Rectangle Perimeter="+(((Rectangle) (sh)).calculatePerimeter()));
		}
		
		System.out.println("========================================");
	}
}
