import java.util.Scanner;

public class ArrayPosition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int[] arr = new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+(i+1)+" Element");
			arr[i] = scan.nextInt();
		}
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("Enter value to be inserted");
		int value = scan.nextInt();
		
		System.out.println("Enter position to be inserted");
		int position = scan.nextInt();
		
		arr[position] = value;
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
		scan.close();
	}

}
