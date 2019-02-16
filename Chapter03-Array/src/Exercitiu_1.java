import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercitiu_1 {
	public static void main(String[] args) {
// se cere aflarea celui mai mare si celui mai mic numar dintr-un array
//declararea sirului si a variabilei max si min care va reprezenta nr maxim si nr minim
		int[] myArray = { 8, 1, 2, 10, 99, 23, 19, 22, 5 };
// ordonam sirul
		System.out.println("Sirul nesortat este format din " + Arrays.toString(myArray));
		Arrays.sort(myArray);
// printam ce mai mic si cel mai mare numar		
		System.out.println("Sirul sortat este format din " + Arrays.toString(myArray));
		System.out.println("Cel mai mic numar este " + myArray[0]);
		System.out.println("Cel mai mare numar este " + myArray[myArray.length - 1]);
	}
}
