import java.util.Scanner;

public class Anterior {
   
    public static void main(String args[]) {
        
        Scanner adc = new Scanner( System.in );
        int number = adc.nextInt();
        System.out.println(number - 1);
        
        adc.close();

    }
}