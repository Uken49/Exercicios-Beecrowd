import java.util.*;
public class Diferenca { //Main

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int A,B,C,D,DIFERENCA;
		A=in.nextInt();
		B=in.nextInt();
		C=in.nextInt();
		D=in.nextInt();
		
		DIFERENCA = (A*B-C*D);
		System.out.println("DIFERENCA = "+DIFERENCA);
		in.close();
	}

}
