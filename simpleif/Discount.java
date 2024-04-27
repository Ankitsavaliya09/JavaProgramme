package com.kn.simpleif;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Your Bill Amount:$");
		int amount = scan.nextInt();
		
		boolean flag = isDiscountApplicable(amount);
		
		if(flag) {
			System.out.println("Discount Applicable");
		}else {
			System.out.println("Not Applicable");
		}
		scan.close();
	}

	static boolean isDiscountApplicable(int amount) {
		if(amount>100) {
			return true;
		}else {
			return false;
		}
	}
}
