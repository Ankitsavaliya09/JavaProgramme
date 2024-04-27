package com.kn.array;

import java.util.Scanner;

public class JaggedArray1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println("Enter a Number of Batches=");
		String[][] arr = new String[scan.nextInt()][];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a Batch A" + (i + 1) + " Friends number=");
			arr[i] = new String[scan.nextInt()];
		}

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("A" + (i + 1) + " Batch:");
			System.out.println("I have " + arr[i].length + " Friends");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter " + (j + 1) + " Friends name=");
				arr[i][j] = scan.next();
			}
		}

		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			System.out.println("---->Batch A" + (i + 1) + " Friends Name<----");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println((j + 1) + ":" + arr[i][j]);
			}
		}
		scan.close();
	}

}
