import java.util.*;

public class SomaDeImparesConsecutivosI { //Main
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2, somaImpar = 0, i,menor,maior;

		n1 = in.nextInt();
		n2 = in.nextInt();
		
		if (n1>n2) {
			maior=n1;
			menor=n2;
		}else {
			maior=n2;
			menor=n1;
		}

		for (i = menor+1; i < maior; i++) {
			if(i%2!=0) {
				somaImpar+=i;
			}
		}

		System.out.println(somaImpar);
		in.close();
	}
}
