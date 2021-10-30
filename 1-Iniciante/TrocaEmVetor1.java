import java.util.Scanner;

public class TrocaEmVetor1 { // Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 20;
		int i, k = TAM-1, N[], inverso[];
		N = new int[TAM];
		inverso = new int[TAM];

		for (i = 0; i < TAM; i++) {
			N[i] = in.nextInt();
			inverso[k] = N[i];
			k--;
		}
		for (i = 0; i < TAM; i++) {
			System.out.println("N[" + i + "] = " + inverso[i]);
		}
		in.close();
	}
}
