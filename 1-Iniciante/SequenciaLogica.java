import java.util.*;

public class SequenciaLogica { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int i, entrada, A, B, C;

		do {
			entrada = in.nextInt();

		} while (entrada <= 1 || entrada >= 1000);

		for (i = 0; i < entrada; i++) {
			A = i + 1;
			B = (i + 1) * (i + 1);
			C = (i + 1) * (i + 1) * (i + 1);

			System.out.println(A + " " + B + " " + C);
			System.out.println(A + " " + (B + 1) + " " + (C + 1));
		}
		in.close();
	}
}
