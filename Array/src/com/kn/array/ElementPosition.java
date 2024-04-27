package com.kn.array;

import java.util.Scanner;

public class ElementPosition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println("Enter a Array size=");
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a " + (i + 1) + " Element =");
			arr[i] = scan.nextInt();
		}

		System.out.println("Enter a number to find element position in array=");
		int num = scan.nextInt();

		isFindPosition(arr, num);
		scan.close();
	}

	// Method is find a position in index
	public static void isFindPosition(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println("Enter a numnber is " + num + " and index position is " + i);
			}
		}
	}

}
