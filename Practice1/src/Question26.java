import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		int sum = 1;
//		for(int i=1;num>=i;i++) {
		for (int i = num; i >= 1; i--) {
			sum = i * sum;
		}
		System.out.println(sum);
		scan.close();
	}

}
