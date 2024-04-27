package com.kn.array;

import java.util.Scanner;

public class IntDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Array Declaration
		int[] arr;

		// Array Creation
		System.out.print("Enter Array Size =");
		arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter a " + (i + 1) + " Elemnet =");
			arr[i] = scan.nextInt();
		}

		// Array Traversing
		System.out.println("Forword");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// Backword
		System.out.println("Backword");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		scan.close();
	}

}
