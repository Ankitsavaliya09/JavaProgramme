package com.kn.multithreading1;

public class Demo {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			System.out.println("==> main()");
		}
		
		PrintNumbers t1 = new PrintNumbers();
		t1.start();
		PrintCharacter t2 = new PrintCharacter();
		t2.start();
	}

}
