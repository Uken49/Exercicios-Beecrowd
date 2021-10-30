import java.util.Scanner;
public class MenorEPosicao {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int i,n,min=1001,pos=0,X[];
		
		do {
			n=in.nextInt();
			
		} while (n<1 || n>1000);
			

		X=new int [n];
		
		for(i=0;i<n;i++) {
			X[i]=in.nextInt();
			
			if (X[i]<min) {
				min=X[i];
				pos=i;
			}
		}
		
		System.out.println("Menor valor: "+min);
		System.out.println("Posicao: "+pos);
		in.close();
	}
}
