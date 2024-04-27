package com.kn.nestedloop;

public class Pattern17 {

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5; j++) {
				if (i + j <= 6) {
					System.out.print((i + j) - 1);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
