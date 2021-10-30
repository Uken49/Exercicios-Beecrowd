import java.util.*;

public class VariasNotasComValidacao { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double nota1, nota2, media;
		int i;

		for (i = 1; i < 2; i++) {

			do {
				nota1 = in.nextDouble();
				if (nota1 < 1 || nota1 > 10) {
					System.out.println("nota invalida");
				}
			} while (nota1 < 1 || nota1 > 10);

			do {
				nota2 = in.nextDouble();
				if (nota2 < 1 || nota2 > 10) {
					System.out.println("nota invalida");
				}
			} while (nota2 < 1 || nota2 > 10);
			
			media=(nota1+nota2)/2;
			System.out.printf("media = %.2f%n",media);
			do {
				System.out.println("novo calculo (1-sim 2-nao)");
				i=in.nextInt();
				switch (i) {
				case 1:
					i=0;
					break;
				case 2:
					i=1;
					break;
				}
			} while (i!=0 && i!=1);
		}
		in.close();
	}
}
