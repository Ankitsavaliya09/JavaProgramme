package com.kn.String;

public class CompareToString {

	public static void main(String[] args) {
		String s1 = "Ankit";
		String s2 = "Nirav";

		int a = s1.compareTo(s2);

		if (a > 0) {
			System.out.println("s1 greater than s2");
		} else if (a < 0) {
			System.out.println("s2 Greater tham s1");
		} else {
			System.out.println("s1 and s2 are equals");
		}
	}

}
