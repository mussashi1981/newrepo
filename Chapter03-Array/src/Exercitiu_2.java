import java.util.stream.IntStream;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.*;

public class Exercitiu_2 {
	public static int[] myRange = IntStream.rangeClosed(1, 49).toArray();

	public static void main(String[] args) {
		List mylist = new ArrayList();
		for (int i = 0; i < myRange.length; i++) {
			mylist.add(myRange[i]);

		}
		System.out.println("Sirul de numere este "+mylist);
		Collections.shuffle(mylist);
		System.out.println("Sirul de numere random este: " +mylist);
		System.out.println("Numerele extrase la loto sunt: " );
		System.out.println(mylist.get(0));
		System.out.println(mylist.get(1));
		System.out.println(mylist.get(2));
		System.out.println(mylist.get(3));
		System.out.println(mylist.get(4));
		System.out.println(mylist.get(5));
		System.out.println(mylist.get(6));


		
	}
}