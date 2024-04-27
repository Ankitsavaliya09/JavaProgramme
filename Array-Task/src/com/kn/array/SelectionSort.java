package com.kn.array;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 48, 32, 16, 29, 72, 44, 63 };

		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			int temp;
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
