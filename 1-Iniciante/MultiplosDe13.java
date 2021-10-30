import java.util.*;

public class MultiplosDe13 { // Main
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int maior,menor,i,multiplo,aux;
		
		maior=in.nextInt();
		menor=in.nextInt();
		
		if(menor>maior){
			aux=maior;
			maior=menor;
			menor=aux;
		}
		aux=0;
		
		for(i=menor;i<=maior;i++) {
			multiplo=menor%13;
			if (multiplo!=0) {
				aux+=menor;
			}
			menor++;
		}
		System.out.println(aux);
		
		in.close();
	}
}
