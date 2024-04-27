package com.kn.inheritance.hybrid;

public class HybridInheritanceDemo {

	public static void main(String[] args) {
		EngineeringStudent es1 = new EngineeringStudent();
		es1.name = "Ankit";
		System.out.println("EngineeringStudent");
		System.out.println("Name = " + es1.name);

		MedicalStudent ms1 = new MedicalStudent();
		ms1.name = "Nirav";
		System.out.println("MedicalStudent");
		System.out.println("Name = " + ms1.name);

		JavaTrainer jt1 = new JavaTrainer();
		jt1.name = "Arun";
		System.out.println("JavaTrainer");
		System.out.println("Name = " + jt1.name);

		SQLTrainer s1 = new SQLTrainer();
		s1.name = "Arun";
		System.out.println("SQLTrainer");
		System.out.println("Name = " + s1.name);
	}

}
