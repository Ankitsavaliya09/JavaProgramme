package com.kn.elseifladder;

import java.util.Scanner;

public class IdentifierCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Character:");
		char c = scan.next().charAt(0);

		int flag = isIdentifierNumber(c);
		boolean check = isCheckCondition(flag);
		if (check) {
			if (flag >= 65 && flag <= 90) {
				if (flag == 65 || flag == 69 || flag == 73 || flag == 79 || flag == 85) {
					System.out.println("UpperCase Vowel");
				} else {
					System.out.println("UpperCase Consonant");
				}
			}
			if (flag >= 97 && flag <= 122) {
				if (flag == 97 || flag == 101 || flag == 105 || flag == 111 || flag == 117) {
					System.out.println("LowerCase vowel");
				} else {
					System.out.println("LoweCase Consonant");
				}
			}
			if (flag >= 48 && flag <= 57) {
				if (flag >= 48 && flag <= 57) {
					System.out.println("Digit");
				} else {
					System.out.println("");
				}
			}
		} else {
			System.out.println("Special Character.");
		}
		scan.close();
	}

	static boolean isCheckCondition(int flag) {
		if(flag >= 48 && flag <= 57 || flag >= 65 && flag <= 90 || flag >= 97 && flag <= 122) {
			return true;
		}else {
			return false;
		}
	}

	static int isIdentifierNumber(char c) {
		return (int) c;
	}

}
