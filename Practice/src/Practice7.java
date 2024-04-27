import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a principal number:");
		int p = scan.nextInt();
		System.out.println("Enter a rate:");
		int r = scan.nextInt();
		System.out.println("Enter a time:");
		int n = scan.nextInt();
		
		int s = simpleIntrest(p, r, n);
		System.out.println("Simple Intrest:"+s);
		scan.close();
	}
	static int simpleIntrest(int P,int R,int N) {
		return P*R*N;
	}
}
