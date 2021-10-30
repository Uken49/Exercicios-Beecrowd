import java.util.*;
public class Tabuada { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int entrada,i,tabuada[];
		final int TAM=10;
		tabuada=new int [TAM];
		
		do {
			entrada=in.nextInt();
		} while (entrada<2 || entrada >1000);
		
		for(i=0;i<TAM;i++) {
			tabuada[i]=(i+1)*entrada;
			System.out.println((i+1)+" x "+entrada+" = "+tabuada[i]);
		}
		in.close();
	}
}
