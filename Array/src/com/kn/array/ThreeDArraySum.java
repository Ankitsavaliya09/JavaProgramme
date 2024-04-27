package com.kn.array;

import java.util.Scanner;

public class ThreeDArraySum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array=");
		int size1 = scan.nextInt();
		System.out.println("Enter the size of Row=");
		int size2 = scan.nextInt();
		System.out.println("Enter the size of Column=");
		int size3 = scan.nextInt();

		int[][][] arr = new int[size1][size2][size3];
		int[][][] brr = new int[size1][size2][size3];
		int[][][] crr = new int[size1][size2][size3];

		System.out.println("Enter first Array Data=");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = scan.nextInt();
				}
			}
		}

		System.out.println("Enter second Array Data=");
		for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < brr[i].length; j++) {
				for (int k = 0; k < brr[i][j].length; k++) {
					brr[i][j][k] = scan.nextInt();
				}
			}
		}

		find2DArrayElementSum(arr, brr, crr);
		scan.close();

	}

	public static void find2DArrayElementSum(int[][][] arr, int[][][] brr, int[][][] crr) {
		System.out.println("Sum of Two Array:");
		for (int i = 0; i < crr.length; i++) {
			for (int j = 0; j < crr[i].length; j++) {
				for (int k = 0; k < crr[i][j].length; k++) {
					crr[i][j][k] = arr[i][j][k] + brr[i][j][k];
					System.out.println(arr[i][j][k]);
				}
			}
		}

	}

}
