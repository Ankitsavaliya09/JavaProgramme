import java.util.Scanner;

class CodingBakery {
	public static void main(String[] args) {
		System.out.println("*******WELCOME TO THE CODINGBAKERY*******");
//System.out.println("Price of Normal Tea=10");
		System.out.println("Price of Flavour Tea=15");

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the tea Flavour=");
		String f = scan.nextLine();

		System.out.print("Enter Your tea Quantity=");
		int q = scan.nextInt();

		System.out.print("Sugar or Sugar Free=");
		scan.nextLine();
		String s = scan.nextLine();

		System.out.println("------Your Bill------");
		System.out.println("Amount:" + (q * 15));
		scan.close();

	}

}
