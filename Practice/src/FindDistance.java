import java.util.Scanner;

public class FindDistance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a speed of vehical in km/h:");
		double speed = scan.nextDouble();

		System.out.println("Enter a time of the vehical in hours:");
		double time = scan.nextDouble();

		double distance = calculateDistance(speed, time);
		System.out.println("Distance is " + distance + "km");

		scan.close();
	}

	static double calculateDistance(double speed, double time) {
		return speed * time;
	}

}
