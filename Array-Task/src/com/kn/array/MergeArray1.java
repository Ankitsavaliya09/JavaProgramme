package com.kn.array;

public class MergeArray1 {

	// Method to merge two arrays
	public int[] mergeArray(int[] arr, int[] brr) {
		int[] crr = new int[arr.length + brr.length];

		for (int i = 0; i < arr.length; i++) {
			crr[i] = arr[i];
		}
		int j = 0;
		for (int i = arr.length; i < crr.length; i++) {
			crr[i] = brr[j];
			j++;
		}
		return crr;

	}
}
