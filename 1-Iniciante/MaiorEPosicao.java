import java.util.Scanner;
public class MaiorEPosicao {//Main
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,maior=-99999,entrada[],posicao=0;
		final int TAM=100;
		entrada=new int [TAM];
		
		for(i=0;i<TAM;i++) {
			entrada[i]=in.nextInt();
			if (entrada[i]>maior) {
				maior=entrada[i];
				posicao=i;
			}
		}
		System.out.println(maior);
		System.out.println(posicao+1);
		in.close();
	}
}
