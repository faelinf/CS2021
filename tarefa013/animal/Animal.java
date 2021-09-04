package animal;

public class Animal {

    String nome;
    int sound;
    String idade;

    public Animal(String nome, int sound, String idade) {
        this.nome = nome;

        this.sound = sound;

        this.idade = idade;
    }

    public void emiteSom() {
        System.out.println(sound);
    }

}
