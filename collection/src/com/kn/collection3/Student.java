package com.kn.collection3;

public class Student{

	int rollNumber;
	String name;
	double percentage;
	public Student(int rollNumber, String name, double percentage) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.percentage = percentage;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", percentage=" + percentage + "]";
	}
//	@Override
//	public int compareTo(Student s) {
//		if(this.rollNumber > s.rollNumber) {
//			return 1;
//		}else if(this.rollNumber < s.rollNumber) {
//			return -1;
//		}else {
//			return 0;
//		}
//	}	
	
}
