package com.kn.whileloop;

import java.util.Scanner;

public class LengthOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  a Number:");
		long num = scan.nextLong();
		
		int number = islengthNumber(num);
		System.out.println(number);
		scan.close();
	}

	static int islengthNumber(long num) {
		
		int count=0;
//		int i=1;
		while(num>0) {
		long r=(num%10);
			count++;
			num=num/10;
		}
		return count;
	}

}
  