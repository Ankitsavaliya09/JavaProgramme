package com.kn.whileloop;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		long num1 = scan.nextLong();
		System.out.println("Enter a number for find:");
		int num2 = scan.nextInt();

		int number = digitFrequency(num1, num2);
		System.out.println("Digit is " + number + " Time in Number.");
		scan.close();
	}

	static int digitFrequency(long num1, int num2) {
		double r;
		int count = 0;
		while (num1 > 0) {
			r = num1 % 10;
			if (r == num2) {
				count++;
			}
			num1 = num1 / 10;
		}
		return count;
	}

}
