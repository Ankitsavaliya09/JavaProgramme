import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		int i, r = 0, n;
		n = num;
		while (num > 0) {
			i = num % 10;
			r = (i * i * i) + r;
			num = num / 10;
		}
		if (n == r) {
			System.out.println("This is ArmStrong Number");
		} else {
			System.out.println("This is Not ArmStrong Number");
		}
		scan.close();
	}
}
