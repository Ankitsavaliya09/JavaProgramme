import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = scan.nextInt();
		int count = 0, r, n;
		n = num;
		while (num > 0) {
			r = num % 10;
			count++;
			num = num / 10;
		}
		if (count <= 3) {
			int i, r1 = 0;
			while (num > 0) {
				i = num % 10;
				r1 = (i * i * i) + r1;
				num = num / 10;
			}
			if (r1 == n) {
				System.out.println("This is Narcissistic Number.");
			} else {
				System.out.println("This is not a Narcissistic Number.");
			}
		} else {
			int i1, r2 = 0;
			while (num > 0) {
				i1 = num % 10;
				r2 = (i1 * i1 * i1 * i1) + r2;
				num = num / 10;
			}
			if (r2 == n) {
				System.out.println("This is Narcissistic Number.");
			} else {
				System.out.println("This is not a Narcissistic Number.");
			}
		}

		System.out.println(count);
		scan.close();
	}
}
