import java.util.Scanner;
public class ValidacaoDeNota { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double nota1,nota2,media;
		
		do {
			nota1=in.nextDouble();
			if (nota1<0 || nota1>10) {
				System.out.println("nota invalida");
			}
		} while (nota1<0 || nota1>10);
		
		do {
			nota2=in.nextDouble();
			if (nota2<0 || nota2>10) {
				System.out.println("nota invalida");
			}
		} while (nota2<0 || nota2>10);
		
		media=(nota1+nota2)/2;
		
		System.out.printf("media = %.2f%n",media);
		
		in.close();
	}
}
