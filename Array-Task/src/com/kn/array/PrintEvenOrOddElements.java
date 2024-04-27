package com.kn.array;

public class PrintEvenOrOddElements {
	// Method to check even or odd number
	public void printEvenOrOdd(int[] arr) {
		System.out.println("Array Element are Even or Odd:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("Even Number=" + (arr[i]));
			} else {
				System.out.println("Odd Number=" + (arr[i]));
			}
		}
	}

	// Method to count odd or even elements
	public void countEvenOrOddElements(int[] arr) {
		int evenCount = 0, oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Even Number="+evenCount);
		System.out.println("Odd Number="+oddCount);
	}

}
