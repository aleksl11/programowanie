public class Podrecznik extends Ksiazka{
    String przedmiot;

    public Podrecznik(String tytul, String autor, String wydawnictwo, int rokWydania, String przedmiot) {
        super(tytul, autor, wydawnictwo, rokWydania);
        this.przedmiot = przedmiot;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public void opis(){
        System.out.println("Tytul podrecznika: "+tytul+
                "\nAutor: "+autor+
                "\nPrzedmiot: "+przedmiot+
                "\nWydawnictwo: "+wydawnictwo+
                "\nRok wydania: "+rokWydania);
    }
}
