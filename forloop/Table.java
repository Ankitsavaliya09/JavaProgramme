package com.kn.forloop;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number for Table:");
		int num = scan.nextInt();

		isTable(num);

		scan.close();
	}

	static void isTable(int num) {
		for (int i = 1; i < 11; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}
}
