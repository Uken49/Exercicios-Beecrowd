import java.util.Scanner;

public class SomaDeImparesConsecutivosII { // Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qtdEntrada, entrada1[], entrada2[], i,j, somaImpar[], menor, maior;

		qtdEntrada = in.nextInt();

		entrada1 = new int[qtdEntrada];
		entrada2 = new int[qtdEntrada];
		somaImpar = new int[qtdEntrada];
		
		for (i = 0; i < qtdEntrada; i++) {
			entrada1[i] = in.nextInt();
			entrada2[i] = in.nextInt();
			if (entrada1[i] > entrada2[i]) {
				maior = entrada1[i];
				menor = entrada2[i];
			} else {
				maior = entrada2[i];
				menor = entrada1[i];
			}
			for (j =menor+1 ; j < maior; j++) {
				if (j%2!=0) {
					somaImpar[i]+=j;
				}
			}
		}
		
		for (i = 0; i < qtdEntrada; i++) {
			System.out.println(somaImpar[i]);
		}

		in.close();
	}
}
