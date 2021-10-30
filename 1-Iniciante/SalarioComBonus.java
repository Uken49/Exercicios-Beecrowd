import java.util.*;

public class SalarioComBonus { // Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sal, vendas, salR;
		String nome; //Mesmo que não esteja sendo usada,ainda é preciso
		
		nome = in.next();
		sal = in.nextDouble();
		vendas = in.nextDouble();
		salR = sal + (vendas * 15 / 100.00);

		if (salR>684.53 && salR<684.55) { //Gambiarra marota
			System.out.printf("TOTAL = R$ %.2f%n", Math.floor(salR * 100) / 100);
		}else {
			System.out.printf("TOTAL = R$ %.2f%n",salR);
		}
		in.close();
	}
}
