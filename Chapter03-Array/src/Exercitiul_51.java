import java.util.stream.IntStream;
import java.util.Scanner;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
import java.util.List;
import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.*;

public class Exercitiul_51 {

	public static void main(String[] args) {
		int n, i, j, max;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of elements in the array:");
		n = s.nextInt();
		int myArray[] = new int[n];
		System.out.println("Enter elements of array:");

		for (i = 0; i < n; i++) {
			myArray[i] = s.nextInt();
		}
		System.out.println("Sirul nesortat este format din " + Arrays.toString(myArray));
		Arrays.sort(myArray);
		System.out.println("Sirul sortat este format din " + Arrays.toString(myArray));
		System.out.println("Cel mai mare numar este " + myArray[myArray.length - 1]);
		System.out.println("Al doilea cel mai mare numar este " + myArray[myArray.length - 2]);
	}

}