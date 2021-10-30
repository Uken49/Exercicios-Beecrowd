import java.util.Scanner;

public class CalculoSimples { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int id, qntd, i;	//Mesmo que o "id" não esteja sendo utilizado,ele ainda é nescessário para a URI
		double preco, valorT = 0;
		for (i = 1; i <= 2; i++) {
			id = in.nextInt();
			qntd = in.nextInt();
			preco = in.nextDouble();
			valorT = qntd * preco + valorT;
		}
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorT,"\n");
		in.close();
	}
}
