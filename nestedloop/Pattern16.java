package com.kn.nestedloop;

public class Pattern16 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i-j<=0) {
					System.out.print((char)(64+j));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
