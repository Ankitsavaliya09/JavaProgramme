package construct;

import java.util.Scanner;

public class Rainbow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Character:");
		char c = scan.next().charAt(0);
		
		if(c=='v' || c=='V') {
			System.out.println("violet");
		}else if(c=='i' || c=='I'){
			System.out.println("Indigo");
		}else if(c=='b' || c=='B') {
			System.out.println("Blue");
		}else if(c=='g' || c=='G') {
			System.out.println("Green");
		}else if(c=='y' || c=='Y') {
			System.out.println("Yellow");
		}else if(c=='o' || c=='O') {
			System.out.println("Orange");
		}else if(c=='r' || c=='R') {
			System.out.println("Red");
		}else {
			System.out.println("Do not rainbow color");
		}
		scan.close();
	}

}
