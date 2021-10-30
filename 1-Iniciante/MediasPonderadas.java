import java.util.*;

public class MediasPonderadas { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qtdEntrada, i;
		double entrada1, entrada2, entrada3, media[];

		qtdEntrada = in.nextInt();
		media = new double[qtdEntrada];

		for (i = 0; i < qtdEntrada; i++) {
			entrada1 = in.nextDouble();
			entrada2 = in.nextDouble();
			entrada3 = in.nextDouble();

			media[i] = ((entrada1 * 2) + (entrada2 * 3) + (entrada3 * 5)) / 10;
		}
		for (i = 0; i < qtdEntrada; i++) {
			System.out.printf("%.1f%n",media[i]);
		}
		in.close();
	}
}
