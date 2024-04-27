import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 number for Addition:");
		int x = scan.nextInt();
		int y = scan.nextInt();
		add(x, y);

		System.out.println("Enter 2 number for subtraction:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		sub(a, b);

		int multification = multi();
		System.out.println("Multification:" + multification);

		System.out.println("Enter 2 number for division:");
		int o = scan.nextInt();
		int p = scan.nextInt();
//		divi(c, d);
		double Divi = divi(o, p);
		System.out.println("Division:" + Divi);

		double Average = average();
		System.out.println("Average:" + Average);

		double Modulo = modulo();
		System.out.println("Modulo:" + Modulo);

		scan.close();
	}

	static void add(int x, int y) {
		int z = x + y;
		System.out.println("Addition=" + z);
	}

	static void sub(int a, int b) {
		System.out.println("Subtraction:" + (a - b));
	}

	static int multi() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 number for Multification:");
		int c = scan.nextInt();
		int d = scan.nextInt();
		scan.close();
		return c * d;
	}

	static double divi(int o, int p) {
		return o / p;
	}

	static double modulo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 number for modulo:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		return a % b;
	}

	static double average() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 number for Average:");
		int e = scan.nextInt();
		int f = scan.nextInt();
		scan.close();
		return (e + f) / 2;
	}
}
