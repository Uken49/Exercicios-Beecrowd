import java.util.*;
public class Intervalo2 { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int qtdEntrada,entrada,i,dentro=0,fora=0;
		
		do {
			qtdEntrada=in.nextInt();
		} while (qtdEntrada>10000);
		
		for(i=0;i<qtdEntrada;i++){
			do {
				entrada=in.nextInt();
			} while (entrada < -10000000 && entrada > 10000000);
			if (entrada>=10 && entrada<=20) {
				dentro++;
			}else {
				fora++;
			}
		}
		System.out.println(dentro+" in");
		System.out.println(fora+" out");
		
		
		in.close();
	}
}
