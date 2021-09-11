import java.util.Arrays;

public class AgendaTeste {
    public static void main(String args[]) {
        Agenda agenda = new Agenda();
        Contato primeiro = new Contato("Rafael", 909090, "rafael@teste.com");
        agenda.adicionaContato(primeiro);
        Contato segundo = new Contato("Joao", 898989, "joao@teste.com");
        agenda.adicionaContato(segundo);
        Contato terceiro = new Contato("Gilmar", 434343, "gilmar@teste.com");
        agenda.adicionaContato(terceiro);

        try {
            agenda.searchContato("Está incorreto");
        } catch (Exception e) {
            System.out.println(e.getMessage() + Arrays.toString(e.getStackTrace()));
        } finally {
            agenda.exclContato(primeiro);
            agenda.exclContato(segundo);
            agenda.exclContato(terceiro);
        }
    }
}
