package com.kn.array;

//Method to sort the Array
public class BubbleSortDemo {
	public int[] sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				int temp = 0;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count = 1;
				}
			}
			if (count == 0) {
				break;
			}
		}
		return arr;

	}

}
