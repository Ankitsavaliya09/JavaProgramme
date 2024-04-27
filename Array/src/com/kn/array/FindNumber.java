package com.kn.array;

import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Array Declaration
		int[] arr;

		// Array Creation
		System.out.println("Enter Array Size=");
		arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a " + (i + 1) + " Element =");
			arr[i] = scan.nextInt();
		}

		System.out.println("Enter a number to find in Array=");
		int num = scan.nextInt();

		findNumberArray(arr, num);
		scan.close();
	}

	// Method is check inside the array or not
	public static void findNumberArray(int[] arr, int num) {
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				flag++;
			}
		}
		if (flag == 1) {
			System.out.println("The given number is inside the array");
		} else {
			System.out.println("The given number is not inside the array");
		}
	}

}
