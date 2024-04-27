import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int square = scan.nextInt();
		
		int Square = squareNumber(square);
		System.out.println("Your Number:"+Square);
		
		scan.close();
	}
	static int squareNumber(int num) {
		return (num*num);
	}
}
