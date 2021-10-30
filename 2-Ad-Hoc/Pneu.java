import java.util.*;
public class Pneu { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int presDesj,presLida,difPres;
		
		do {
			presDesj=in.nextInt();
		} while (presDesj<1 || presDesj>40);
		
		do {
			presLida=in.nextInt();
		} while (presDesj<1 || presDesj>40);
		
		difPres=presDesj-presLida;
		
		System.out.println(difPres);
		in.close();
	}
}
