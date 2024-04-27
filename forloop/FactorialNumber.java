package com.kn.forloop;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();

		int number = isFactorial(num);

		System.out.println("Given number factorial is:" + number);
		scan.close();
	}

	static int isFactorial(int num) {
		int sum = 1;
		for (int i = num; i >= 1; i--) {
			sum = sum * i;
		}
		return sum;
	}
}
