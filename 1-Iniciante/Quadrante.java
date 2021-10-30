import java.util.*;
public class Quadrante { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y;

		do {
			x = in.nextInt();
			y = in.nextInt();

			if (x == 0 || y == 0) {
				System.exit(0);
			} else if (x > 0 && y > 0) {
				System.out.println("primeiro");
				
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
				
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
				
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}

		} while (x != 0 && y != 0);

		in.close();
	}
}
