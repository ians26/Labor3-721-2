import laden.Methoden;
import laden.Produkt;
import laden.Methoden.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produkt Apfel = new Produkt("Apfel",4.95,12);
        Produkt Brot = new Produkt("Brot", 3.40, 9);
        Produkt Kuchen = new Produkt("Kuchen", 120.25,25);
        List<Produkt> produktList = Arrays.asList(Apfel,Kuchen,Brot);

        Methoden M = new Methoden();
        System.out.println("Preise bevor Rabatt");
        for(Produkt p : produktList) {

            System.out.println(p.getPreis());
        }

        List<Produkt> rabattList = M.preisNachRabatt(produktList);
        System.out.println("Preise nach Rabatt");
        for(Produkt p : rabattList) {

            System.out.println(p.getPreis());
        }
        List<Produkt> teuereProdukte = M.preisGrosserAls100(produktList);
        System.out.println("Produke mit Preiser grosser als 100");
        for(Produkt p : teuereProdukte){

            System.out.println(p.getPreis());}
        Produkt teuerste = M.teursteProdukt(produktList);
            System.out.println("Teurster Produkt: ");
        System.out.println(teuerste.getPreis());
        Produkt gunstigste = M.gunstigsteProduke(produktList);
        System.out.println("Gunstigste Produkt: ");
        System.out.println(gunstigste.getZeit());

    }
}
