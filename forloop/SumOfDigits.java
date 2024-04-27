package com.kn.forloop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();

		int number = isSumDigits(num);
		System.out.println("The given number sum is " + number);
		scan.close();
	}

	static int isSumDigits(int num) {
		int r, sum = 0;
		for (; num > 0;) {
			r = num % 10;
			sum += r;
			num = num / 10;
		}
		return sum;
	}

}
