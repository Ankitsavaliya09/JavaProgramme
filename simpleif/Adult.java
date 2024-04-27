package com.kn.simpleif;

import java.util.Scanner;

public class Adult {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Yoyr Age:");
		int age = scan.nextInt();
		
		boolean flag = isAdult(age);
		if(flag) {
			System.out.println("Adult");
		}else {
			System.out.println("Not Adult");
		}
		scan.close();
	}

	static boolean isAdult(int age) {
		if(age>=21) {
			return true;
		}else {
		return false;
		}
	}

}
