import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = scan.nextInt();
		int r,p=0,i=num;
		while(num>0) {
			r=num%10;
			p=(p*10)+r;
			num=num/10;
		}
		if(i==p) {
			System.out.println("Palindrome Number.");
		}else
		{
			System.out.println("Not a Palindrome Number.");
		}
	    scan.close();
	}

}
