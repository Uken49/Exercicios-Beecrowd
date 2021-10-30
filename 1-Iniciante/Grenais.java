import java.util.*;

public class Grenais { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int golInter, golGremio, i, grenais = 0, vitGremio = 0, vitInter = 0, empate = 0;

		for (i = 1; i < 2; i++) {
			do {
				golInter = in.nextInt();
				golGremio = in.nextInt();
				grenais++;

				if (golGremio > golInter) {
					vitGremio++;
				} else if (golGremio < golInter) {
					vitInter++;
				} else {
					empate++;
				}
				System.out.println("Novo grenal (1-sim 2-nao)");
				i = in.nextInt();
				switch (i) {
				case 1:
					i = 0;
					break;
				case 2:
					i = 1;
					break;
				}
			} while (i != 0 && i != 1);

		}
		System.out.println(grenais + " grenais");
		System.out.println("Inter:" + vitInter);
		System.out.println("Gremio:" + vitGremio);
		System.out.println("Empates:" + empate);
		if (vitInter > vitGremio) {
			System.out.println("Inter venceu mais");
		} else if (vitInter > vitGremio) {
			System.out.println("Gremio venceu mais");
		} else {
			System.out.println("Nao houve vencedor");
		}

		in.close();
	}
}
