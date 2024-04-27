package construct;

import java.util.Scanner;

public class Operatation {

	public static void main(String[] args) {
		System.out.println("Choose an opertaton(+,-,*,/)");
		System.out.println("+ -->Addition");
		System.out.println("- -->Substarction");
		System.out.println("* -->Multiplication");
		System.out.println("/ -->Division");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Operation:");
		char c = scan.next().charAt(0);
		
		System.out.println("Enter two number for "+c+":");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(c == '+') {
			System.out.println("Product of given 2 number "+a+" "+b+" = "+(a+b));
		}else if(c == '-') {
			System.out.println("Product of given 2 number "+a+" "+b+" = "+(a-b));
		}else if(c == '*') {
			System.out.println("Product of given 2 number "+a+" "+b+" = "+(a*b));
		}else if(c == '/') {
			System.out.println("Product of given 2 number "+a+" "+b+" = "+(a/b));
		}else {
			System.out.println("Can't Do");
		}
		scan.close();
	}

}
