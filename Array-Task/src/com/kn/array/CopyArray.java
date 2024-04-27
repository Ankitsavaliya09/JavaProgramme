package com.kn.array;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println("Enter the size of first array=");
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a " + (i + 1) + " Element value=");
			arr[i] = scan.nextInt();
		}

		// Calling Method
		int[] crr = copyArray(arr);
		System.out.println("Array Element are as follows:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(crr[i]);
		}
		scan.close();
	}

	public static int[] copyArray(int[] arr) {
		int[] brr = new int[arr.length];
		for (int i = 0; i < brr.length; i++) {
			brr[i] = arr[i];
		}
		return brr;

	}

}
