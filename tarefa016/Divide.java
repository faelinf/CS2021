
import java.util.Arrays;
import java.util.Scanner;

public class Divide {

    private static Scanner sc = new Scanner(System.in);

    public static int divide(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Voce esta tentando dividir por 0");
        }
        return dividendo / divisor;
    }

    public static void main(String args[]) {

        System.out.println("Digite o dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Digite o divisor: ");
        int divisor = sc.nextInt();

        try {
            System.out.println(divide(dividendo, divisor));
        } catch (Exception var) {
            System.out.println(var.getMessage() + Arrays.toString(var.getStackTrace()));
        }
    }

}