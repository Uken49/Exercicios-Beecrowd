import java.util.*;
public class SeisNumerosImpares { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int entrada,i,impar;
		
		do {
			entrada=in.nextInt();
		} while (entrada<0);
		
		if (entrada%2==0) {
			impar=entrada+1;
		}else {
			impar=entrada;
		}
		for(i=0;i<6;i++) {
			
			System.out.println(impar);
			impar+=2;
		}
		in.close();
	}
}
