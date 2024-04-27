package com.kn.array;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.print("Enter the size of first array=");
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the value of " + (i + 1) + " Element=");
			arr[i] = scan.nextInt();
		}
		System.out.println("-----------------------------------");

		// Calling Method
		PrintEvenOrOddElements printevenorodd = new PrintEvenOrOddElements();
		printevenorodd.printEvenOrOdd(arr);
		System.out.println("-----------------------------------");
		printevenorodd.countEvenOrOddElements(arr);
		scan.close();
	}
}
