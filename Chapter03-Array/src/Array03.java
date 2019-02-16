
public class Array03 {
	//primim un array cu numar variabil de elemente. Se cere suma tuturor elementelor din array
	// Pas 1 : initializam variabila in care trebuie sa tinem suma
	// Pas 2 : Parcurgem vectorul pozitie cu pozitie
	// Pas 3 : Adunam pe rand fiecare element in variabila total
	public static void main(String[] args) {
		double[] myArray = new double[] {3, 2, 5, 2.2, 343};
		double total = 0;
		//initializarea forului pri declararea unei variabile
		for (int m=0; m<myArray.length; m++) {
		total+=myArray[m]; // total = total + myArray[m]	
		System.out.println("Suma partiala este "+total);

		}
		System.out.println("Suma este "+total);

	}
}
