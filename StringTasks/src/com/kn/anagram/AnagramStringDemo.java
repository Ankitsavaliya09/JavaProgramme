package com.kn.anagram;

import java.util.Scanner;

public class AnagramStringDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string1=");
		String string1 = scan.nextLine();
		System.out.println("Enter a string2=");
		String string2 = scan.nextLine();

		String s1 = string1.toLowerCase();
		String s2 = string2.toLowerCase();
		
		if (s1.length() == s2.length()) {
			char[] crr1 = s1.toCharArray();
			char[] crr2 = s2.toCharArray();

			for (int i = 0; i < crr1.length - 1; i++) {
				if (crr1[i] > crr1[i + 1]) {
					char temp = crr1[i];
					crr1[i] = crr1[i + 1];
					crr1[i + 1] = temp;
				}
			}

			for (int i = 0; i < crr2.length - 1; i++) {
				if (crr2[i] > crr2[i + 1]) {
					char temp = crr2[i];
					crr2[i] = crr2[i + 1];
					crr2[i + 1] = temp;
				}
			}

			int a = 0, b = 0;
			for (int i = 0; i < crr1.length; i++) {
				a += crr1[i];
			}
			for (int i = 0; i < crr2.length; i++) {
				b += crr2[i];
			}

			if (a == b) {
				System.out.println("Anagram String");
			} else {
				System.err.println("Not Anagram String");
			}
		} else {
			System.out.println("Not Anagram String");
		}
		scan.close();
	}
}
