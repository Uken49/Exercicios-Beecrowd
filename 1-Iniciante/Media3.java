import java.util.Scanner;

public class Media3 { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n1, n2, n3, n4, media, exame;

		n1 = in.nextDouble();
		n2 = in.nextDouble();
		n3 = in.nextDouble();
		n4 = in.nextDouble();

		media =  Math.floor((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
		System.out.printf("Media: %.1f%n", media);

		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		} else if (media < 5) {
			System.out.println("Aluno reprovado.");
		} else {
			System.out.println("Aluno em exame.");
			exame = in.nextDouble();
			System.out.printf("Nota do exame: %.1f%n", exame);
			media = (exame + media) / 2;
			if (media >= 5) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f%n", media);
		}
		in.close();
	}
}
