import java.util.Scanner;
public class IdadeEmDias { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int dia,mes=0,ano=0;
		
		dia=in.nextInt();
		
		while(dia >=365) {
			dia=dia-365;
			ano++;
		}
		
		while(dia>=30) {
			dia=dia-30;
			mes++;
		}
		System.out.println(ano+" ano(s)");
		System.out.println(mes+" mes(es)");
		System.out.println(dia+" dia(s)");
		in.close();
	}
}
