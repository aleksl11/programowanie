public class Powiesc extends Ksiazka{
    String gatunek;

    public Powiesc(String tytul, String autor, String wydawnictwo, int rokWydania, String gatunek) {
        super(tytul, autor, wydawnictwo, rokWydania);
        this.gatunek = gatunek;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public void opis(){
        System.out.println("Tytul powiesci: "+tytul+
                "\nAutor: "+autor+
                "\nGatunek: "+gatunek+
                "\nWydawnictwo: "+wydawnictwo+
                "\nRok wydania: "+rokWydania);
    }
}
