package com.kn.simpleif;

import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Letter:");
		char letter = scan.next().charAt(0);
		
		int number = isConvertNumber(letter);
		boolean flag = isCapitalLetter(number);
		if(flag) {
			System.out.println("This Letter " +letter+" is Capital.");
		}else {
			System.out.println("This letter "+letter+" is not capital");
		}
		scan.close();
	}

	static boolean isCapitalLetter(int number) {
		if(number>=65 && number<=90) {
			return true;
		}else {
		return false;
		}
	}

	static int isConvertNumber(char letter) {
		return (int)letter;
	}

}
