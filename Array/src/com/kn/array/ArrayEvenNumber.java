package com.kn.array;

import java.util.Scanner;

public class ArrayEvenNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Array Declaration
		int[] arr;

		// Array Creation
		System.out.println("Enter Array Size=");
		arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a " + (i + 1) + " Element =");
			arr[i] = scan.nextInt();
		}

		// Array Traversing
		System.out.println("---->All Even Numbers<----");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		scan.close();
	}

}
