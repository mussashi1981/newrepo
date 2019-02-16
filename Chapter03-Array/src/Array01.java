
public class Array01 {
	public static void main(String[] args) {
		double[] raduarray = {0.7, 4.2, 63.75, -3};
		for (int i = 0; i < raduarray.length; i++ )
		{
			System.out.println(raduarray[i]);
		}
		//summing all elements
		double total = 0;
		for (int i = 0; i <raduarray.length; i++ ) {
			total += raduarray[i];
		}
		System.out.println("totalul este " + total);
		
	}

}
