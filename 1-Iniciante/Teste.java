import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Teste {
    public static void main(String[] args) {
        
        double f = 1.5884984484454;
        DecimalFormat deciFormat = new DecimalFormat();
        deciFormat.setMaximumFractionDigits(4);
        
        deciFormat.setRoundingMode(RoundingMode.DOWN);
        System.out.printf(deciFormat.format(f));
        
    }
}