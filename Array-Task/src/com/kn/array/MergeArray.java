package com.kn.array;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of first array=");
		int size1 = scan.nextInt();
		System.out.println("Enter the size of second array=");
		int size2 = scan.nextInt();

		// Array Declaration and Creation
		int[] arr = new int[size1];
		int[] brr = new int[size2];

		// Array Initialization
		System.out.println("---->Enter the data of first Array<----");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the value of " + (i + 1) + " Element=");
			arr[i] = scan.nextInt();
		}

		System.out.println("---->Enter the data of second Array<----");
		for (int i = 0; i < brr.length; i++) {
			System.out.print("Enter the value of " + (i + 1) + " Element=");
			brr[i] = scan.nextInt();
		}

		// Create an object
		MergeArray1 mergearray = new MergeArray1();
		int[] crr = mergearray.mergeArray(arr, brr);
		System.out.println("---->Merge Of two Array<----");
		for (int i : crr) {
			System.out.print(i + " ");
		}
		scan.close();

	}

}
