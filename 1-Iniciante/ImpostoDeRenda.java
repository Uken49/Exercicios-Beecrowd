import java.util.Scanner;

public class ImpostoDeRenda {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		
		double sal,imposto;
		
		sal=in.nextFloat();
		
		if (sal<=2000.00) {
			System.out.println("Isento");
			
		}else if(sal>=2001.01 && sal<=3000.00) {
			imposto=(sal- 2000) * 0.08;
	          System.out.printf("R$ %.2f\n", imposto);
			
		}else if(sal>=3000.01 && sal<=4500.00) {
			imposto=((sal- 3000)  * 0.18) + 80;
                System.out.printf("R$ %.2f\n", imposto);
                
		}else{
			imposto=((sal- 4500) * 0.28) + 350;
			System.out.printf("R$ %.2f\n",imposto);
		}
		in.close();
	}
}
