import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = scan.nextInt();
		
		if(year%4==0) {
			System.out.println("This Year is Leap Year.");
		}else
		{
			System.out.println("This Year is Not Leap Year.");
		}
		scan.close();
	}
}
