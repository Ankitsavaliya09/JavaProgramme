package com.kn.array;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Array Declaration
		int[] arr;

		// Array Creation
		System.out.println("Enter Array Size = ");
		arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a " + (i + 1) + " Element =");
			arr[i] = scan.nextInt();
		}

		// Array Traversing
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of all Elements=" + sum);
		scan.close();
	}
	
	
}
