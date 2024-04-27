package com.kn.forloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();

		isFibonacci(num);

		scan.close();
	}

	static void isFibonacci(int num) {

		int nextNumber = 0;
		int firstNumber = 0, secondNumber = 1;

		System.out.print(firstNumber + " " + secondNumber + " ");
		for (int i = 3; num >= i; i++) {
			nextNumber = firstNumber + secondNumber;
			System.out.print(nextNumber + " ");
			firstNumber = secondNumber;
			secondNumber = nextNumber;
		}
	}
}
