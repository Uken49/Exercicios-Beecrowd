
public class SequenciaIJ1 { //Main
	public static void main(String[] args) {
		final int TAM = 13;
		int I[], J[], i;

		I = new int[TAM];
		J = new int[TAM];
		
		I[0]=1;
		J[0]=60;
		for (i = 1; i < TAM; i++) {
			I[i]=(I[i-1]+3);
			J[i]=(J[i-1]-5);
		}
		
		for (i = 0; i < TAM; i++) {
			System.out.println("I="+I[i]+" J="+J[i]);
		}
	}
}
