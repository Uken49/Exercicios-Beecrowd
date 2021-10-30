import java.util.Scanner;

public class FormulaDeBhaskara { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double A = in.nextDouble(), B = in.nextDouble(), C = in.nextDouble(), R1, R2, D;

		D = (B * B) - 4 * A * C;
		if (A==0 || C==00 || D<=0) {
			System.out.println("Impossivel calcular");
		} else {
			R1 = (-B + Math.sqrt(D)) / (2 * A);
			R2 = (-B - Math.sqrt(D)) / (2 * A);

			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f%n", R2);
			in.close();
		}
	}
}
