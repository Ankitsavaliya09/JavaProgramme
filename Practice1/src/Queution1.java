import java.util.Scanner;

public class Queution1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println("Number is Positive.");
		}else if(num==0){
			System.out.println("Neatural Number");
		}else 
		{
			System.out.println("Number is Negative.");
		}
		scan.close();
	}

}
