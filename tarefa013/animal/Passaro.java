package animal;

public class Passaro extends Animal {

    public Passaro(String nome, int idade) {
        super(nome, idade, "som de passaro");
    }

    public void cantar() {
        System.out.println("cantando");
    }

}
