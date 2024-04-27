package com.kn.array;

import java.util.Scanner;

public class SumOfElementsTwoArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration And creation
		int[][] arr = new int[3][5];

		// Array Initialization
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Enter a " + (j + 1) + " Element Number=");
				arr[i][j] = scan.nextInt();
			}
		}
		isSumOfTwoArray(arr);
		scan.close();
	}

	// Method is Sum of Two Arrays
	private static void isSumOfTwoArray(int[][] arr) {
		System.out.println("--->Sum of Two Array<---");
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i + 2][j] = arr[i + 1][j] + arr[i][j];
				System.out.println(arr[i + 2][j]);
			}
		}
//		int[] arr = new int[3];
//		int[] brr = new int[3];
//		int[] crr = new int[3];
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Enter elements of array " + (i + 1));
//			arr[i] = scan.nextInt();
//		}
//		for (int i = 0; i < brr.length; i++) {
//			System.out.println("Enter elements of array " + (i + 1));
//			brr[i] = scan.nextInt();
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			crr[i]=arr[i]+brr[i];
//			System.out.println(crr[i]);
//		}
	}
}
