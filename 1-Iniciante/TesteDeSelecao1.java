import java.util.Scanner;
public class TesteDeSelecao1 { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		
		int A=in.nextInt(),
			B=in.nextInt(),
			C=in.nextInt(),
			D=in.nextInt();
		
		if (B>C && D>A && C+D>A+B && C>0 && D>0 && A%2==0) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores nao aceitos");
		}
		in.close();
	}
}
