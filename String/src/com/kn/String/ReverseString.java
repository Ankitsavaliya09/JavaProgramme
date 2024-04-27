package com.kn.String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string value =");
		String s1 = scan.next();

		char[] arr = s1.toCharArray();

		System.out.println("---->Reverse String<----");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		scan.close();
	}

}
