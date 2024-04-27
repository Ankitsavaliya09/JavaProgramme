import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String f = scan.next();
		
		System.out.println("Enter your middle name:");
		String m =scan.next();
		
		System.out.println("Enter your Last name:");
		String s = scan.next();
		
		String fullName = joinStrings(f,m,s);
		System.out.println(fullName);
		
		scan.close();
		
	}


static String joinStrings(String firstName, String middleName,  String lastName) {
	return (firstName+" "+middleName+" "+lastName);
}
}