public class Ksiegarnia {
    String nazwa, adres;
    int rokOtworzenia;

    public Ksiegarnia(String nazwa, String adres, int rokOtworzenia) {
        this.nazwa = nazwa;
        this.adres = adres;
        this.rokOtworzenia = rokOtworzenia;
    }

    public Ksiegarnia() {
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getRokOtworzenia() {
        return rokOtworzenia;
    }

    public void setRokOtworzenia(int rokOtworzenia) {
        this.rokOtworzenia = rokOtworzenia;
    }
}
