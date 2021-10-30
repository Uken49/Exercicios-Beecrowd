import java.util.*;

public class ParesImparesPositivosENegativos { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numeros[], i, par = 0, impar = 0, positivo = 0, negativo = 0;
		final int TAM = 5;
		numeros = new int[TAM];

		for (i = 0; i < TAM; i++) {
			numeros[i] = in.nextInt();
			if (numeros[i] == 0) {
				par++;
			} else {
				if (numeros[i] % 2 == 0) {
					par++;
				} else {
					impar++;
				}

				if (numeros[i] < 0) {
					negativo++;
				} else {
					positivo++;
				}
			}
		}

		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");

		in.close();
	}
}
