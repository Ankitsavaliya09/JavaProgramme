package com.kn.array;

import java.util.Scanner;

public class ArrayMaxOrMinNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = -2147483648;
		int min = 2147483647;
		int secondmax = 0;

		System.out.print("Enter the size of array=");
		// Array Declaration and Creation
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the value of " + (i + 1) + " Element=");
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < max) {
				if (secondmax < arr[i]) {
					secondmax = arr[i];
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println("-----------------------------");
		System.out.println("Largest Element=" + max);
		System.out.println("Second Largest=" + secondmax);
		System.out.println("Lowest Element=" + min);
		scan.close();
	}

}
