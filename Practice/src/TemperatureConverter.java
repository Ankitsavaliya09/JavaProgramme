import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Temperature in Fahrenheit:");
		double f = scan.nextDouble();
		
		double F = tempreature(f);
		System.out.println("Temperature in Celsius= "+F);
		
		scan.close();
	}

	static double tempreature(double F) {
		return ((F - 32) * 5)/9;
	}

}
