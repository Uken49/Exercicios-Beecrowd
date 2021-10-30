import java.util.Scanner;

public class TiposDeTriangulos { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c, armazem;
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		// Transformando A no maior número
		if (b > c && b > a) {
			armazem = b;
			b = a;
			a = armazem;
		}
		if (c > a && c > b) {
			armazem = c;
			c = a;
			a = armazem;
		}
		// Transformando B no maior número
		if (c > b) {
			armazem = c;
			c = b;
			b = armazem;
		}
		// Apresentando os triângulos

		if (a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
				
			if ((a * a) == ((b * b) + (c * c))) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if ((a * a) > ((b * b) + (c * c))) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if ((a * a) < ((b * b) + (c * c))) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (a == b && b == c) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if ((a==b && a!=c) || (b==c && b!=a) || (c==a && c!=b) ) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		in.close();
	}
}
