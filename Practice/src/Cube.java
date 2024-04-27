import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int cube = scan.nextInt();
		
		int Cube = cubeNumber(cube);
		System.out.println("Your Number:"+Cube);
	
	scan.close();
	}
	static int cubeNumber(int num) {
		return (num*num*num);
	}
}
