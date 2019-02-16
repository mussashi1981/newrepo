import java.util.stream.IntStream;
import java.util.Scanner;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
import java.util.List;

import java.util.*;

public class Exercitiul_5 {

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
		max = myArray[0];
		for (i = 0; i < n; i++) {
			if (max < myArray[i]) {
				max = myArray[i];
			}
		}
		System.out.println("Primul maxim:" + max);
		int maximum = max;
		// eliminam maximul gasit si rulam inca o data procedura de comparatie
		myArray = ArrayUtils.removeElement(myArray, maximum);
		// noua comparatie
		max = myArray[0];
		for (i = 0; i < myArray.length; i++) {
			if (max < myArray[i]) {
				max = myArray[i];
			}
			
		}
		System.out.println("Al doilea maxim este: " + max);

	}
	

}