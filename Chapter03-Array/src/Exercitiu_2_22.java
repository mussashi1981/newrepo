import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Exercitiu_2_22 {

	public static void main(String[] args) {

		// 1. definim un sir de 6 variabile in care stocam numerele norocoasa
		// 2. definim variabila in care stocam numarul extras

		int[] numere_norocoase = new int[6];
		int extragere;
		// 3. folosim 1 for cu care parcurgem cele 6 extrageri si inca 1 for cu care
		// facem comparatia
		// intre numarul extras si numarul norocos
		for (int i = 0; i < 6; i++) {
			extragere = (int) (Math.random() * 49 + 1);
			for (int j = 0; j < i; j++) {
				if (extragere == numere_norocoase[i])
					do {
						extragere = (int) (Math.random() * 49 + 1);
					} while (extragere == numere_norocoase[i]);
			}
			numere_norocoase[i] = extragere;

		}
			for (int k = 0; k<numere_norocoase.length; k++)
				System.out.println(numere_norocoase[k]+"");
			//System.out.println(extragere);
		}

	}
