package com.kn.forloop;

import java.util.Scanner;

public class PowerNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Base Value:");
		int base = scan.nextInt();
		System.out.println("Enter a exponent value:");
		int exponent = scan.nextInt();
		
		int power1 = isPowerNumber(base,exponent);
		System.out.println(power1);
		scan.close();
	}

	static int isPowerNumber(int base, int exponent) {
		int power=1;
		for(int i=1;i<=exponent;i++) {
			power=power*base;
		}
		return power;
	}

}
