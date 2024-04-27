package construct;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = scan.nextInt();
		
		if(a>0) {
			System.out.println("Number is Positive.");
		}
		else {
			System.out.println("Number is Negative.");
		}
		scan.close();
	}

}
