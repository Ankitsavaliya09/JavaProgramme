package com.kn.palindromestring;

import java.util.Scanner;

public class PalindromeStringDemo {

	public static void main(String[] args) {
		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();

		// Objcet Created
		PalindromeString palindrome = new PalindromeString();

		// Calling the method
		boolean pd = palindrome.isPalindrome(s1);

		// Printing the data
		if (pd) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}

		// close the scanner
		scan.close();

	}

}
