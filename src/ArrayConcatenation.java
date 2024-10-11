import java.util.Scanner;

public class ArrayConcatenation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size1;
		do {
			System.out.print("Enter size of the first array: ");
			size1 = input.nextInt();
		} while (size1 <= 0);
		int[] array1 = new int[size1];
		for (int i = 0; i < size1; i++) {
			System.out.print("Enter element " + (i + 1) + "th of the first array: ");
			array1[i] = input.nextInt();
		}

		int size2;
		do {
			System.out.print("\nEnter size of the second array: ");
			size2 = input.nextInt();
		} while (size2 <= 0);
		int[] array2 = new int[size2];
		for (int i = 0; i < size2; i++) {
			System.out.print("Enter element " + (i + 1) + "th of the second array: ");
			array2[i] = input.nextInt();
		}

		int[] array3 = new int[size1 + size2];
		for (int i = 0; i < size1; i++) {
			array3[i] = array1[i];
		}
		System.arraycopy(array2, 0, array3, size1, size2);

		System.out.println("\nConcatenation of the two arrays: ");
		for (int num : array3) {
			System.out.print(num + " ");
		}
	}
}
