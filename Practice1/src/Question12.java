import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		int div;
		div=num%10;
		if(num%7==0) {
			System.out.println("Buzz Number");
		}else if(div==7) {
			System.out.println("Buzz Number");
		}else {
			System.out.println("Not a Buzz Number");
		}
		scan.close();
	}
}
