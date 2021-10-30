import java.util.*;
public class ParesEntreCincoNumeros { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int n1,n2,n3,n4,n5,i=0;
		
		n1=in.nextInt();
		if (n1%2==0) {
			i++;
		}
		n2=in.nextInt();
		if (n2%2==0) {
			i++;
		}
		n3=in.nextInt();
		if (n3%2==0) {
			i++;
		}
		n4=in.nextInt();
		if (n4%2==0) {
			i++;
		}
		n5=in.nextInt();
		if (n5%2==0) {
			i++;
		}
		System.out.println(i+" valores pares");
		in.close();
	}
}
