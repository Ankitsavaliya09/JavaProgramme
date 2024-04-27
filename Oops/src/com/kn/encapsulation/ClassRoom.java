package com.kn.encapsulation;

public class ClassRoom {
	private int temp;

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		if (temp >= 16 && temp <= 26) {
			this.temp = temp;
		}else {
			System.out.println("Invalid Input!");
		}
	}
}
