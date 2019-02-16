import java.util.*;
import org.apache.commons.lang3.ArrayUtils;

public class Exercitiul_41 {
	public static void main(String[] args) {
		int[] myArray = new int[] {43,55,55,42,34,43,1,22,1,3,3};
		int k = 0;
		for (int i = 0; i < myArray.length-1; i++)
			for (int j = i + 1; j < myArray.length; j++)
				if ((myArray[i]) == (myArray[j])) {
					myArray = ArrayUtils.remove(myArray,j);
					k = ++k;
				}
		//printam numarul de duplicate
		System.out.println("Au fost gasite " +k+ " numere duplicat");
		// scoatem numerele duplicate
		System.out.println("Numerele fara duplicat" + Arrays.toString(myArray));
	}
}
