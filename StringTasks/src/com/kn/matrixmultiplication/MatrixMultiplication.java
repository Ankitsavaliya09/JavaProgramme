package com.kn.matrixmultiplication;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		int[][] brr = new int[3][3];
		
		System.out.println("Enter first array elements:");
		for(int i= 0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Enter second array elements:");
		for(int i= 0;i<brr.length;i++) {
			for(int j=0;j<brr[0].length;j++) {
				brr[i][j] = scan.nextInt();
			}
		}
		
		findMatrixMultiplication(arr,brr);
 		
		scan.close();
	}

	public static void findMatrixMultiplication(int[][] arr, int[][] brr) {
		int[][] crr  = new int[3][3];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				crr[i][j]=0;
				for(int k=0;k<crr.length;k++) {
					crr[i][j] =crr[i][j]+ arr[i][k]*brr[k][j];
				}
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
