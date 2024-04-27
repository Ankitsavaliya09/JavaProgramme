package com.kn.nestedloop;

public class Pattern10 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i + j <= 10 && i - j <= 0) {
					System.out.print((char) (64 + i));
				} else if (i + j >= 10 && j - i <= 0) {
					System.out.print((char) (74 - i));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
