import java.util.*;

public class Resto2 { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int entrada, i, divisiveis[], dividendo = 1;
		final int TAM = 10000;
		divisiveis = new int[TAM];

		entrada = in.nextInt();

		for (i = 0; i < TAM; i++) {
			if ((divisiveis[i] = dividendo % entrada) == 2) {
				System.out.println(dividendo);
			}
			dividendo++;
		}
		in.close();
	}
}
