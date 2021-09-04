package animal;

public class Cobra extends Animal {

    public Cobra(String nome, int idade) {
        super(nome, idade, "chaqualha");
    }

    public void rastejar() {
        System.out.println("rasteja");
    }
}
