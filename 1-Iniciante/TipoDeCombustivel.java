import java.util.*;

public class TipoDeCombustivel { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int alcool = 0, gasolina = 0, diesel = 0, id, i;

		for (i = 0; i < 2; i++) {
			do {
				id = in.nextInt();
			} while (id < 1 || id > 4);
			
			switch (id) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			case 4:
				System.out.println("MUITO OBRIGADO");
				System.out.println("Alcool: " + alcool);
				System.out.println("Gasolina: " + gasolina);
				System.out.println("Diesel: " + diesel);
				System.exit(0);
			}
			i = 0;
		}
		in.close();
	}
}
