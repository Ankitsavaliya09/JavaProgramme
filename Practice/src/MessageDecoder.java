import java.util.Scanner;

public class MessageDecoder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character:");
		char Char = scan.next().charAt(0);
		
		int ch1 = decodeCharacter(Char);
		System.out.println("Your character is "+Char+" to decode "+ch1);
		scan.close();
	}
	static int decodeCharacter(char ch) {
		//return ch;
		return (int) ch;
	}

}
