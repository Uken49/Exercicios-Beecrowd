import java.util.*;

public class Area { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double A, B, C; // Fiz em duas linhas para não me confundir
		double tri, circ, trap, quadr, retan, pi = 3.14159;

		A = in.nextDouble();
		B = in.nextDouble();
		C = in.nextDouble();
		tri = (A * C) / 2.0;
		circ = (C * C) * pi;
		trap = (A + B)*C / 2;
		quadr = B * B;
		retan = A * B;

		System.out.printf("TRIANGULO: %.3f%n", tri);
		System.out.printf("CIRCULO: %.3f%n", circ);
		System.out.printf("TRAPEZIO: %.3f%n", trap);
		System.out.printf("QUADRADO: %.3f%n", quadr);
		System.out.printf("RETANGULO: %.3f%n", retan);
		in.close();
	}
}
