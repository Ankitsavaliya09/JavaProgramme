package com.kn.array;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the size of array=");
		// Array Declaration and Creation
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the value of " + (i + 1) + " Element=");
			arr[i] = scan.nextInt();
		}

		// Array Traverse Before sort
		System.out.println("Before Sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		// Object has been Created
		BubbleSortDemo bubblesort = new BubbleSortDemo();
		int[] sort = bubblesort.sortArray(arr);

		System.out.println();
		// Array Traverse After sort
		System.out.println("After Sorting");
		for (int i : sort) {
			System.out.print(i + " ");
		}
		scan.close();
	}

}
