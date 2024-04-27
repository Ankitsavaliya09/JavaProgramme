package com.kn.whileloop;

import java.util.Scanner;

public class SumOfOddNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();

		int number=isOddNumber(num);
		System.out.println(number);
		scan.close();

	}

	static int isOddNumber(int num) {
		int sum=0;
		for (int i = 1; num > 0; i++) {
			boolean result = true;

			for (int j = 1; j < i; j++) {
				if (i % 2 == 0) {
					result = false;
				}
			}
			if (result == true) {
				sum+=i;
				num--;
			}
		}
		return sum;
	}

}

