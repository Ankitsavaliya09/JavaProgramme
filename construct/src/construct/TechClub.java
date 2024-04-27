package construct;

import java.util.Scanner;

public class TechClub {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Marks:");
		int marks = scan.nextInt();
		
		if(marks>=90) {
			System.out.println("Welcome to the TechClub.");
		}else {
			System.out.println("Not Welcome.");
		}
		scan.close();
	}

}
