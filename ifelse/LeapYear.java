package com.kn.ifelse;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a year:");
		int year = scan.nextInt();
		
		boolean Year = isLeapYear(year);
		
		if(Year) {
			System.out.println("Given Year is Leap year.");
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("Given year is Century Year.");
				}
			}
		}else
		{
			System.out.println("Given Year is Not Leap Year.");
		}
		scan.close();
	}

	static boolean isLeapYear(int year) {
		if(year%4==0) {
			return true;
		}else {
		return false;
		}
	}

}
