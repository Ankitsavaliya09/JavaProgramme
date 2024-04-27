package com.kn.ifelse;

import java.util.Scanner;

public class DiscountEligible {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Age:");
		int age = scan.nextInt();
		
		boolean flag = isDiscountEligible(age);
		if(flag) {
			System.out.println("You are eligible for discount");
		}else {
			System.out.println("you are not eligible");
		}
		scan.close();
	}

	static boolean isDiscountEligible(int age) {
		if(age>=60 && age<80) {
			return true;
		}else {
			return false;
		}
	}

}
