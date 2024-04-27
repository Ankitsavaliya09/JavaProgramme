import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number=");
		int num = scan.nextInt();
		int firstNumber=0;
		int secondNumber=1;
		int thirdNumber;
		System.out.print(firstNumber+" "+secondNumber+" ");
		for(int i=3;i<=num;i++) {
			thirdNumber=firstNumber+secondNumber;
			System.out.print(thirdNumber+" ");
			firstNumber=secondNumber;
			secondNumber=thirdNumber;
		}
		scan.close();
	}
}
