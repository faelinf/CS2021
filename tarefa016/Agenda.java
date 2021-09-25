
import java.util.ArrayList;
import java.util.List;

public class Agenda {

    List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionaContato(Contato contato) {
        this.contatos.add(contato);
    }

    public void exclContato(Contato contato) {
        this.contatos.remove(contato);
    }

    public Contato searchContato(String nome) {

        Contato contato = null;

        for (int cont = 0; cont < this.contatos.size(); cont++) {
            if (this.contatos.get(cont).nome.equals(nome)) {
                contato = this.contatos.get(cont);
            }
        }

        if (contato == null) {
            throw new ContatoNaoEncontradoException();
        }
        return contato;

    }
}
