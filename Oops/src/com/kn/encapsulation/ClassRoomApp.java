package com.kn.encapsulation;

import java.util.Scanner;

public class ClassRoomApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Temprature = ");
		int temp = scan.nextInt();
		
		ClassRoom c1 = new ClassRoom();
		System.out.println("Tempreture = "+c1.getTemp());
		c1.setTemp(temp);
		System.out.println("Modifying Tempreture = "+c1.getTemp());
		scan.close();
	}

}
