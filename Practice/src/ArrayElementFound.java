import java.util.Scanner;

public class ArrayElementFound {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int[] arr = new int[scan.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + (i + 1) + " Element");
			arr[i] = scan.nextInt();
		}

		System.out.println("Enter Element to found in array");
		int found = scan.nextInt();

		int count = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == found) {
				count++;
				index = i;
				break;
			}
		}

		if (count == 1) {
			System.out.println("True and index = "+index);
		} else {
			System.out.println("False");
		}
		scan.close();
	}

}
