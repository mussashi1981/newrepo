import java.util.stream.IntStream;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
import java.util.*;
//https://www.baeldung.com/java-random-list-element

public class Exercitiu_21{
	public static int[] myRange = IntStream.rangeClosed(1, 49).toArray();

	public static void main(String[] args) {
		int extrageri = 6;
		Random rand = new Random();

		List mylist = new ArrayList();
		for (int i = 0; i < myRange.length; i++) {
			mylist.add(myRange[i]);
		}
		for (int j = -1; j < extrageri-1; j++)
		{
	        int randomIndex = rand.nextInt(mylist.size());
	        int randomElement =  (int) mylist.get(randomIndex);
	        mylist.remove(randomIndex);
	        System.out.println(randomElement);
	    }
		
		
	}
}