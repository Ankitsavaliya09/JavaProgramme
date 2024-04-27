package com.kn.inheritance.heirarichal;

public class HeirarichalInheritanceDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "Ankit";
		e1.salary = 1111;
		System.out.println("Employee");
		System.out.println("Name = " + e1.name + " - Salary = " + e1.salary);

		Engineer d1 = new Engineer();
		d1.name = "Nirav";
		d1.salary = 2222;
		System.out.println("Engineer");
		System.out.println("Name = " + d1.name + " - Salary = " + d1.salary);

		TestEngineer te1 = new TestEngineer();
		te1.name = "Prince";
		te1.salary = 3333;
		System.out.println("TestEngineer");
		System.out.println("Name = " + te1.name + " - Salary = " + te1.salary);

		TeamLeader tl1 = new TeamLeader();
		tl1.name = "Riten";
		tl1.salary = 4444;
		System.out.println("Team Leader");
		System.out.println("Name = " + tl1.name + " - Salary = " + tl1.salary);

		Manager m1 = new Manager();
		m1.name = "Chaman";
		m1.salary = 5555;
		System.out.println("Manager");
		System.out.println("Name = " + m1.name + " - Salary = " + m1.salary);
	}

}
