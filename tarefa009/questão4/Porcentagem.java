package questão4;

import java.util.Scanner;

public class Porcentagem {

    public static void main(String args[]) {
        Scanner adc = new Scanner(System.in);
        String codPecaX = adc.next();
        double vlPecaX = adc.nextDouble();
        int qtpecasX = adc.nextInt();
        double ipi = adc.nextDouble();
        String codPecaZ = adc.next();
        double vlPecaZ = adc.nextDouble();
        int qtPecaZ = adc.nextInt();

        double Final = (vlPecaZ * qtPecaZ + vlPecaX * qtpecasX) * (ipi / 100 + 1);

        System.out.println("O codigo e valor da primeira peça : " + codPecaZ + " o codigo da segunda peça : " + codPecaX
                + " é: " + Final);

        adc.close();

    }
}
