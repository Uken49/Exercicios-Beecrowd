import java.util.Scanner;

public class Consumo { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int X; //Distância em KM
		double Y,kml; //Y eh combustível gasto
		
		X=in.nextInt();
		Y=in.nextDouble();
		kml=X/Y;
		
		System.out.printf("%.3f km/l%n", kml,"\n");
		in.close();
	}
}
