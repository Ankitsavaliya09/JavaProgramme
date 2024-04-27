package com.kn.countcharacter;

import java.util.Scanner;

public class CountCharacterDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();

		char[] crr = s1.toCharArray();

		for (int i = 0; i < crr.length - 1; i++) {
			if (crr[i] > crr[i + 1]) {
				char temp = crr[i];
				crr[i] = crr[i + 1];
				crr[i + 1] = temp;
			}
		}

		int count = 1;
		for (int i = 0; i < crr.length - 1; i++) {
			if (crr[i] == crr[i + 1]) {
				count++;
			} else {
				System.out.println(crr[i] + " = " + count);
				count = 1;
			}
		}
		System.out.println(crr[crr.length - 1] + " = " + count);
		scan.close();
	}
}
