
public class Lab05{
    public static void main(String[] args) {
        zadanie3();
    }

    public static void zadanie1(){
        Prostokat p1= new Prostokat(4,3);
        System.out.println("Pole p1: "+p1.pole());
        System.out.println("Obwod p1: "+p1.obwod());
        System.out.println("Przekotna p1: "+p1.dlugoscPrzekotnej());
        Prostokat p2=new Prostokat();
        p2.setDlugosc(2.1);
        p2.setSzerokosc(5.2);
        System.out.println("Pole p2: "+p2.pole());
        System.out.println("Obwod p2: "+p2.obwod());
        System.out.println("Przekotna p2: "+p2.dlugoscPrzekotnej());
    }
    public static void zadanie2(){
        Budynek b1=new Budynek();
        b1.setNazwa("Dom");
        b1.setLiczbaPieter(1);
        b1.setRokBudowy(2006);
        Budynek b2=new Budynek("blok", 1993, 10);
        Budynek b3=new Budynek("kamienica", 1823, 4);
        b1.informacje();
        System.out.println("wiek budynku: "+b1.wiek());
        b2.informacje();
        System.out.println("wiek budynku: "+b2.wiek());
        b3.informacje();
        System.out.println("wiek budynku: "+b3.wiek());
    }
    public static void zadanie3(){
        Gatunek g1=new Gatunek("a","b",26, 2);
        Gatunek g2=new Gatunek("a","c",56, 2);
        Gatunek g3=new Gatunek("z","xz",16,1);
        Gatunek g4=g1.kopiaGatunku();
        g1.pelnaNazwa();
        g1.haploidalne();
        System.out.println();
        g2.wypiszDane();
        System.out.println();
        g3.wypiszDane();
        g3.haploidalne();
        System.out.println();
        g1.wypiszDane();
        g4.wypiszDane();
    }
}
