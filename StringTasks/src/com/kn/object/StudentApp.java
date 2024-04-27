package com.kn.object;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] srr = StudentUtility.studentObjectCreation(2);
		System.out.println("==========================");
		for (int i = 0; i < srr.length; i++) {
			System.out.println("Data of student " + (i + 1));
			System.out.println("Id = " + srr[i].id + ", Name = " + srr[i].name + ", Marks = " + srr[i].marks);
		}
		
		StudentUtility.searchStudentById(srr);
		StudentUtility.searchStudentByName(srr);
		StudentUtility.rateApplication();
		scan.close();
	}

}
