import java.util.*;

public class ParOuImpar { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qtdEntrada, entrada, i;
		String testes[];
		
		do {
			qtdEntrada = in.nextInt();
		} while (qtdEntrada > 10000);

		final int TAM = qtdEntrada;
		testes = new String[TAM];

		for (i = 0; i < TAM; i++) {
			do {
				entrada = in.nextInt();
			} while (entrada < -10000000 || entrada > 10000000);
			
			if (entrada==0) {
				testes[i]="NULL";
			}else if (entrada%2==0) {
				testes[i]="EVEN";
			}else {
				testes[i]="ODD";
			}
			
			if (entrada>0) {
				testes[i]+=" POSITIVE";
			}else if (entrada<0) {
				testes[i]+=" NEGATIVE";
			}
		}
		
		for (i = 0; i < TAM; i++) {
			System.out.println(testes[i]);
		}
		in.close();
	}
}
