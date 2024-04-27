import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a first Number:");
		int a = scan.nextInt();
		System.out.println("Enter a Second Number:");
		int b = scan.nextInt();

		System.out.println("Enter a operation:");
		char c = scan.next().charAt(0);

		switch (c) {
		case '+':
			additionNumbers(a, b);
			break;
		case '*':
			multiplyNumbers(a, b);
			break;
		case '-':
			substarctNumbers(a, b);
			break;
		case '/':
			divideNumbers(a, b);
			break;
		case '%':
			findRemainder(a, b);
			break;
		default:
			System.out.println("Wrong Input.");
		}
		scan.close();
	}

	public static int additionNumbers(int num1, int num2) {
		int a = num1 + num2;
		System.out.println("Output:" + a);
		return (a);
	}

	public static int substarctNumbers(int num1, int num2) {
		int s = num1 - num2;
		System.out.println("Output:" + s);
		return (s);
	}

	public static int multiplyNumbers(int num1, int num2) {
		int m = num1 * num2;
		System.out.println("Output:" + m);
		return (m);
	}

	public static double divideNumbers(int num1, int num2) {
		double d = num1 / num2;
		System.out.println("Output:" + d);
		return (d);
	}

	public static int findRemainder(int num1, int num2) {
		int r = num1 % num2;
		System.out.println("Output:" + r);
		return (r);
	}

}