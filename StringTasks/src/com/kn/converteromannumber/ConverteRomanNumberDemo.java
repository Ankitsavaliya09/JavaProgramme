package com.kn.converteromannumber;

public class ConverteRomanNumberDemo {

	public static void main(String[] args) {
		int num = 4321;
		String[] srr = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		
		for(int i=0;i<arr.length;i++) {
			while(arr[i]<=num) {
				num-=arr[i];
				System.out.print(srr[i]);
			}
		}
	}

}
