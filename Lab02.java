import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        String a="ala", b="Aleksandra", c="kajak", d="12321";
        System.out.println(czyPalindrom(a));
        System.out.println(czyPalindrom(b));
        System.out.println(czyPalindrom(c));
        System.out.println(czyPalindrom(d));
    }
    public static double input(){
        Scanner input=new Scanner(System.in);
        System.out.println("Podaj n:");
        double n=input.nextDouble();
        return n;
    }
    public static void Zadanie1(){
        double n = input();
        double pkt;
        int poczatek=0,koniec=40;
        double suma=0;
        double ilosc=0;
        if(n>0){

            while(n>0){
                System.out.println("Podaj lp. pkt (0-40): ");
                pkt=input();
                if(pkt>=poczatek&&pkt<=koniec) {
                    suma += pkt;
                    ilosc++;
                    n--;
                }
            }
            System.out.println("Ilosc uczniow: "+ilosc);
            System.out.println("Suma pkt="+suma);
            System.out.println("Srednia="+(suma/ilosc));
        }else System.out.println("grupa musi liczyc co najmniej 1go studenta");
    }

    public static void Zadanie2(){
        double sumad=0, sumau=0;
        double iled=0,ileu=0;
        double liczba;
        for (int i = 0; i <10; i++) {
            liczba=input();
            if(liczba>=0){
                sumad+=liczba;
                iled++;
            }
            else{
                sumau+=liczba;
                ileu++;
            }
        }
        System.out.println("Ilosc liczb dodatnich: "+iled);
        System.out.println("Suma liczb dodatnich:"+sumad);
        System.out.println("Ilosc liczb ujemnych: "+ileu);
        System.out.println("Suma liczb ujemnych:"+sumau);
    }
    public static void Zadanie3(){
        double n=input();
        double liczba, suma=0;
        if(n>0){
            for (int i = 0; i <n; i++) {
                liczba=input();
                if(liczba%2==0)
                    suma+=liczba;
            }
            System.out.println("Suma l parzystych:"+suma);
        }
        else
            System.out.println("Ciag musi miec co najmniej jedna liczbe");
    }
    public static void Zadanie4(){
        double n=input();
        int liczba, suma=0;
        Random rand=new Random();
        if(n>0){
            for (int i = 0; i <n; i++) {
                liczba= rand.nextInt(56)-10;
                if(liczba%2==0)
                    suma+=liczba;
            }
            System.out.println("Suma l parzystych:"+suma);
        }
        else
            System.out.println("Ciag musi miec co najmniej jedna liczbe");
    }

    //zadanie 5
    public static boolean czyPalindrom(String text) {
        int dlugosc = text.length() - 1;
        text.toLowerCase(Locale.ROOT);
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(dlugosc)) return false;
            dlugosc--;
        }
        return true;
    }
}

