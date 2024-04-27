package com.kn.elseifladder;

import java.util.Scanner;

public class ZodiacSign {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Birth Date:");
		int date = scan.nextInt();
		System.out.print("Enter Your Birth Month:");
		int month = scan.nextInt();

		if ((month == 1 && date >= 20 && date <= 31) || (month == 2 && date >= 1 && date <= 18)) {
			System.out.println("Aquarias");
		} else if ((month == 2 && date >= 19 && date <= 28) || (month == 3 && date >= 1 && date <= 20)) {
			System.out.println("Pisces");
		} else if ((month == 3 && date >= 21 && date <= 31) || (month == 4 && date >= 1 && date <= 19)) {
			System.out.println("Aries");
		} else if ((month == 4 && date >= 20 && date <= 30) || (month == 5 && date >= 1 && date <= 20)) {
			System.out.println("Taurus");
		} else if ((month == 5 && date >= 21 && date <= 31) || (month == 6 && date >= 1 && date <= 20)) {
			System.out.println("Gemini");
		} else if ((month == 6 && date >= 21 && date <= 30) || (month == 7 && date >= 1 && date <= 22)) {
			System.out.println("Cancer");
		} else if ((month == 7 && date >= 23 && date <= 31) || (month == 8 && date >= 1 && date <= 22)) {
			System.out.println("Leo");
		} else if ((month == 8 && date >= 23 && date <= 31) || (month == 9 && date >= 1 && date <= 22)) {
			System.out.println("Virgo");
		} else if ((month == 9 && date >= 23 && date <= 30) || (month == 10 && date >= 1 && date <= 22)) {
			System.out.println("Libra");
		} else if ((month == 10 && date >= 23 && date <= 31) || (month == 11 && date >= 1 && date <= 21)) {
			System.out.println("Scorpio");
		} else if ((month == 11 && date >= 22 && date <= 30) || (month == 12 && date >= 1 && date <= 21)) {
			System.out.println("Sagittarius");
		} else if ((month == 12 && date >= 22 && date <= 31) || (month == 1 && date >= 1 && date <= 19)) {
			System.out.println("Capricon");
		} else {
			System.out.println("Wrong Input.");
		}
		scan.close();

	}

}
