package com.kn.exception3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Shopping App...");
		shop();
		System.out.println("Main() method Ended..");
	}

	public static void shop() {
		System.out.println("Shop() method Started..");
		try {
			pay();
		} catch (Exception e) {
			System.out.println("Shopping has failed due to inappropriate input!");
		}
		System.out.println("Shop() method Ended..");
	}

	public static void pay() throws InputMismatchException {
		System.out.println("Pay() method started..");
		Scanner scan = null;
		System.out.println("Enter number you pay = ");
		try {
			scan = new Scanner(System.in);
			double bill = scan.nextDouble();
			System.out.println("Your bill = " + bill);
		} catch (InputMismatchException ie) {
			System.out.println("Exception handle in pay() method");
			throw ie;
		} finally {
			scan.close();
		}
		System.out.println("Pay() method Ended..");

	}

}
