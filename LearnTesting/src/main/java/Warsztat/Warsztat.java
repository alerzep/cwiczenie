package Warsztat;

public class Warsztat {
    private Samochód[] samochód;

    public void naprawa(Samochód naprawionySamochód) {
        Opona[] naprawioneOpony = naprawionySamochód.getOpony();
        for (Opona.przegladana : naprawioneOpony){
            if (przegladana.isczyPrzebita(true)) {
                opona.setCisnienie(1200);
                opona.czyPrzebita(false);
            }
        }
    }
}

//warsztat przyjmuje samochód do naprawy,