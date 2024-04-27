package com.kn.palindromestring;

public class PalindromeString {

	public boolean isPalindrome(String s1) {
		char[] arr = s1.toCharArray();

		StringBuffer sb1 = new StringBuffer();
		for (int i = arr.length - 1; i >= 0; i--) {
			sb1 = sb1.append(arr[i]);
		}

		String sb2 = sb1.toString();

		if (s1.equals(sb2)) {
			return true;
		} else {
			return false;
		}
	}

}
