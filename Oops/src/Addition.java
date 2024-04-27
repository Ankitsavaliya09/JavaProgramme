import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Integer Number:");
		int a = scan.nextInt();
		System.out.println("Enter a Double value:");
		double d = scan.nextDouble();
		double sum;
		sum=a+d;
		System.out.println("Sum Of Addition:"+sum);
		scan.close();
	}

}
