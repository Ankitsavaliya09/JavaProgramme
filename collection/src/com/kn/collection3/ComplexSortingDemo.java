package com.kn.collection3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComplexSortingDemo {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Ankit", 7.6);
		Student s2 = new Student(3, "Riten", 5.3);
		Student s3 = new Student(2, "Nirav", 6.9);
		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		
		System.out.println("==>Before Sorting");
		System.out.println(list1);
//		SortStudentById s = new SortStudentById();
//		Collections.sort(list1,s);
		
		//Sorting based on Name
//		Collections.sort(list1,new Comparator<Student>() {
//			public int compare(Student s1,Student s2) {
//				return s1.getName().compareTo(s2.getName());
//			}
//		});
		
		//Sorting based on RollNumner
//		Collections.sort(list1,new Comparator<Student>() {
//			public int compare(Student s1, Student s2) {
//				if (s1.rollNumber > s2.rollNumber) {
//					return 1;
//				} else if (s1.rollNumber < s2.rollNumber) {
//					return -1;
//				} else {
//					return 0;
//				}
//			}
//		});
		
		//Sorting based on percentage
		Collections.sort(list1,new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				if (s1.percentage > s2.percentage) {
					return 1;
				} else if (s1.percentage < s2.percentage) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		
		
		
		System.out.println("==>After sorting");
		System.out.println(list1);
	}

}
