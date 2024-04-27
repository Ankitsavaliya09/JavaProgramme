package com.kn.forloop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();

		isReverseNumber(num);

		scan.close();
	}

	static void isReverseNumber(int num) {
		int r;
		for (; num > 0;) {
			r = num % 10;
			System.out.print(r);
			num = num / 10;
		}

	}

}
