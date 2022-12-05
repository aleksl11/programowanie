import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

import static java.lang.Math.sqrt;
import static java.lang.Math.PI;

class BlednaWartoscSilni extends Exception{
    public BlednaWartoscSilni(String message) {
        super(message);
    }

}
class NieprawidlowyAdresException extends Exception {
    public NieprawidlowyAdresException(String message) {
        super(message);
    }
}
class Adres{
    String miasto,ulica,kodPocztowy;
    int nrDomu;

    public Adres(String miasto, String ulica, String kodPocztowy, int nrDomu) throws NieprawidlowyAdresException {
        if(miasto == null) throw new NieprawidlowyAdresException("Miasto nie moze byc nullem");
        this.miasto = miasto;
        if(ulica == null) throw new NieprawidlowyAdresException("Ulica nie moze byc nullem");
        this.ulica = ulica;
        if(kodPocztowy == null) throw new NieprawidlowyAdresException("Kod pocztowy nie moze byc nullem");
        this.kodPocztowy = kodPocztowy;
        if(nrDomu <= 0) throw new NieprawidlowyAdresException("Numer domu nie moze byc mniejszy lun rowny zero");
        this.nrDomu = nrDomu;
    }
}

public class Main {
    public static void main(String[] args) throws NieprawidlowyAdresException {
        //zadanie1();
        //zadanie2();
        zadanie3();
    }
    public static void zadanie1(){
        Scanner input= new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        double n=0;
        while (true){
            try{
                n=input.nextDouble();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Podaj poprawna liczbe!");
                input.next();
            }
        }
        if(n<0) {
            throw new IllegalArgumentException(String.format("pierwiastek kwadratowy z liczby %.4f nie istnieje",n));
        }
        System.out.println(String.format("pierwiastek z %.4f = %.4f",n,sqrt(n)));
    }
    public static void zadanie2(){
        try{
            System.out.println("-2! = "+silnia(-2));
            System.out.println("2! = "+silnia(2));
        }catch (BlednaWartoscSilni e){
            System.out.println("error: "+e.getMessage());
        }
    }

    public static int silnia(int n) throws BlednaWartoscSilni{
        if(n<0) throw new BlednaWartoscSilni("nie istnieje silnia z liczby ujemnej");
        int wynik=1;
        for(int i=2; i<=n;i++){
            wynik*=i;
        }
        return wynik;
    }
    public static void zadanie3() throws NieprawidlowyAdresException {
        Adres a1=new Adres("a","b","12-123",12);
        Adres a2=new Adres(null,"qw",null,-2);
        Adres a3=new Adres("asd",null,"zxc",0);
    }
}
