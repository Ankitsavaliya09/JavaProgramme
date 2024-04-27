package com.kn.nestedloop;

public class Pattern18 {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5;j++) {
				if(i>=j) {
					System.out.print((char)(70-i));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}
