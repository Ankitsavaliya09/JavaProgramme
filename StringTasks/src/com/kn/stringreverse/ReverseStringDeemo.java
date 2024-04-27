package com.kn.stringreverse;

public class ReverseStringDeemo {

	public static void main(String[] args) {
		String s1 = "I am learning string in java";
		
		String[] srr = s1.split("");
		
		ReverseString reversestring = new ReverseString();
		reversestring.reverseString(srr);
	}

}
