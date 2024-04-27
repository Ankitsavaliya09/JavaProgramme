import java.util.Scanner;

public class ContinueStatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i+"-Inside Loop");
		}
		System.out.println("Outside Loop");
		scan.close();
	}

}
