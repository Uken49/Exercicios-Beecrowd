import java.util.*;

public class SequenciaLogica2 { // Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, x, y, vetor[];

		do {
			x = in.nextInt();
		} while (x <= 1 || x >= 20);

		do {
			y = in.nextInt();
		} while (y <= x || y >= 100000);
		
		vetor= new int [y];
		
		for (i = 0; i < y; i++) {
			vetor[i]=i+1;
			if ((i+1)%x!=0) {
				System.out.print(vetor[i]+" ");
			}else {
				System.out.println(vetor[i]);
			}
		}
		in.close();
	}
}
