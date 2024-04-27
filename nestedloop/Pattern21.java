package com.kn.nestedloop;

public class Pattern21 {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i + j <= 5 || j - i >= 3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("");

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i + j == 5 || j - i == 3 || i - j == 3 || i + j == 11) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		System.out.println("");

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == j || i + j == 8) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("");

		for (int i = 1; i <= 5; i++) {
			int n = 1;
			for (int j = 1; j <= 9; j++) {
				if (i + j >= 6 && j - i <= 4) {
					if (j < 5) {
						System.out.print(n++);
					} else {
						System.out.print(n--);
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("");

		int k;
		for (int i = 1; i <= 5; i++) {
			k = 1;
			for (int j = 1; j <= 9; j++) {
				if (i + j >= 6 && j - i <= 4 && k == 1) {
					System.out.print(i);

					k = 0;
				} else {
					System.out.print(" ");
					k = 1;
				}
			}
			System.out.println("");
		}

		System.out.println("");

		for (int i = 1; i <= 5; i++) {
			k = 1;
			for (int j = 1; j <= 9; j++) {
				if (i + j >= 6 && j - i <= 4 && k == 1) {
					System.out.print("*");
					k = 0;
				} else {
					System.out.print(" ");
					k = 1;
				}
			}

			System.out.println("");
		}

		System.out.println("");

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (j >= 5 - i && j <= 11 - i && j <= 3 + i && j >= i - 3) {
					System.out.print("*");
				} else {

					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i >= j && j <= 10 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("");

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if ((i >= j && i + j <= 10) || (i <= j && i + j >= 10)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		System.out.println("");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i >= j && (i + j) % 2 == 0) {
					System.out.print("1");
				} else if (i >= j && (i + j) % 2 != 0) {
					System.out.print("0");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == 4 && (j == 3 || j == 5)) {
					System.out.print("3");
				} else if (i == 3 && j == 4) {
					System.out.print("2");
				} else if (i + j >= 4 && j - i <= 3 && (i + j) % 2 != 0) {
					System.out.print("1");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("");

		for (int i = 1; i <= 7; i++) {
			k = 1;
			for (int j = 1; j <= 7; j++) {
				if (i + j >= 5 && i + j <= 11 && j - i <= 3 && i - j <= 3) {
					System.out.print(k++);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		System.out.println("");

		for (int i = 1; i <= 5; i++) {
			k = 0;
			for (int j = 1; j <= 10; j++) {
				if (i >= j) {
					System.out.print(++k);
				} else if (i + j >= 11) {
					System.out.print(k--);
				} else {
					System.out.print(" ");
				}

			}
			System.out.println("");
		}

		System.out.println("");

		for (int i = 1; i <= 5; i++) {
			k = 5;
			for (int j = 1; j <= 9; j++) {
				if (i + j >= 6 && j - i <= 4) {
					if (j <= 5) {
						System.out.print(k);
						k--;
					}
					if (j >= 6) {
						System.out.print("*");
					}
				} else {
					System.out.print(" ");
					k--;
				}
			}
			System.out.println("");
		}
		System.out.println("");

		k = 1;
		int a = 1;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i + j == 5 || i - j == 3) {
					System.out.print(a);
				} else if ((i + j == 11 || j - i == 3) && i <= 4) {
					k += 2;
					System.out.print(k);
				} else if ((i + j == 11 || j - i == 3) && i >= 5) {
					k -= 2;
					System.out.print(k);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		System.out.println("");

	}

}
