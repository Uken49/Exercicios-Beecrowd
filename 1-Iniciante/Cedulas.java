import java.util.Scanner;

//Me fez pensar bastante
public class Cedulas { // Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, cem = 0, cinquenta = 0, vinte = 0, dez = 0, cinco = 0, dois = 0, um = 0;
		do {
			n = in.nextInt();

		} while (n < 0 && 1000000 > n);
		System.out.println(n);

		while (n >= 100) {
			n = n - 100;
			cem++;
		}
		while (n >= 50) {
			n = n - 50;
			cinquenta++;
		}
		while (n >= 20) {
			n = n - 20;
			vinte++;
		}
		while (n >= 10) {
			n = n - 10;
			dez++;
		}
		while (n >= 5) {
			n = n - 5;
			cinco++;
		}
		while (n >= 2) {
			n = n - 2;
			dois++;
		}
		while (n >= 1) {
			n = n - 1;
			um++;
		}
		System.out.println(cem + " nota(s) de R$ 100,00");
		System.out.println(cinquenta + " nota(s) de R$ 50,00");
		System.out.println(vinte + " nota(s) de R$ 20,00");
		System.out.println(dez + " nota(s) de R$ 10,00");
		System.out.println(cinco + " nota(s) de R$ 5,00");
		System.out.println(dois + " nota(s) de R$ 2,00");
		System.out.println(um + " nota(s) de R$ 1,00");
		in.close();
	}
}