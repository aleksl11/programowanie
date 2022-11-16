public class SamochodOsobowy extends Samochod {
    double waga; //2t-4.5t
    double pojemnosc; //0.8-3.0
    int iloscOsob;

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokProdukcji, double przebieg) {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
    }

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokProdukcji, double przebieg, double waga, double pojemnosc, int iloscOsob) {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
        this.waga = waga;
        this.pojemnosc = pojemnosc;
        this.iloscOsob = iloscOsob;
    }
    public void informacje(){
        System.out.println("Marka: "+marka+
                "\nModel: "+model+
                "\nNadwozie: "+nadwozie+
                "\nKolor: "+kolor+
                "\nRok produkcji: "+rokProdukcji+
                "\nPrzebieg: "+przebieg+
                "\nWaga: "+waga+"t"+
                "\nPojemnosc: "+pojemnosc+
                "\nIlosc osob: "+iloscOsob);
    }
}
