package com.kn.String;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Shyam";

		String s3 = new String("Ram");
		String s4 = new String("Ram");

		System.out.println("S1 = " + s1);
		System.out.println("S2 = " + s2);

		System.out.println("======================");

		if (s1 == s2) {
			System.out.println("Same Refernce");
		} else {
			System.out.println("Diff Refernce");
		}

		System.out.println("======================");

		if (s3.equals(s4)) {
			System.out.println("Same");
		} else {
			System.out.println("Diff");
		}
	}

}
