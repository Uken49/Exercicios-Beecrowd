import java.util.Scanner;

public class PreenchimentoDeVetor1 { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int N[], V, i;

		N = new int[TAM];
		V = in.nextInt();
		N[0] = V;
		for (i = 1; i < TAM; i++) {
			N[i] = (N[i - 1] * 2);
		}
		for (i = 0; i < TAM; i++) {
			System.out.println("N[" + i + "] = " + N[i]);
		}
		in.close();
	}
}
