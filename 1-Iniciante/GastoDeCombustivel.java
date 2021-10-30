import java.util.Scanner;
public class GastoDeCombustivel { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in); 
		double tempo,velociMedia;
		double litros;
		
		tempo=in.nextInt();
		velociMedia=in.nextInt();
		
		litros=tempo*velociMedia/12;
		
		System.out.printf("%.3f%n",litros,"\n");
		in.close();
	}
}
