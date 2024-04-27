package com.kn.multithreading2;

public class ThreadDemo {

	public static void main(String[] args) {
		PrintNumber pn = new PrintNumber();
		PrintCharacter pc = new PrintCharacter();
		
		Thread t1 = new Thread(pn);
		Thread t2 = new Thread(pc);
		
		t1.start();
		t2.start();
	}

}
