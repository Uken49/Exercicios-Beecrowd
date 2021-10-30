import java.util.Scanner;

public class SeleçaoEmVetor1 { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double A[];
		int i;
		final int TAM = 100;
		A = new double[TAM];

		for (i = 0; i < TAM; i++) {
			A[i] = in.nextDouble();
		}

		for (i = 0; i < TAM; i++) {
			if (A[i] <= 10) {
				System.out.print("A[" + i + "] = ");
				System.out.printf("%.1f%n", A[i]);
			}

		}
		in.close();
	}
}
