package com.kn.forloop;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();

		printEvenNumbers(num);

		scan.close();
	}

	public static void printEvenNumbers(int num) {
		for (int i = 1; num >= i; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
