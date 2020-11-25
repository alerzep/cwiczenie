package Warsztat;

import java.util.Random;

public class Samochód {
    private Opona[] opony;

    public Warsztat.Opona[] getOpony() {
        return opony;
    }

    public Samochód(Opona[] opony) {
        this.opony = opony;
    }


    public boolean złapGume(Opona) {
        Random random = new Random();
        int i = random.nextInt(4) - 1;
        Opona opona1 = Opona[i];
        opona1.setCzyPrzebite(true);
        opona1.setCisnienie(200);
    }
}
