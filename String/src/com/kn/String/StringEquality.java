package com.kn.String;

public class StringEquality {

	public static void main(String[] args) {
		String s1 = "Rama";
		String s2 = "RAMa";
		String s3 = "savaliya ankit";

		if (s1.equals(s2)) {
			System.out.println("Same");
		} else {
			System.out.println("Diff");
		}

		System.out.println("========================");
		// Ignore the case sensitive using equalsIgnoreCase()

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Same");
		} else {
			System.out.println("Diff");
		}

		System.out.println("========================");
		// String convert Uppercase to lowercase
		System.out.println(s2.toLowerCase());

		System.out.println("========================");
		// String convert Lowercase to Uppercase
		System.out.println(s1.toUpperCase());

		System.out.println("========================");
		// Findout to string second index value
		System.out.println(s1.charAt(2));

		System.out.println("========================");
		// Findout to string first index position
		System.out.println(s1.indexOf('a'));

		System.out.println("========================");
		// Findout to string last index position
		System.out.println(s1.lastIndexOf('a'));

		System.out.println("========================");
		// string Starting point
		System.out.println(s3.substring(9));

		System.out.println("========================");
		// String strating and ending point
		System.out.println(s3.substring(2, 9));

		System.out.println("========================");
		// Check the input value is string value or not
		System.out.println(s3.contains("ank"));

		System.out.println("========================");
		// Find out string length
		System.out.println(s3.length());

	}

}
