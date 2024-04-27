import java.util.Scanner;

public class DoubleNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int number = scan.nextInt();
		
		int num = doubleTheNumber(number);
		System.out.println("Your number:"+num);
		scan.close();
	}

	static int doubleTheNumber(int number) {
		return number*2;
	}

}
