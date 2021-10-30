import java.util.*;

public class ProdutoSimples { // Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int PROD, a, b;

		a = in.nextInt();
		b = in.nextInt();
		PROD = a * b;
		System.out.println("PROD = " + PROD);
		in.close();
	}
}
