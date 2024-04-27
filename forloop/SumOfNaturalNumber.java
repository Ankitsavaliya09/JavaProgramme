package com.kn.forloop;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		int number = isSum(num);

		System.out.println("Given number sum:" + number);
		scan.close();
	}

	static int isSum(int num) {
		int sum = 0;
		for (int i = 1; num >= i; i++) {
			sum = i + sum;
		}
		return sum;
	}
}
