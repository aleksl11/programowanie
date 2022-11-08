import static java.lang.Math.sqrt;

public class Prostokat {
    double dlugosc, szerokosc;

    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public Prostokat() {
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(double dlugosc) {
        this.dlugosc = dlugosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }
    public double pole(){
        return szerokosc*dlugosc;
    }
    public double obwod(){
        return 2*(szerokosc+dlugosc);
    }
    public double dlugoscPrzekotnej(){
        return sqrt(szerokosc*szerokosc+dlugosc*dlugosc);
    }
}
