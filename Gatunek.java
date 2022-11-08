public class Gatunek {
    String nazwaRodzaju, nazwaGatunku;
    int liczbaChromo2n;
    int liczbaChromoX;

    public Gatunek(String nazwaRodzaju, String nazwaGatunku, int liczbaChromo2n, int liczbaChromoX) {
        this.nazwaRodzaju = nazwaRodzaju;
        this.nazwaGatunku = nazwaGatunku;
        this.liczbaChromo2n = liczbaChromo2n;
        this.liczbaChromoX = liczbaChromoX;
    }

    public void pelnaNazwa(){
        System.out.println(nazwaRodzaju+" "+nazwaGatunku);
    }
    public void haploidalne(){
        System.out.println("Haploidalna liczba chromosomow: "+(liczbaChromo2n/2));
    }
    public void wypiszDane(){
        System.out.println("Rodzaj: "+nazwaRodzaju);
        System.out.println("Gatunek: "+nazwaGatunku);
        System.out.println("Liczba chromosomow: "+liczbaChromo2n);
        System.out.println("Liczba chromosomow x: "+liczbaChromoX);
    }
    public Gatunek kopiaGatunku(){
        Gatunek klon=new Gatunek(nazwaRodzaju,nazwaGatunku,liczbaChromo2n,liczbaChromoX);
        return klon;
    }
}
