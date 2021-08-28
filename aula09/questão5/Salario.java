import java.util.Scanner;
public class Salario {
    public static void main(String args[]) {
        
        Scanner adc = new Scanner( System.in );
        double salario = adc.nextDouble();
        double Sminimo = adc.nextDouble();
        double salariosMinimos = salario / Sminimo;
        System.out.println(salariosMinimos);
        
        adc.close();

    }
}
