package animal;

import java.util.ArrayList;

public class ValidaAnimal {
    public static void main(String args[]) {

        Animal cobra = new Cobra("Pandora", 1);
        Animal passaro = new Passaro("Papagaio", 2);
        Animal gato = new Gato("Gato", 10);
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(cobra);
        animais.add(passaro);
        animais.add(gato);

        for (int cont = 0; cont < 3; cont++) {
            animais.get(cont).emiteSom();
        }
        Vet veterinario = new Vet();

        for (int contador = 0; contador < 3; contador++) {
            veterinario.analisar(animais.get(contador));
        }

        Zoologico zoologico = new Zoologico();
        zoologico.arrayGaiola();
    }
}
