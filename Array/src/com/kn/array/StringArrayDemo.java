package com.kn.array;

import java.util.Scanner;

public class StringArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Array Declaration
		String[] arr;

		// Array creation
		System.out.println("Enter Array Size =");
		arr = new String[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a " + (i + 1) + " String value = ");
			arr[i] = scan.next();
		}

		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		scan.close();
	}

}
