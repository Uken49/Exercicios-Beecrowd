import java.util.Scanner;
public class AumentoDeSalario {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		double sal,novoSal;
		
		
		sal=in.nextDouble();
		
		if (sal<=400) {
			novoSal=sal+(sal*0.15);
			System.out.printf("Novo salario: %.2f%n",novoSal);
			System.out.printf("Reajuste ganho: %.2f%n",(sal*0.15));
			System.out.println("Em percentual: 15 %");
			
		}else if (sal>=400.01 && sal<=800) {
			novoSal=sal+(sal*0.12);
			System.out.printf("Novo salario: %.2f%n",novoSal);
			System.out.printf("Reajuste ganho: %.2f%n",(sal*0.12));
			System.out.println("Em percentual: 12 %");
			
		}else if (sal>=800.01 && sal<=1200) {
			novoSal=sal+(sal*0.10);
			System.out.printf("Novo salario: %.2f%n",novoSal);
			System.out.printf("Reajuste ganho: %.2f%n",(sal*0.10));
			System.out.println("Em percentual: 10 %");
			
		}else if (sal>=1200.01 && sal<=2000) {
			novoSal=sal+(sal*0.07);
			System.out.printf("Novo salario: %.2f%n",novoSal);
			System.out.printf("Reajuste ganho: %.2f%n",(sal*0.07));
			System.out.println("Em percentual: 7 %");
			
		}else {
			novoSal=sal+(sal*0.04);
			System.out.printf("Novo salario: %.2f%n",novoSal);
			System.out.printf("Reajuste ganho: %.2f%n",(sal*0.04));
			System.out.println("Em percentual: 4 %");
			
		}
		
	in.close();	
	}
}
