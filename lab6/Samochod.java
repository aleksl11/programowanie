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
        this.przebieg = przebieg;
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
