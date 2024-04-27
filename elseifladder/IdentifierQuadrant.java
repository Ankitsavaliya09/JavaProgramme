package com.kn.elseifladder;

import java.util.Scanner;

public class IdentifierQuadrant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two number for the quadrant:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1<0 && num2>0) {
			System.out.println("First");
		}else if(num1>0 && num2>0) {
			System.out.println("Second");
		}else if(num1<0 && num2<0) {
			System.out.println("Third");
		}else if(num1>0 && num2<0){
			System.out.println("Fourth");
		}else {
			System.out.println("Wrong Input");
		}
		scan.close();
	}

}
