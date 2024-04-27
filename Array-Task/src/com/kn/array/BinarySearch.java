package com.kn.array;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int temp;

		System.out.println("Enter the size of array=");
		// Array declaration and Creation
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the value of " + (i + 1) + " Element=");
			arr[i] = scan.nextInt();
		}
		System.out.println("=================================");

//		// Array Sorting
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}

		// Search Array element
		System.out.print("Search the Element=");
		int element = scan.nextInt();

		// Calling method
		findElementPosition(arr, element);
		scan.close();
	}

	// Method to find element position
	public static void findElementPosition(int[] arr, int element) {
		int low = 0, high = arr.length - 1;
		int count = 0, position = -1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (element == arr[mid]) {
				count++;
				position = (mid + 1);
				break;
			} else if (element > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		System.out.println("=================================");
		if (count == 1) {
			System.out.println("The Element " + element + "is found at " + position);
		} else {
			System.out.println("Element not found!");
		}
	}

}
