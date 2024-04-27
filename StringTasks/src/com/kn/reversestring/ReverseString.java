package com.kn.reversestring;

public class ReverseString {

	//Method to StringReverse
	public String reversingString(String s1) {
		char[] arr = s1.toCharArray();

		StringBuffer sb1 = new StringBuffer();
		for (int i = arr.length - 1; i >= 0; i--) {
			sb1 = sb1.append(arr[i]);
		}
		
		return sb1.toString();
	}

}
