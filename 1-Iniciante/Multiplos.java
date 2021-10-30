import java.util.Scanner;

public class Multiplos {//Main

    public static void main(String[] args){
         int a, b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        if (b % a==0) {
        	System.out.println("Sao Multiplos");
        } else if (a % b == 0) {
        	System.out.println("Sao Multiplos");
        }else {
        	System.out.println("Nao sao Multiplos");
        }
            in.close();
    }

}