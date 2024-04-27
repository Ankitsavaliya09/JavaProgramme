import java.util.Scanner;

public class StudentMarksAverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your first sem marks:");
		int Sem1 = scan.nextInt();
		System.out.print("Enter your second sem marks:");
		int Sem2 = scan.nextInt();
		System.out.print("Enter your third sem marks:");
		int Sem3 = scan.nextInt();
		System.out.print("Enter your Fourth sem marks:");
		int Sem4 = scan.nextInt();
		System.out.print("Enter your fifth sem marks:");
		int Sem5 = scan.nextInt();
		System.out.print("Enter your sixth sem marks:");
		int Sem6 = scan.nextInt();
		System.out.print("Enter your seventh sem marks:");
		int Sem7 = scan.nextInt();
		System.out.print("Enter your eighth sem marks:");
		int Sem8 = scan.nextInt();
		
		double average = calculateAverage(Sem1,Sem2,Sem3,Sem4,Sem5,Sem6,Sem7,Sem8);
		
        double roundedNumber = Math.round(average * 100) / 100;

		System.out.println("Average of all sem marks:"+roundedNumber);
		scan.close();
	}
	
	static double calculateAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7, int sem8) {
		return (double) (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;
	}
}
