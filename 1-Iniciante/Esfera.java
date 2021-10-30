import java.util.*;

public class Esfera { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double R, VOLUME, pi = 3.14159;

		R = in.nextDouble();

		VOLUME = (4 / 3.0) * pi * (R * R * R);
		System.out.printf("VOLUME = %.3f%n", VOLUME,"\n");
		in.close();
	}
}
