package com.kn.elseifladder;

import java.util.Scanner;

public class CategorieStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your Marks:");
		int marks = scan.nextInt();

		if (marks >= 90 && marks <= 100) {
			System.out.println("A");
		} else if (marks >= 80 && marks <= 89) {
			System.out.println("B");
		} else if (marks >= 70 && marks <= 79) {
			System.out.println("C");
		} else if (marks >= 60 && marks <= 69) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		scan.close();
	}

}
