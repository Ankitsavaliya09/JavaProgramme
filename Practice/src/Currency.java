import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a indian currency:");
		int currency = scan.nextInt();
		
		double c1 = Currencyy(currency);
		System.out.println("Dollar:$"+c1);
		
		double c2 = Currency1(currency);
		System.out.println("Pound:"+c2);
		scan.close();
	}
	
	static double Currencyy(int currency) {
		return (currency*0.012);
	}

	
	static double Currency1(int C) {
		return  (C*0.0095);
    }
}
