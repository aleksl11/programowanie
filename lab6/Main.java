public class Main {
    public static void main(String[] args) {
        zadanie2();
    }
    public static void zadanie1(){
        Punkt a=new Punkt();
        Punkt b=new Punkt(1,2);
        Punkt c=new Punkt(-1,3);
        a.setX(5);
        b.setY(a.getX());
        c.setY(-3);
        c.zeruj();
        b.przesun(2,2);
        a.opis();
        b.opis();
        c.opis();
        Okrag kolo=new Okrag();
        kolo.setPromien(4);
        kolo.setSrodek(c);
        System.out.println(kolo.wSrodku(c));
        System.out.println(kolo.wSrodku(a));
        Prostokat p1=new Prostokat(2,3,"zielony");
        //p1.punkt.setX(1);
        //p1.punkt.setY(3); //poprawic punkt
        //p1.przesun(3,5);
        Kwadrat k1=new Kwadrat(3,3);
        System.out.println(p1.opis());
        Trojkat t1=new Trojkat(1,3);
        t1.kolor="niebieski";
        System.out.println(t1.opis());
        System.out.println(kolo.opis());
    }
    public static void zadanie2(){
        Samochod s1=new Samochod("a","b","c","d",2014,1466);
        s1.informacje();
        SamochodOsobowy s2=new SamochodOsobowy("q","w","d","x",1999,2.1,3,2.1,5);
        s2.informacje();
    }
}
