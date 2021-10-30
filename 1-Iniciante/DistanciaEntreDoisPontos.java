import java.util.Scanner;
public class DistanciaEntreDoisPontos { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		double distancia,x1,y1;
		double x2,y2;
		
		x1=in.nextFloat();
		y1=in.nextFloat();
		
		x2=in.nextFloat();
		y2=in.nextFloat();
		distancia=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
		
		System.out.printf("%.4f%n",Math.sqrt(distancia),"\n");
		in.close();
	}

}
