import java.util.Scanner;
public class NumerosPositivos { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		double num,i;
		int pos=0;
		
		for (i=0;i<6;i++) {
			num=in.nextDouble();
			
			if (num>0) {
				pos++;
			}
		}
		System.out.println(pos+" valores positivos");
		
		in.close();
	}
}
