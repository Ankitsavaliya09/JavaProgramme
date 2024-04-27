import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Number is Even.");
		}else
		{
			System.out.println("Number is Odd.");
		}
		scan.close();
	}

}
