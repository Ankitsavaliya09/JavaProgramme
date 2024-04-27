package com.kn.ifelse;

import java.util.Scanner;

public class MultipleNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = scan.nextInt();
		
		boolean number = isNumberMultiple(num);
		if(number) {
			System.out.println("Number is Mutiple of 10");
		}else {
			System.out.println("Number is not Multiple of 10");
		}
		scan.close();
	}

	static boolean isNumberMultiple(int num) {
		if(num%10==0) {
			return true;
		}else {
			return false;
		}
	}

}
