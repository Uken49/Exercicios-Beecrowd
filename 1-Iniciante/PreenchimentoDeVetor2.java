import java.util.Scanner;

public class PreenchimentoDeVetor2 { // Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T, N[], i, contd = 0;
		final int TAM = 1000;
		N = new int[TAM];

		do {
			T = in.nextInt();
		} while (T <= 2 || T >= 50);

		for (i = 0; i < TAM; i++) {
			N[i] = contd;
			if (contd == (T - 1)) {
				contd = 0;
			} else {
				contd++;
			}
		}

		for (i = 0; i < TAM; i++) {
			System.out.println("N[" + i + "] = " + N[i]);
		}
		in.close();
	}
}
