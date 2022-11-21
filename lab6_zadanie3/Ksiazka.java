public class Ksiazka {
    String tytul, autor, wydawnictwo;
    int rokWydania;

    public Ksiazka(String tytul, String autor, String wydawnictwo, int rokWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.wydawnictwo = wydawnictwo;
        this.rokWydania = rokWydania;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public void opis(){
        System.out.println("Tytul ksiazki: "+tytul+
                            "\nAutor: "+autor+
                            "\nWydawnictwo: "+wydawnictwo+
                            "\nRok wydania: "+rokWydania);
    }
}
