package com.kn.array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.print("Enter the size of first array=");
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter a " + (i + 1) + " Element value=");
			arr[i] = scan.nextInt();
		}

		// Calling Method
		backWordArray(arr);
		scan.close();
	}

	// Method is reverse the elements
	public static void backWordArray(int[] arr) {
		System.out.println("Array Element are as follows BackWord:");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
