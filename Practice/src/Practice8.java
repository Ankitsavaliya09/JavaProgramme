import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();

		isPrimeNumber(num);
		System.out.println("First "+num+" Prime Number is:");
		isPrime(num);
		isPrimeRange(num);
		scan.close();
	}

	static void isPrimeNumber(int num) {
		int count = 1;
		for (int i = 2; num >= i; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("This is a Prime Number.");
		} else {
			System.out.println("This is not a prime number");
		}
	}

	static void isPrime(int num) {
		for (int i = 2; num > 0; i++) {
			boolean value = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					value = false;
				}
			}
			if (value == true) {
				System.out.println(i);
				num--;
			}
		}
	}
	static void isPrimeRange(int num) {
		for(int i=2;num>=i;i++) {
//			boolean result = true;
//			for(int j=2;j<=i;j++) {
			if(num%i==0) {
				System.out.println(i);
//				result = false;
//				continue;
			}
//			}
//			if(result==true) {
//				System.out.println(i);
//			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
