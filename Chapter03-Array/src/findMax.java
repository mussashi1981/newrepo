
public class findMax {
	public static void main(String[] args) {
//gasiti elementul cel mai mare dintr-un array de numere
// pas 1: alegem o variabila max pe care o initializam cu indexul 0 din sir 
// pas 2: iteram prin elementele sirului de la poizitia incepand de la indexul 1 
// pas 3: verificam daca  elementul din iteratia curenta este mai mare decat max
// pas 4: daca valoarea este true atribuim la max valoarea de la indicele respectiv
// pas 5: afisarea

		int[] myArray = { 348, 234, -348, 443, 0, 498 };
		int max = myArray[0];
		for (int i = 0; i < myArray.length; i++) {
		if (myArray[i]>max) {
			 max = myArray[i];
		}
		}
		System.out.println("afisam numarul maxim " +max);

	}
}
