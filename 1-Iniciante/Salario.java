import java.util.*;

public class Salario { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b;
		double c;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextDouble();
		c = b * c;
		System.out.println("NUMBER = " + a);
		System.out.printf("SALARY = U$ %.2f%n",c,"\n");
		in.close();
	}
}
