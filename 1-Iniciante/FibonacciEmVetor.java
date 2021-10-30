import java.util.Scanner;

public class FibonacciEmVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, n, Fib[];
		final int T = in.nextInt(); // Número de casos de testes 6x
		Fib = new int[T];

		Fib[0] = 0;
		Fib[1] = 1;
		// Calculando Fibonacci
		for (i = 2; i < T; i++) {
			Fib[i] = Fib[i - 2] + Fib[i - 1];
		}
		// Fim calculo Fibonacci

		// Apresentando vetor
		for (i = 0; i < T; i++) {
			n = in.nextInt();  //6
			System.out.println("Fib(" + n + ") = " + Fib[n]);
		}
		in.close();
	}
}
