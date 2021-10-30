import java.util.Scanner;

public class OMaior { //Main

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c, maiorAB;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		maiorAB = (a + b + Math.abs(a - b)) / 2;

		if (c > maiorAB) {
			System.out.print(c + " eh o maior");
		} else {
			System.out.print(maiorAB + " eh o maior");
		}
		System.out.println();
		in.close();
	}
}