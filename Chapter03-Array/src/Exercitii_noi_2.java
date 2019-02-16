//8 ) We are given an array of integer of even length.
// Write a method to find the largest element between first, last, and middle values from the given array.
public class Exercitii_noi_2 {
	public static void main(String[] args) {
		int[] myRange = { 10, 4, 3, 10, 23, 4, 3, 20, 100, 30, 5, 5, 9, 9 , 11};
		int a = myRange[0];
		int b = myRange[myRange.length / 2];
		int c = myRange[myRange.length-1];
		System.out.println("Primul numar este "+a);
		System.out.println("Numarul de mijloc este " +b);
		System.out.println("Numarul de sfarsit este " +c);
		if (a>b&&a>c) {System.out.println(a+" e cel mai mare");}
		if (b>a&&b>c) {System.out.println(b+" e cel mai mare");}
		if (c>b&&c>a) {System.out.println(c+" e cel mai mare");}
	}
}
