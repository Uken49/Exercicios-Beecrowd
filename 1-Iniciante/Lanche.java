import java.util.Scanner;
public class Lanche { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int id,quantidade;
		double valor=0;
		
		id=in.nextInt();
		quantidade=in.nextInt();
		
		if (id==1) {
			valor=4.00*quantidade;
		}else if (id==2) {
			valor=4.50*quantidade;
		}else if (id==3) {
			valor=5.00*quantidade;
		}else if (id==4) {
			valor=2.00*quantidade;
		}else if (id==5) {
			valor=1.50*quantidade;
		}
		System.out.printf("Total: R$ %.2f%n",valor);
		in.close();
	}
}
