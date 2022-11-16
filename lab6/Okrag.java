public class Okrag extends Figura{
    Punkt srodek;
    double promien;

    public Okrag() {
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    public void setSrodek(Punkt srodek) {
        this.srodek = srodek;
    }

    public double getPowierzchnia(){
        return promien*promien* Math.PI;
    }
    public double getSrednica(){
        return 2*promien;
    }
    public void setPromien(double p){
        promien=p;
    }
    public double getPromien() {
        return promien;
    }
    public boolean wSrodku(Punkt a){
        double r;
        r=Math.sqrt(Math.pow((srodek.x-a.x),2)+Math.pow((srodek.y-a.y),2));
        if(r<=promien){
            return true;
        }
        else return false;
    }
    String opis(){
        return "Klasa Okrag. \nKolor obiektu: "+kolor
                +"\nSrodek: ["+srodek.getX()+";"+srodek.getY()+"]"
                +"\nPromien: "+promien;
    }
}
