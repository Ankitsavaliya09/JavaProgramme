package com.kn.matrixmultiplication;

import java.util.Scanner;

public class ArrayPrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
//		int[] brr = new int[5];
		System.out.println("Enter the first array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
//		System.out.println("Enter the second array elements:");
//		for(int i=0;i<brr.length;i++) {
//			brr[i] = scan.nextInt();
//		}
		
		for(int i=arr.length-1;i<=arr.length;i++) {
			if(i==arr.length-1) {
				System.out.print(arr[i]+" ");
			}else {
				for(int j=0;j<arr.length-1;j++) {
					System.out.print(arr[j]+" ");
				}
			}
		}
		 		
		scan.close();
	}

}
