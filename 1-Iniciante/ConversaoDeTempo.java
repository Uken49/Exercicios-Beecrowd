import java.util.Scanner;
public class ConversaoDeTempo { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int seg,min=0,hrs=0;
		
		seg=in.nextInt();
		
		while(seg>=60){
			seg=seg-60;
			min++;
		}
		while(min>=60) {
			min=min-60;
			hrs++;
		}
		System.out.println(hrs+":"+min+":"+seg);
		in.close();
	}
}