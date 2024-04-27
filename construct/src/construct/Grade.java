package construct;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int a = scan.nextInt();
		
		if(a>90) {
			System.out.println("A Grade");
		}else if(90>a && 75<a){
			System.out.println("B Grade");
		}else if(75>a && 50<a) {
			System.out.println("C Grade");
		}else if(50>a && 35<a){
			System.out.println("D Grade");
		}else {
			System.out.println("One More Attempt");
		}
		scan.close();
	}

}
