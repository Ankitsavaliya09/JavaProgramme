package com.kn.forloop;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = scan.nextInt();
		int i = num;

		int number = isPalindrome(num);

		if (i == number) {
			System.out.println("Palindrome Number.");
		} else {
			System.out.println("Not a Palindrome Number.");
		}
		scan.close();
	}

	static int isPalindrome(int num) {
		int r, p = 0;
		for (; num > 0;) {
			r = num % 10;
			p = (p * 10) + r;
			num = num / 10;
		}
		return p;
	}

}
