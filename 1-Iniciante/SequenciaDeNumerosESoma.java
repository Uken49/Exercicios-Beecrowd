import java.util.*;

public class SequenciaDeNumerosESoma { // Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X, Y,sum = 0;

		while (((X = in.nextInt()) > 0) && ((Y = in.nextInt()) > 0)) {
			sum=0;
			if (X > Y) {
				for (Y = Y; Y <= X; Y++) {
					sum += Y;
					System.out.print(Y + " ");
				}
				System.out.print("Sum=" + sum + "\n");
			} else {
				for (X = X; X <= Y; X++) {
					sum += X;
					System.out.print(X + " ");
				}
				System.out.print("Sum=" + sum + "\n");
			}
		}
		in.close();
	}
}