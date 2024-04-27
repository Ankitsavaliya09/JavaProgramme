import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
	Scanner scan =  new Scanner(System.in);
		
		System.out.print("Enter Your cgpa:");
		int a = scan.nextInt();
		
		if(a>90) {
			System.out.println("AI");
		}else if(90>=a && 75<a){
			System.out.println("IoT");
		}else if(75>=a && 60<a) {
			System.out.println("neaturl network");
		}else if(60>=a && 45<a){
			System.out.println("Quantom computing");
		}else if(45>=a){
			System.out.println("IT Job");
		}
		scan.close();

	}

}
