package com.kn.array;

import java.util.Scanner;

public class SumOfThreeDimensionalArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		int[][][] arr = new int[2][2][2];

		// Array Initialization
		System.out.println("Enter Data=");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = scan.nextInt();
				}
			}
		}

		// Array Traversing
		System.out.println("Array elements are as follows:");
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
			}
		}
		System.out.print("}");

		scan.close();
	}

}
