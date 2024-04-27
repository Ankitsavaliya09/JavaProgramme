package com.kn.exception;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Bank Application Started..");
			System.out.println("Enter your pin = ");
			int pin = scan.nextInt();
			if(pin==9999) {
				System.out.println("Continue with further transaction.");
			}else {
				System.out.println("Invalid pin.");
			}
		}catch(Exception e) {
			System.out.println("Pin should a numeric value.");
		}finally {
			scan.close();
		}
		System.out.println("Bank Application terminated Succesfully!");
	}

}
