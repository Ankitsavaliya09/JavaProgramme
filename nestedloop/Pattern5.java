package com.kn.nestedloop;

public class Pattern5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= i) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i+j>5) {
					System.out.print(" ");
				} else {
					System.out.print(j);
				}
			}
			System.out.println("");
		}
	}
}
