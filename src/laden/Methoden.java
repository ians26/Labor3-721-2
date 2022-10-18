package laden;

import java.util.*;

public class Methoden {
    public List<Produkt> preisNachRabatt(List<Produkt> liste){
        List<Produkt> newList = new ArrayList<>();
        for(Produkt p : liste){
            Produkt newProd = p.rabatt(p);
            newList.add(newProd);
        }
        return newList;
    }

    public List<Produkt> preisGrosserAls100(List<Produkt> liste){
        List<Produkt> newList = new ArrayList<>();
        for(Produkt p : liste){
            if(p.getPreis() > 100){
                newList.add(p);
            }
        }
        return newList;
    }

    public List<Produkt> sortByRabattPreis(List<Produkt> liste){
        List<Produkt> rabattList = preisNachRabatt(liste);
        rabattList.sort(Comparator.comparing(Produkt::getPreis));
        return rabattList;
    }

    public Produkt teursteProdukt(List<Produkt> liste){
        double teurPreis = 0;
        Produkt teuerProdukt = null;
        for(Produkt p : liste){
            if(p.getPreis()>teurPreis) {
                teurPreis = p.getPreis();
                teuerProdukt = p;
            }
        }
        return teuerProdukt;
    }

    public Produkt gunstigsteProduke(List<Produkt> liste){
        return liste.stream().min(Comparator.comparing(Produkt::getZeit)).orElseThrow(NoSuchElementException::new);
    }
}
