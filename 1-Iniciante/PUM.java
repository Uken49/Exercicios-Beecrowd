import java.util.*;
public class PUM { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int entrada,i,aux=0;
		
		entrada=in.nextInt();
		
		for(i=0;i<entrada;i++) {
			System.out.print(aux+1+" ");
			System.out.print(aux+2+" ");
			System.out.print(aux+3+" ");
			System.out.println("PUM");
			aux+=4;
		}
		in.close();
	}
}
