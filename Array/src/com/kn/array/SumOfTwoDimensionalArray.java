package com.kn.array;

import java.util.Scanner;

public class SumOfTwoDimensionalArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array declaration and Creation
		int[][] arr = new int[2][5];
		int[][] brr = new int[2][5];

		// Array Initialization
		System.out.println("Enter First Array value:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Enter the number of " + ((j + 1) + (i * arr[i].length)) + " Elements=");
				arr[i][j] = scan.nextInt();
			}
		}

		System.out.println("Enter Second Array value:");
		for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < brr[i].length; j++) {
				System.out.print("Enter the number of " + ((j + 1) + (i * arr[i].length)) + " Elements=");
				brr[i][j] = scan.nextInt();
			}
		}

		// Calling Method
		find2DArrayElementSum(arr, brr);
		scan.close();
	}

	// Method is find the sum of two Dimensional Array
	private static void find2DArrayElementSum(int[][] arr, int[][] brr) {
		int[][] crr = new int[arr.length][arr[0].length];
		System.out.println("---->Sum of Two Dimensional Array<----");
		for (int i = 0; i < crr.length; i++) {
			for (int j = 0; j < crr[i].length; j++) {
				crr[i][j] = arr[i][j] + brr[i][j];
				System.out.print(crr[i][j] + " ");
			}
		}
	}

}
