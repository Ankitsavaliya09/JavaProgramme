package com.kn.whileloop;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();

		double number = isSeriesOfSum(num);
		System.out.println(number);
		scan.close();
	}

	static double isSeriesOfSum(int num) {
		double i = 1, sum = 0;
		while (i <= num) {
			sum += 1 / i;
			i++;
		}
		return sum;
	}

}
