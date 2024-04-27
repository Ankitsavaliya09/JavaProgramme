package com.kn.uppercase;

import java.util.Scanner;

public class StringFirstCharUpperCaseDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String data:");
		String s1 = scan.nextLine();
		String[] srr = s1.split(" ");

		StringFirstCharUpperCase uppercase = new StringFirstCharUpperCase();
		uppercase.converteUppercase(srr);
		scan.close();
	}

}
