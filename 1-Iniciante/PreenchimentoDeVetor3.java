import java.util.Scanner;
public class PreenchimentoDeVetor3 { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		final int TAM=100;
		double	x,N[];
		N=new double [TAM];
		int i;
		
		x=in.nextDouble();
		N[0]=x;
		for (i=1;i<TAM;i++) {
			N[i]=N[i-1]/2;
		}
		
		for (i=0;i<TAM;i++) {
			System.out.print("N["+i);
			System.out.printf("] = %.4f%n",N[i]);
		}
		in.close();
	}
}
