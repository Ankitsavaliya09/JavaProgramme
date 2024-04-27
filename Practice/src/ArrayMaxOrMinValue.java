import java.util.Scanner;

public class ArrayMaxOrMinValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int[] arr = new int[scan.nextInt()];
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println("Enter "+(i+1)+" element");
			arr[i] = scan.nextInt();
		}
		
		int max = 0;
		int min = 0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				max=arr[i];
				min=arr[i+1];
			}
		}
		if(max<arr[arr.length-1]) {
			max=arr[arr.length-1];
		}
		if(min>arr[arr.length-1]) {
			min=arr[arr.length-1];
		}
		System.out.println("Max="+max);
		System.out.println("Min="+min);
		scan.close();
	}

}
