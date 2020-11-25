package Warsztat;

import java.util.Random;

public class WarsztatDemo {
    public static void main(String[] args) {

        Opona opona1 = new Opona();
        Opona opona2 = new Opona();
        Opona opona3 = new Opona();
        Opona opona4 = new Opona();

        Opona[] opony ={opona1, opona2, opona3, opona4};

        Samochód samochód = new Samochód(opony);
        Warsztat warsztat = new Warsztat(samochód);

        samochód.złapGume();




    }

}

//W programie zrealizuj następujący scenariusz:
// Samochód ma koła, a ich opony mają ustalone ciśnienie i mogą być przebite.

// Warsztat może przyjmować samochód żeby go naprawić.
// W klasie WarsztatDemo stwórz samochód z czterema kołami oraz  warsztat.
// Następnie tworząc i wywołując odpowiednie metody zasymuluj następujące zdarzenia:
//samochód łapie gumę w losowym kole,
//warsztat przyjmuje samochód do naprawy,
//warsztat sprawdza stan kół i wymienia przebite opony,
//warsztat po wykonaniu usługi drukuje ile kół wymienił i ile będzie to kosztowało.