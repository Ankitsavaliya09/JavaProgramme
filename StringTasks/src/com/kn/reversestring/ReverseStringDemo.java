package com.kn.reversestring;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String to reverse = ");
		String s1 = scan.nextLine();

		// Objcet Created
		ReverseString reversestring = new ReverseString();

		// Calling the method
		String s2 = reversestring.reversingString(s1);

		// Printing the data
		System.out.println("Reverse String = " + s2);

		// close the scanner
		scan.close();
	}

}
