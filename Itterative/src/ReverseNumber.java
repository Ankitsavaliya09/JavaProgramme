import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = scan.nextInt();
		int r;
		System.out.print("Reverse Number=");
		while(num>0) {
			r = num%10;
			System.out.print(r);
			num = num/10;
		}
		scan.close();
	}

}
