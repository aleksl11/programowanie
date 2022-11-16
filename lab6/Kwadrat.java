class Kwadrat extends Prostokat{

    public Kwadrat(double wys, double szer) {
        super(wys, szer);
    }

    public Kwadrat(float wys, float szer, String kolor) {
        super(wys, szer, kolor);
    }
    public void setWys(double wys){
        this.wys=wys;
    }
    public void setSzer(double szer){
        this.szer=szer;
    }
    public double getWys(){
        return wys;
    }
    public double getSzer(){
        return szer;
    }
    public void setKolor(String kolor){
        this.kolor=kolor;
    }
    String opis(){
        return "Klasa Kwadrat. \nKolor obiektu: "+kolor
                +"\nWysokosc: "+wys
                +"\nSzerokosc: "+szer;
    }
}
