import java.util.Scanner;

public class Saldo {

    public static void main(String args[]) {
        Scanner adc = new Scanner(System.in);
        double saldo = adc.nextDouble();
        saldo = saldo * 1.15;
        System.out.println(saldo);
        adc.close();
    }
}
