import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Your Bill Amount:$");
		int amount = scan.nextInt();
		
		if(amount>100) {
			System.out.println("Discount Applicable");
		}
		scan.close();
	}

}
