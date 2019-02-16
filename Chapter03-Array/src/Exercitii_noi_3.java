import java.util.Arrays;

//       7) We are given an array of integers, and a range - represented by another two integers (a, b).
//Write a method that tells us which elements from the given array   are in the (a,b) range.

public class Exercitii_noi_3 {
	public static void main(String[] args) {
		int[] myRange = { 9, 1, 5, 6, 7, 2, 3, 4, 5, 6, 7, 12, 13, 23, 8 };
		int a = 4;
		int b = 10;
		for (int i = 0; i < myRange.length; i++) {
			if (myRange[i] >= a && myRange[i] <= b) {
				System.out.println(myRange[i]);
			}
		}
	}
}