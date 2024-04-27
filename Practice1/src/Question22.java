import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = scan.nextInt();
		boolean isPrime = true;
		for (int i = 2; num >= i * i; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("This is a Prime Number.");
		} else {
			System.out.println("This is not a Prime Number.");
		}
		scan.close();
	}

}
