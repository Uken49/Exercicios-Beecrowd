import java.util.Scanner;

public class Animal { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String tipo1, tipo2, tipo3;

		tipo1 = in.next();
		tipo2 = in.next();
		tipo3 = in.next();
		
		//equalsIgnoreCase para comparar string
		
		//Vertebrados inicio
		if (tipo1.equals("vertebrado")&& tipo2.equals("ave") && tipo3.equals("carnivoro")) {
			System.out.println("aguia");
		}if (tipo1.equals("vertebrado") && tipo2.equals("ave") && tipo3.equals("onivoro")) {
			System.out.println("pomba");
		}if (tipo1.equals("vertebrado") && tipo2.equals("mamifero") && tipo3.equals("onivoro")) {
			System.out.println("homem");
		}if (tipo1.equals("vertebrado") && tipo2.equals("mamifero") && tipo3.equals("herbivoro")) {
			System.out.println("vaca");
		}
		//Vertebrados fim
		
		//Invertebrados inicio
		if (tipo1.equals("invertebrado") && tipo2.equals("inseto") && tipo3.equals("hematofago")) {
			System.out.println("pulga");
		}if (tipo1.equals("invertebrado") && tipo2.equals("inseto") && tipo3.equals("herbivoro")) {
			System.out.println("lagarta");
		}if (tipo1.equals("invertebrado") && tipo2.equals("anelideo") && tipo3.equals("hematofago")) {
			System.out.println("sanguessuga");
		}if (tipo1.equals("invertebrado") && tipo2.equals("anelideo") && tipo3.equals("onivoro")) {
			System.out.println("minhoca");
		}
		//Invertebrados fim
		
		in.close();
	}
}
