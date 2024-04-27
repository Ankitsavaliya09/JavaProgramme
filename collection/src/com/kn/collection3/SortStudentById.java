package com.kn.collection3;

import java.util.Comparator;

public class SortStudentById implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.rollNumber > s2.rollNumber) {
			return 1;
		} else if (s1.rollNumber < s2.rollNumber) {
			return -1;
		} else {
			return 0;
		}
	}

}
