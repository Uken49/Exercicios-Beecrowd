import java.util.*;
public class RestoDaDivisao { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int maior,menor,aux;
		
		do {
			maior=in.nextInt();
		} while (maior<0);
		
		do {
			menor=in.nextInt();
			
		} while (menor<0);
		
		if(menor>maior){
			aux=maior;
			maior=menor;
			menor=aux;
		}
		aux=0;
		
		for (int i = menor+1; i < maior; i++) {
			
			aux=i%5;
			if (aux==2 || aux==3) {
				System.out.println(i);
			}
		}
		in.close();
	}
}
