import java.util.*;
public class PositivosEMedia { //Main
	public static void main(String[] args) {
		double n1,n2,n3,n4,n5,n6,media=0;
		int i=0;
		Scanner in=new Scanner (System.in);
		
		n1=in.nextDouble();
		if (n1>=0) {
			i++;
			media+=n1;
		}
		n2=in.nextDouble();
		if (n2>=0) {
			i++;
			media+=n2;
		}
		n3=in.nextDouble();
		if (n3>=0) {
			i++;
			media+=n3;
		}
		n4=in.nextDouble();
		if (n4>=0) {
			i++;
			media+=n4;
		}
		n5=in.nextDouble();
		if (n5>=0) {
			i++;
			media+=n5;
		}
		n6=in.nextDouble();
		if (n6>=0) {
			i++;
			media+=n6;
		}
		media/=i;
		
		System.out.println(i+" valores positivos");
		System.out.printf("%.1f%n",media);
		in.close();
	}
}
