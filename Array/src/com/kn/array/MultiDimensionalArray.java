package com.kn.array;

import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println("Enter a student number=");
		int num1 = scan.nextInt();
		System.out.println("Enter a student subject number=");
		int num2 = scan.nextInt();
		int[][] arr = new int[num1][num2];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("----->Student " + (i + 1) + " Data<-----");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter a subject " + (j + 1) + " Marks = ");
				arr[i][j] = scan.nextInt();
			}
		}

		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			System.out.println("----->Student " + (i + 1) + " Data<-----");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Subject " + (j + 1) + " Marks = " + arr[i][j]);
			}
		}
		scan.close();
	}

}
