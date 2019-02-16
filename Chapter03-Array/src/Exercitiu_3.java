import java.util.stream.IntStream;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.*;

public class Exercitiu_3 {
	public static int[] myRange = { 1, 1, 3, 4, 3, 5, 5, 9, 9 };
	public static int i = 0;
	public static int j = 0;

	public static void main(String[] args) {

// generarea sirului de numere de la 1 la 100 
		System.out.println("Numarul duplicat este urmatorul:");

		for (int i = 0; i < myRange.length; i++)
			for (int j = i + 1; j < myRange.length; j++) {
				if ((myRange[i]) == (myRange[j]))
					System.out.println(myRange[i]);

			}


	}
}
