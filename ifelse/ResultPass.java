package com.kn.ifelse;

import java.util.Scanner;

public class ResultPass {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.print("Enter Your Marks:");
		int marks = scan.nextInt();
		
		boolean flag = isPass(marks);
		if(flag) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		scan.close();
	}

	static boolean isPass(int marks) {
		if(marks>=50) {
			return true;
		}else {
		return false;
		}
	}

}
