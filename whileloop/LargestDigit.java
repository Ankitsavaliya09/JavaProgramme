package com.kn.whileloop;

import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();

		isLargestNumber(num);
		scan.close();
	}

	static void isLargestNumber(int num) {
		
		int Largest = 0;
		while (num > 0)
	    {
			int remider = num % 10;
			if (Largest < remider)
			{
				Largest = remider;
			}
			num = num / 10;
	    }
	System.out.print("The Largest Digit is :"+Largest);
	}

}
