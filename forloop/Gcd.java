package com.kn.forloop;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a two number for GCD:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		int number = gcdNumber(num1, num2);
		System.out.println("Gcd Number is:" + number);
		scan.close();
	}

	static int gcdNumber(int num1, int num2) {
		int gcd = 0;
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
}
