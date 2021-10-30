import java.util.Scanner;

public class Triangulo { // Main

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		if ((a < b + c) && (b < a + c) && (c < b + a)) {
			double perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f\n", perimetro);
		} else {
			double area = ((a + b) * c) / 2;
			System.out.printf("Area = %.1f\n", area);
		}
		in.close();
	}
}