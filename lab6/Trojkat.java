class Trojkat extends Figura{
    double wys=0, podst=0;

    Trojkat(double wys, double podst)
    {
        this.wys = wys;
        this.podst = podst;
    }
    Trojkat(float wys,float podst,String kolor){
        super(kolor);
        this.wys = wys;
        this.podst = podst;
    }
    String opis(){
        return "Klasa Trojkat. \nKolor obiektu: "+kolor
                +"\nWysokosc: "+wys
                +"\nPodstawa: "+podst;
    }
}
