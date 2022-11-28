public class Okrag extends Figura implements RuchFigury{
    float r;
    public Okrag(float r,Punkt punkt) {
        super(punkt);
        this.r=r;
    }

    @Override
    String opis() {
        return "Okrag o promieniu "+r+" i srodku w punkcie ["+punkt.x+";"+punkt.y+"]";
    }

    @Override
    void skaluj(float skala) {
        r=r*skala;
    }

    @Override
    public void przesun(int x, int y) {
        punkt.x+=x;
        punkt.y+=y;
    }
}
