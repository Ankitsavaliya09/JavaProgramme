import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();

		int count=0;
		for(int i=1;i<=num;i++) {
			int fn=i;
			int sn=i+1;
			int result=fn*sn;
			if(result==num) {
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println("Pronic number");
		}else {
			System.out.println("not pronic number");
		}
		scan.close();
	}

}
