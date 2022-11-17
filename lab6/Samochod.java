public class Samochod {
    String marka, model, nadwozie, kolor;
    int rokProdukcji;
    double przebieg;//>=0

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, double przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        if(przebieg>=0)
            this.przebieg = przebieg;

    }

    public void setPrzebieg(double przebieg) {
        if(przebieg>=0)
            this.przebieg = przebieg;
        else System.out.println("Przebieg musi byc wartoscia dodatnia.");
    }
    
    public void informacje(){
        System.out.println("Marka: "+marka+
                        "\nModel: "+model+
                        "\nNadwozie: "+nadwozie+
                        "\nKolor: "+kolor+
                        "\nRok produkcji: "+rokProdukcji+
                        "\nPrzebieg: "+przebieg);
    }
}
