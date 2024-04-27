package com.kn.elseifladder;

import java.util.Scanner;

public class PNZNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println("Given Number "+num+" is Positive.");
		}else if(num<0){
			System.out.println("Given Number "+num+" is Negative.");
		}else if(num==0){
			System.out.println("Given Number is Zero.");
		}else {
			System.out.println("Wrong Input.");
		}
		scan.close();
	}
}
