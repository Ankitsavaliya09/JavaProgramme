import java.util.Scanner;

public class BreakStatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {

			if (i % 7 == 0) {
				break;
			} else {
				System.out.println(i + "-Inside Loop");
			}
		}
		System.out.println("Outside Loop");
		scan.close();
	}
}
