import java.util.Locale;
import java.util.Scanner;

class Idade{
public static void main(String[] args) {
 Locale.setDefault(Locale.US);
 Scanner sc = new Scanner(System.in);

 int ano, mes, dias, totDias,mesX,anoX;

 System.out.println("Adicione o ano que nasceu: ");
 ano = sc.nextInt();
 System.out.println("Adicione o mês que nasceu: ");
 mes = sc.nextInt();
 System.out.println("Adicione o dia que nasceu: ");
 dias = sc.nextInt();

 anoX = ano * 365;
 mesX = mes * 30;
 totDias = anoX + mesX + dias;

 System.out.println(ano+" anos, "+mes+" meses e " +dias+ " dias = "+ totDias +" dias.");

 sc.close();

}

}