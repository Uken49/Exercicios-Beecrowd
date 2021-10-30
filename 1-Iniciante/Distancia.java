import java.util.Scanner;
public class Distancia { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int distancia,tempo;
		
		distancia=in.nextInt();
		
		tempo=distancia*2;
		
		System.out.println(tempo+" minutos");
		in.close();
	}
}
