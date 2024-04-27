package com.kn.exception3;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to calculator Application.");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number=");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number=");
		int num2 = scan.nextInt();

		multiply(num1, num2);
		scan.close();
	}

	public static void multiply(int num1, int num2) {
		System.out.println("Multipy method Started...");
		int product = num1 * num2;
		System.out.println("Product = " + product);
		divide(num1, num2);
		System.out.println("Multipy method ended!");
	}

	public static void divide(int num1, int num2) {
		System.out.println("Div() method started..");
		double quotient = 0;
		try {
			quotient = num1 / num2;
		} catch (ArithmeticException ae) {
			System.out.println("Exception Handled.");
		}
		System.out.println("Quotient = " + quotient);
		System.out.println("Divided method ended.");
	}

}
