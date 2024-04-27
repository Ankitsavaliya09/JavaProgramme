package com.kn.object;

import java.util.Scanner;

public class StudentUtility {
	static Scanner scan = new Scanner(System.in);

	public static Student[] studentObjectCreation(int n) {

		Student[] srr = new Student[n];
		for (int i = 0; i < srr.length; i++) {
			System.out.println("Data of Student " + (i + 1));
			System.out.print("Student Id=");
			int id = scan.nextInt();
			System.out.print("Student Name=");
			String name = scan.next();
			System.out.print("Student Marks=");
			int marks = scan.nextInt();
			srr[i] = new Student(id, name, marks);
		}
		return srr;
	}

	public static void searchStudentById(Student[] srr) {
		int count = 0;
		int a = 0;
		System.out.println("==========================");
		System.out.print("Enter the Student id=");
		int sid = scan.nextInt();
		for (int i = 0; i < srr.length; i++) {
			if (srr[i].id == sid) {
				a = i;
				count++;
				break;
			}
		}
		if (count == 1) {
			System.out.println("Student Data:");
			System.out.println("Id = " + srr[a].id + ", Name = " + srr[a].name + ", Marks = " + srr[a].marks);
		} else {
			System.out.println("Student is not available.");
		}
	}

	public static void searchStudentByName(Student[] srr) {
		int count = 0;
		int a = 0;
		System.out.println("==========================");
		System.out.print("Enter the Student name=");
		String sname = scan.next();
		for (int i = 0; i < srr.length; i++) {
			if (srr[i].name.equalsIgnoreCase(sname)) {
				a = i;
				count++;
				break;
			}
		}
		if (count == 1) {
			System.out.println("Student Data:");
			System.out.println("Id = " + srr[a].id + ", Name = " + srr[a].name + ", Marks = " + srr[a].marks);
		} else {
			System.out.println("Student is not available.");
		}
	}

	public static void rateApplication() {
		System.out.println("==========================");
		System.out.println("Rate Our Application Out of Five = ");
		int rate = scan.nextInt();
		if (rate > 0 && rate < 6) {
			System.out.println("Rate Application:");
			for (int i = 1; i <= rate; i++) {
				System.out.print("*");
			}
		} else {
			System.out.println("Wrong input!");
		}
	}

}
