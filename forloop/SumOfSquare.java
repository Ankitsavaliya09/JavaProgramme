package com.kn.forloop;

import java.util.Scanner;

public class SumOfSquare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter anumber:");
		int num = scan.nextInt();

		int number = isSquareNumber(num);
		System.out.println("The Given Number " + num + " sum of Square is " + number);
		scan.close();

	}

	static int isSquareNumber(int num) {
		int sum = 0;
		for (int i = 1; num >= i; i++) {
			sum += (i * i);
		}
		return sum;
	}

}
