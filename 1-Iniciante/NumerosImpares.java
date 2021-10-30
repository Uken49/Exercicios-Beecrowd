import java.util.*;
public class NumerosImpares { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int entrada,i;
		
		entrada=in.nextInt();
			
		for(i=1;i<=entrada;i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
		in.close();
	}
}
