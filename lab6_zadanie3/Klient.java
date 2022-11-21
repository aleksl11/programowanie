public class Klient {
    Ksiegarnia ksiegarnia;
    String imie, nazwisko;
    String adres;
    int wiek;

    public Klient() {
    }

    public Klient(Ksiegarnia ksiegarnia, String imie, String nazwisko, String adres, int wiek) {
        this.ksiegarnia = ksiegarnia;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.wiek = wiek;
    }

    public Ksiegarnia getKsiegarnia() {
        return ksiegarnia;
    }

    public void setKsiegarnia(Ksiegarnia ksiegarnia) {
        this.ksiegarnia = ksiegarnia;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public void opis(){
        System.out.println("Imie i nazwisko: "+imie+" "+nazwisko+
                "\nWiek: "+wiek+
                "\nAders: "+adres);
    }
}
