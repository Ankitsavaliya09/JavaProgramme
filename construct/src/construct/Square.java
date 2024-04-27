package construct;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = scan.nextInt();
		int b = a*a;
		
		System.out.println("Square:"+b);
		scan.close();
	}

}
