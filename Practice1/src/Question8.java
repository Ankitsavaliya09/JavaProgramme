import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first number:");
		int num1 = scan.nextInt();
		System.out.println("Enter a second number:");
		int num2 = scan.nextInt();
		
		System.out.println("Before swap the value: num1 = "+num1+" Num2 = "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After swap the value: num1 = "+num1+" Num2 = "+num2);
		scan.close();
	}
	

}
