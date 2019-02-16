
public class Exercitii_noi_1 {
public static void main(String[] args) {
		int[] myRange = { 1, 1, 3, 10, 10, 4, 3, 20, 30, 5, 5, 9, 9 };
		 for (int i=0;i<myRange.length-1; i++) {
		if (myRange[i]==myRange[i+1]&&myRange[i]==10) {
			System.out.println("S-a gasit "+myRange[i]);
		}
	}
}
}
