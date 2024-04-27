package com.kn.exceptionhandling;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to calculator App");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for the neumerator=");
		int n = scan.nextInt();
		System.out.println("Enter value for the Denominator=");
		int d = scan.nextInt();
		
		double division = 0;
		
		try {
			division = n/d;
		}catch(ArithmeticException Ee){
			System.out.println("Denominator must not be zero");
		}
		
		System.out.println("Division="+division);
		System.out.println("Thank you for using calculator Application");
		scan.close();
	}

}
