import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for Factor:");
		int num = scan.nextInt();
		System.out.print("Factor of "+num+" is:");
		for (int i = 1; num >= i; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		scan.close();
	}

}
