import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Character.");
		char c = scan.next().charAt(0);
		
		int ch1 = decodeCharacter(c);
		if(ch1>=65 && ch1<=90) {
			System.out.println("Charcater is Uppercase.");
		}else if(ch1>=97 && ch1<=122) {
			System.out.println("Charcter is Lowercase.");
		}else {
			System.out.println("Wrong Input.");
		}
		scan.close();
		
		
		
	}
	static int decodeCharacter(char ch) {
		return (int) ch;
	}
}
