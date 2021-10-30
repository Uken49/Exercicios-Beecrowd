import java.util.*;

public class CrescenteEDecrescente { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y;

		do {
			x = in.nextInt();
			y = in.nextInt();

			if (x < y) {
				System.out.println("Crescente");
			} else if (y<x) {
				System.out.println("Decrescente");
			}
		} while (x != y);

		in.close();
	}
}
