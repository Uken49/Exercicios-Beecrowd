import java.util.Scanner;
public class SubstituicaoEmVetor1 { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		final int TAM=10;
		int X[],i;
		X =new int[TAM];
		
		for(i=0;i<TAM;i++){
			X[i]=in.nextInt();
			if (X[i]<=0) {
				X[i]=1;
			}
		}
		for (i=0;i<TAM;i++) {
			System.out.println("X["+i+"] = "+X[i]);
		}
		in.close();
	}
}
