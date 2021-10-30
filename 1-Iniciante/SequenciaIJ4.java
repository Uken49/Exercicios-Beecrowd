
public class SequenciaIJ4 { // Main
	public static void main(String[] args) { // Definitivamente esse é o pior exercicio do INICIANTE.
		int i;
		double I[], J[], agregador = 1, decimal = 0.2, auxiliarI = 0;

		final int TAM = 33;
		I = new double[TAM];
		J = new double[TAM];

		// Calculando
		for (i = 0; i < TAM; i++) {
			if (i % 3 == 0 && i != 0) {
				auxiliarI = decimal;
				agregador = 1;
				agregador += decimal;
				decimal += 0.2;
			}
			I[i] = auxiliarI;

			J[i] += agregador;
			agregador++;

			// Apresentando
			if (I[i] % 1 == 0 || I[i] > 1.9 && I[i] < 2.1) {
				System.out.printf("I=%.0f", I[i]);
			} else {
				System.out.printf("I=%.1f", I[i]);
			}

			if (J[i] % 1 == 0) {
				System.out.printf(" J=%.0f%n", J[i]);
			} else {
				System.out.printf(" J=%.1f%n", J[i]);
			}
		}

	}
}
