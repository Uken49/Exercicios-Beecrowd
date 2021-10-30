import java.util.*;
public class SenhaFixa { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int senha;
		
		do {
			senha=in.nextInt();
			if (senha!=2002) {
				System.out.println("Senha Invalida");
			}else {
				System.out.println("Acesso Permitido");
			}
		} while (senha!=2002);
		
		in.close();
	}
}
