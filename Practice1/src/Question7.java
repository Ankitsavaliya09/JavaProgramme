import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number for Table:");
		int num = scan.nextInt();
		System.out.println("=======> Table Of "+num+" <=======");
		for(int i=1;i<11;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
		scan.close();
	}

}
