package construct;

import java.util.Scanner;

public class OnlyPositive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a>b) {
			System.out.println("Number Different."+(a-b));
		}else {
			System.out.println("Number Different."+(b-a));
		}
		scan.close();
	}

}
