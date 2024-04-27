import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		System.out.println("Enter a First interger value:");
		int a = scan.nextInt();
		System.out.println("Enter a Second integer Value:");
		int b = scan.nextInt();
		
		add(a,b);
		subs(a,b);
		multi(a,b);
		divi(a,b);
		modulo(a,b);
//		System.out.println("Addition:"+(a+b));
//		System.out.println("Substraction:"+(a-b));
//		System.out.println("Multification:"+(a*b));
//		System.out.println("Division:"+(a/b));
//		System.out.println("Modulo:"+(a%b));
		scan.close();
		
	}
	
	static void add(int a, int b) {
		System.out.println("Addition:"+(a+b));
	}
	
	static void subs(int a, int b) {
		System.out.println("Substraction:"+(a-b));
	}
	
	static void multi(int a,int b) {
		System.out.println("Multification:"+(a*b));
	}
	
	static void divi(int a,int b) {
		System.out.println("Division:"+(a/b));
	}
	static void modulo(int a,int b) {
		System.out.println("Modulo:"+(a%b));
	}


}
