package com.kn.nestedloop;

public class Pattern8 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= i && ((i + j) % 2 == 0)) {
					System.out.print(num2);
				} else if (i > j && (i + j) % 2 != 0) {
					System.out.print(num1);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
