package com.kn.exception2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Program execution Start...");

		try {
			System.out.println("Enter Array Size = ");
			int[] arr = new int[scan.nextInt()];

			System.out.println("Enter Element number");
			int element = scan.nextInt();

			System.out.println("Enter " + element + " element value");
			int num = scan.nextInt();

			System.out.println("Enter neumerator value = ");
			int n = scan.nextInt();

			System.out.println("Enter Denominator value = ");
			int d = scan.nextInt();

			double division = n / d;
		} catch (ArithmeticException ae) {
			System.out.println("Denominator must not be zero");
		} catch (NegativeArraySizeException nase) {
			System.out.println("Array size must not be negative");
		} catch (InputMismatchException ime) {
			System.out.println("input must be in integer value");
		} catch (Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		} finally {
			scan.close();
		}
		System.out.println("Program execution done.");
	}

}
