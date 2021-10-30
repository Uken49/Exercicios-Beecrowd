import java.util.*;

public class SequenciasCrescentes { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, i, sequencia = 0;

		for (i = 0; i < 1; i++) { //i=0   i=2
			sequencia = 0;
			x = in.nextInt();

			if (x != 0) {
				for (int j = 0; j < x; j++) {
					sequencia++;
					if (sequencia!=x) {
						System.out.print(sequencia+" ");
					}else {
						System.out.println(sequencia);
					}
					i--;
				}
			}
			if (x==0) {
				i=0;
			}
		}
		in.close();
	}
}
