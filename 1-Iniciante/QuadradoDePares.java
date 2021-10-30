import java.util.*;

public class QuadradoDePares { // Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int entrada, i,resultado[],base=2;
		
		do {
			entrada = in.nextInt();
		} while (entrada<5 || entrada >2000);
		
		final int TAM=entrada;
		resultado = new int[TAM];
		
		for (i = 0; base <= entrada; i++) {
			resultado[i]=base*base;
			base+=2;
		}
		
		base=2;
		for (i = 0; base <= entrada; i++) {
			System.out.println(base+"^2 = "+resultado[i]);
			base+=2;
		}

		in.close();
	}
}
