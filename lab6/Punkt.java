public class Punkt {
    double x,y;

    public Punkt() {
        x=0;
        y=0;
    }
    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    void zeruj(){
        x=0;
        y=0;
    }
    void opis(){
        System.out.println("Punkt o wspolrzednych: ["+x+";"+y+"]");
    }
    void przesun(double x, double y){
        this.x+=x;
        this.y+=y;
    }
}
