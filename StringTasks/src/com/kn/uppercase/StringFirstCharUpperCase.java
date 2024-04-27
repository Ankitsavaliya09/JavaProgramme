package com.kn.uppercase;

public class StringFirstCharUpperCase {

	public void converteUppercase(String[] srr) {
		System.out.print("Capitalized Character=");
		for (int i = 0; i < srr.length; i++) {
			char[] crr = srr[i].toCharArray();
			for (int j = 0; j < crr.length; j++) {
				if (crr[0] >= 97 && crr[0] <= 122) {
					crr[0] -= 32;
					System.out.print(crr[j]);
				} else {
					System.out.print(crr[j]);
				}
			}
			System.out.print(" ");
		}
	}

}
