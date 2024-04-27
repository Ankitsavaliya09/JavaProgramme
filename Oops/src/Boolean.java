import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//boolean a;
		
		System.out.println("Please Enter a boolean value:");
		boolean a = scan.nextBoolean();
		
		System.out.println("Output:"+a);
		scan.close();
	}

}
