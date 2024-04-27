package com.kn.forloop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		printPrimes(num);
		scan.close();
	}

	static void printPrimes(int num) {
		for (int i = 2; num > 0; i++) {
			boolean result = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					result = false;
				}
			}
			if (result == true) {
				System.out.print(i + " ");
				num--;
			}
		}
	}
}
