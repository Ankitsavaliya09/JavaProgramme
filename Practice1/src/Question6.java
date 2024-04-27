import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a First Number:");
		int num1 = scan.nextInt();
		System.out.println("Enter a Second Number:");
		int num2 = scan.nextInt();
		System.out.println("Enter a Third Number:");
		int num3 = scan.nextInt();
		
		if(num1>=num2 && num1>=num3) 
		{
			System.out.println("Largest Number is "+num1);
		}else if(num2>=num3 && num2>=num1)
		{
			System.out.println("Largest Number is "+num2);
		}else if(num3>=num1 && num3>=num2)
		{
			System.out.println("Largest Number is "+num3);
		}
		scan.close();
	}
}
