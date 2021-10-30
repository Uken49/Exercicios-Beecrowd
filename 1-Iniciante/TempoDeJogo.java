import java.util.Scanner;
public class TempoDeJogo { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int inicio,fim,duracao;
		
		inicio=in.nextInt();
		fim=in.nextInt();
		
		if (inicio>=fim) { //16 26  
			fim=fim+24;
			duracao=fim-inicio;
		}else {
			duracao=fim-inicio;  //14
		}
		System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
		in.close();
	}
}
