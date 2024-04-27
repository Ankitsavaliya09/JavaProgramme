package com.kn.String;

public class PalindromeString {

	public static void main(String[] args) {
		String s1 = "nayan";

		char[] arr = s1.toCharArray();

		char[] crr = new char[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			crr[i] = arr[i];
		}

		String s2 = crr.toString();

		if (s2.equalsIgnoreCase(s1)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not Palindrome String");
		}
	}

}
