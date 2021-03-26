package ui;

import domain.Auto;
import domain.Fiets;

public class VoertuigApp {
    public static void main(String[] args) {
        Auto auto = new Auto("auto", 4, 5, "Diesel");
        Fiets fiets = new Fiets("fiets", 2, 1, true);

        System.out.println(auto.start());
        System.out.println(auto.alert());
        System.out.println(auto.crash());

        System.out.println("");

        System.out.println(fiets.start());
        System.out.println(fiets.alert());
        System.out.println(fiets.stop());

    }
}
