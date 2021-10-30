
public class SequenciaIJ3 { // Main
	public static void main(String[] args) {
		final int TAM = 15;
		int I[], J[], i, m = 1, n = 6, aux = 1;

		I = new int[TAM];
		J = new int[TAM];

		I[0] = 1;
		J[0] = 7;
		for (i = 1; i < TAM; i++) {
			if (i % 3 <= 0) {
				m = m + 2;
			}
			I[i] = m;
			J[i] = n;
			if (aux == 2) {
				n = n + 4;
				aux = 0;
			} else {
				n--;
				aux++;
			}
		}

		for (i = 0; i < TAM; i++) {
			System.out.println("I=" + I[i] + " J=" + J[i]);
		}
	}
}
