import java.util.Arrays;
import java.util.Scanner;

public class Exercitiul_6 {
	public static void main(String[] args) {
		int n, i, j, max, min, k;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of elements in the array:");
		n = s.nextInt();
		System.out.print("Enter number of max and min:");
		k = s.nextInt();
		int myArray[] = new int[n];
		System.out.println("Enter elements of array:");

		for (i = 0; i < n; i++) {
			myArray[i] = s.nextInt();
		}
		Arrays.sort(myArray);
		// printam sirul din numere sortate
		System.out.println("Sirul sortat este format din " + Arrays.toString(myArray));
		for (j = 0; j < k ; j++)

		{
			// printam ce mai mic si cel mai mare numar

			System.out.println("Cel mai mic numar este " + myArray[0 + j]);
			System.out.println("Cel mai mare numar este " + myArray[myArray.length - 1 - j]);
		}

	}
}
