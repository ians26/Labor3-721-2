package laden;

public class Produkt {
    public String name;
    public double preis;
    public int zeit;

    public Produkt(String name, double preis, int zeit) {
        this.name = name;
        this.preis = preis;
        this.zeit = zeit;
    }

    public Produkt() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getZeit() {
        return zeit;
    }

    public void setZeit(int zeit) {
        this.zeit = zeit;
    }

    public double rundePreis(double prodpreis){
        return Math.round(prodpreis * 20.0) / 20.0;
    }

    public Produkt rabatt(Produkt prod){
        prod.setPreis(rundePreis(prod.getPreis()));
        Produkt newProd = new Produkt();
        if(prod.getZeit() >= 10 && prod.getZeit() < 20){
            double newPreis = prod.getPreis();
            newPreis = newPreis*0.9;
            newProd.setName(prod.getName());
            newProd.setZeit(prod.getZeit());
            newProd.setPreis(newPreis);
            return newProd;
        } else if (prod.getZeit() >= 20) {
            double newPreis = prod.getPreis();
            newPreis = newPreis*0.8;
            newProd.setName(prod.getName());
            newProd.setZeit(prod.getZeit());
            newProd.setPreis(newPreis);
            return newProd;
        }
        return prod;
    }
}
