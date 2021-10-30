import java.util.*;

public class SortSimples { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM=3;
		int ordem[],digitado[],i;
		
		ordem = new int [TAM];
		digitado= new int [TAM];
		
		for (i = 0; i < TAM; i++) {
			ordem[i]=in.nextInt();
			digitado[i]=ordem[i];
		}
		Arrays.sort(ordem); //Arrays.sort coloca os números em ordem crescente
		for (int num : ordem) {
			System.out.println(num);
		}
		System.out.println("\n"+digitado[0]+"\n"+digitado[1]+"\n"+digitado[2]);
		in.close();
	}
}
