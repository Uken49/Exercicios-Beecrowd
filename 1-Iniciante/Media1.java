import java.util.*;

public class Media1 { // Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double A, B, MEDIA;
		A = in.nextDouble();
		B = in.nextDouble();
		MEDIA = (A * 3.5 + B * 7.5) / (3.5 + 7.5);
		System.out.printf("MEDIA = %.5f%n", MEDIA, "\n");
		in.close();
	}
}
