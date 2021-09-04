package animal;

import java.util.ArrayList;

public class Zoologico {
    ArrayList<Animal> gaiola = new ArrayList<>();

    public Zoologico() {
        for (int cont = 0; cont < 10; cont++) {
            if (cont % 3 == 0) {
                gaiola.add(new Passaro("Cavalo", cont));
            } else if (cont % 3 == 1) {
                gaiola.add(new Cobra("Cachorro", cont));
            } else {
                gaiola.add(new Gato("Preguica", cont));
            }
        }
    }

    public void arrayGaiola() {
        for (int cont = 0; cont < 10; cont++) {
            gaiola.get(cont).emiteSom();
            if ((gaiola.get(cont) instanceof Passaro)) {
                Passaro cobra = (Passaro) gaiola.get(cont);
                cobra.cantar();
            } else if ((gaiola.get(cont) instanceof Cobra)) {
                Cobra cachorro = (Cobra) gaiola.get(cont);
                cachorro.rastejar();
            }
        }
    }
}
