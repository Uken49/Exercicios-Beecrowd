import java.util.Scanner;
public class TempoDeJogoComMinutos { //Main
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int horaInicio,minutoInicio,horaFinal,minutoFinal,
		duracaoHora,duracaoMinuto;
		
		horaInicio=in.nextInt();
		minutoInicio=in.nextInt();
		horaFinal=in.nextInt();
		minutoFinal=in.nextInt();
		
		//Calculando as horas
		if (horaInicio>=horaFinal) {	
			duracaoHora=(horaFinal+24)-horaInicio;
		}else {
			duracaoHora=horaFinal-horaInicio;
		}
		//Calculando os minutos
		if (minutoInicio>=horaFinal) {	
			duracaoMinuto=(minutoFinal+60)-minutoInicio;
			duracaoHora--;
		}else {
			duracaoMinuto=minutoFinal-minutoInicio;
		}
		
		if (duracaoMinuto>=60) {  
			duracaoMinuto=duracaoMinuto-60;
			duracaoHora++;
		}
		if (duracaoHora==24 && duracaoMinuto>0) {
			duracaoHora=0;
		}
		
		System.out.println("O JOGO DUROU "+duracaoHora+" HORA(S) E "+duracaoMinuto+" MINUTO(S)");
		in.close();
	}
}
