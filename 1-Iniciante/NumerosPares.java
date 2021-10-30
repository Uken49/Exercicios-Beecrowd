
public class NumerosPares {
	public static void main(String[] args) {
		int a[], i;
		a = new int[50];

		a[0]=2;
		System.out.println(a[0]);
		for (i = 1; i < 50; i++) {
			a[i] = a[i - 1] + 2;
			System.out.println(a[i]);
		}
	}
}
