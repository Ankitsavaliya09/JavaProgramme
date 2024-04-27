import java.util.Scanner;

class UserInputDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number for Addition=");
		int a = scan.nextInt();

		System.out.print("Enter a another number for Addition=");
		int b = scan.nextInt();

		System.out.println("Addition=" + (a + b));

		System.out.print("Enter a number for Addition of Real Number=");
		double d = scan.nextDouble();

		System.out.print("Enter a another number for Addition of Real Number=");
		double e = scan.nextDouble();

		System.out.println("Addition of real number=" + (d + e));

		System.out.print("Enter your age=");
		int age = scan.nextInt();
		System.out.println("Your age= " + age);
		scan.close();

	}
}