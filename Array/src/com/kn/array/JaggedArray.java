package com.kn.array;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Array Declaration and Creation
		System.out.println("Enter a Array size=");
		int[][] arr = new int[scan.nextInt()][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a "+(i+1)+ "size=");
			arr[i] = new int[scan.nextInt()];
		}

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter a " + (j + 1) + " Element value=");
				arr[i][j] = scan.nextInt();
			}
		}

		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Element value is " + arr[i][j]);
			}
		}
		scan.close();
	}

}
