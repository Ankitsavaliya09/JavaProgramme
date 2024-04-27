package com.kn.array;

import java.util.Scanner;

public class FindElementPosition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of array=");
		// Array Declaration and Creation
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the value of " + (i + 1) + " Element=");
			arr[i] = scan.nextInt();
		}

		// Element to be found
		System.out.println("Enter the elements of array=");
		int a = scan.nextInt();

		// Calling method
		findElementPosition(arr, a);
		scan.close();
	}

	// Method to find the element position
	public static void findElementPosition(int[] arr, int a) {
		int count = 0;
		int i = 0;
		for (; i < arr.length; i++) {
			if (arr[i] == a) {
				count++;
				break;
			}
		}
		System.out.println("Position of find Element:");
		if (count == 1) {
			System.out.println("Elemets position is " + (i + 1));
		} else {
			System.out.println("Element not found!");
		}
	}

}
