package com.kn.String;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Jay");

		System.out.println("Data = " + sb1);
		System.out.println("Length = " + sb1.length());
		System.out.println("Capacity = " + sb1.capacity());
		System.out.println("=============================");
		sb1.append(" Shree Ram");
		System.out.println("Data = " + sb1);
		System.out.println("Length = " + sb1.length());
		System.out.println("Capacity = " + sb1.capacity());
	}

}
