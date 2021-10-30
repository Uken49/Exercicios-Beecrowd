import java.util.*;
public class Experiencias { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int i,qtdEntrada,qtdCobaia[];
		double percC=0,percR=0,percS=0,sapo=0,rato=0,coelho=0,totalCobaias=0;
		String animal[];
		
		
		qtdEntrada=in.nextInt();
		qtdCobaia=new int[qtdEntrada];
		animal=new String[qtdEntrada];
		
		for(i=0;i<qtdEntrada;i++) {
			do {	//Entrada- Quantidade de cobaia
				qtdCobaia[i]=in.nextInt();
			} while (qtdCobaia[i]<1 || qtdCobaia[i]>15);
			
			do {	//Entrada- Animal cobaia
				animal[i]=in.next();
			} while (! animal[i].equals("C") && ! animal[i].equals("R") && ! animal[i].equals("S"));
			
			if (animal[i].equals("C")) {	//Total de coelhos
				coelho+=qtdCobaia[i];
			}else if(animal[i].equals("R")) {	//Total de ratos
				rato+=qtdCobaia[i];
			}else {							//Total de sapos
				sapo+=qtdCobaia[i];
			}
			totalCobaias+=qtdCobaia[i];	//Total de cobaias
		}
		
		percC=(coelho*100)/totalCobaias;
		percS=(sapo*100)/totalCobaias;
		percR=(rato*100)/totalCobaias;
		
		System.out.printf("Total: %.0f cobaias%n",totalCobaias);
		System.out.printf("Total de coelhos: %.0f%n",coelho);
		System.out.printf("Total de ratos: %.0f%n",rato);
		System.out.printf("Total de sapos: %.0f%n",sapo);
		
		System.out.printf("Percentual de coelhos: %.2f",percC);
		System.out.println(" %");
		System.out.printf("Percentual de ratos: %.2f",percR);
		System.out.println(" %");
		System.out.printf("Percentual de sapos: %.2f",percS);
		System.out.println(" %");
		
		in.close();
	}

}
