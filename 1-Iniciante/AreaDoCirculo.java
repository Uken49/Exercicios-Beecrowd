import java.util.Scanner;

public class AreaDoCirculo { // Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double area, n = 3.14159, raio;

		raio = in.nextDouble();
		area = n * (raio * raio);
		System.out.printf("A=%.4f%n", area, "asra\n");
		in.close();
	}
}
