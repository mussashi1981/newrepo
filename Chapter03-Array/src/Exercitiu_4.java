
import java.util.*;

public class Exercitiu_4 {


	public static void main(String ar[]) {
		int[] array = { 4, 3, 3, 4, 5, 2, 4, 9, 1 };
//folosim hashset pentru a lua elementele unice din sir.	
		HashSet list = new HashSet();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		System.out.println(list);
	}
}