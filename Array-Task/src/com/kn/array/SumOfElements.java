package com.kn.array;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Array Declaration
		int[] arr;

		// Array Creation
		System.out.println("Enter Array Size = ");
		arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value of " + (i + 1) + " Element =");
			arr[i] = scan.nextInt();
		}

		// Calling Method
		System.out.print("Sum Of All Element=");
		int number = sumOfAllElement(arr);
		System.out.print(number);
		scan.close();
	}

	// Method is sum of all elements
	public static int sumOfAllElement(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
