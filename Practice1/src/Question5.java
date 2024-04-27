import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.print("Enter a First number:");
		int num1 = scan.nextInt();
		System.out.print("Enter a Second Number:");
		int num2 = scan.nextInt();
		System.out.println("Before Swap the value: a = "+num1+" b = "+num2);
		int r;
		r=num1;
		num1=num2;
		num2=r;
		System.out.println("After Swap the value: a = "+num1+" b = "+num2);
		scan.close();
	}
}
