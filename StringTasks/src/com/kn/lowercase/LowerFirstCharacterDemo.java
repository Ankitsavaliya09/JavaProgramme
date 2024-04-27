package com.kn.lowercase;

import java.util.Scanner;

public class LowerFirstCharacterDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String Data=");
		String s1 = scan.nextLine();

		LowerFirstCharacter lowerfirstcharacter = new LowerFirstCharacter();
		String s2 = lowerfirstcharacter.lowerFirstCharacter(s1);

		System.out.println("Ouput=" + s2);

		scan.close();
	}

}
