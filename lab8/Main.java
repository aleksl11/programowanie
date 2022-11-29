import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.sqrt;
import static java.lang.Math.PI;

class BlednaWartoscSilni extends Exception{
    public BlednaWartoscSilni(String message) {
        super(message);
    }

}
class NieprawidlowyAdresException extends Exception{

}

public class Main {
    public static void main(String[] args) {
        //zadanie1();
        zadanie2();
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
            System.out.println("2! = "+silnia(2));
            System.out.println("-2! = "+silnia(-2));
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
    public static void zadanie3(){

    }
}
