import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Main
{
	public static void main(String[] arg)
	{
		z3();
		
	}
	public static void z1(){
		Samolot sm1=new Samolot();
		sm1.lec();
		Statek st1=new Statek();
		st1.plyn();
	}
	public static void z2(){
		Wieloryb w1=new Wieloryb();
		w1.zanurz();
		w1.plyn();
		w1.wynurz();
		w1.jedz();
		w1.wydalaj();
	}
	public static void z3() {
		Punkt a = new Punkt(2, 4);
		//Figura f1 = new Figura(a);
		//Figura f2 = new Figura("zielony");
		Prostokat p1 = new Prostokat(1, 3, "czerwony");
		Kwadrat k1 = new Kwadrat(2, "zolty");
		Trojkat t1 = new Trojkat(4, 5, "czarny");
		System.out.println(p1.opis());
		System.out.println(k1.getKolor());
		System.out.println(t1.opis()+"\n");
		Figura tablicaFigur[]=new Figura[10];
		tablicaFigur[0]=p1;
		tablicaFigur[1]=k1;
		tablicaFigur[2]=t1;
		Trojkat t2 = new Trojkat(2, 7, "fioletowyy");
		Trojkat t3 = new Trojkat(4, 3, "szary");
		Prostokat p2 = new Prostokat(2, 6, "rozowy");
		Prostokat p3 = new Prostokat(3, 4, "bialy");
		Prostokat p4 = new Prostokat(4, 1, "pomaranczowy");
		Kwadrat k2 = new Kwadrat(3, "zielony");

		tablicaFigur[3]=t2;
		tablicaFigur[4]=t3;
		tablicaFigur[5]=p1;
		tablicaFigur[6]=p2;
		tablicaFigur[7]=p3;
		tablicaFigur[8]=p4;
		tablicaFigur[9]=k2;
		for (Figura i: tablicaFigur) {
			System.out.println(i.opis());
		}
		for (Figura i: tablicaFigur) {
			i.skaluj(2);
		}
		List<IFigury> f = new LinkedList<>();
		f.add(k1);
		f.add(p1);
		f.add(t1);
		for (IFigury i:f) {
			System.out.println(i.getPowierzchnia());
			System.out.println(i.wPolu(a));
		}
		Okrag o = new Okrag(3,a);
		System.out.println(o.opis());
		o.przesun(1,2);
		System.out.println(o.opis());
	}
}