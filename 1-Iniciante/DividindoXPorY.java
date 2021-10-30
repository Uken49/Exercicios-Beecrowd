import java.util.*;
public class DividindoXPorY {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int qtdEntrada;
		double resultado,x,y;
		
		qtdEntrada=in.nextInt();
		
		for(int i=0; i<qtdEntrada;i++) {
			x=in.nextInt();
			y=in.nextInt();
			
			if (y!=0) {
				resultado=x/y;
				System.out.printf("%.1f%n",resultado);
			}else {
				System.out.println("divisao impossivel");
			}
		}
		
		
		in.close();
	}
}
