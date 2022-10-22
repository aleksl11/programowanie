import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Lab02 {
    public static void main(String[] args) {
//        rownanieKwadratowe();
//        funkcjaA();
//        funkcjaB();
//        funkcjaC();
//        porzadkowanie();
//        zadanie4();
//        zadanie5();
        zadanie6();
    }
    public static double input(){
        Scanner input=new Scanner(System.in);
        return input.nextDouble();
    }

    public static void rownanieKwadratowe(){
        System.out.println("Podaj a: ");
        double a = input();
        System.out.println("Podaj b: ");
        double b = input();
        System.out.println("Podaj c: ");
        double c = input();
        System.out.println(a+"x^2 + "+b+"x + "+c+" = 0");
        double x1,x2;
        double delta;
        if(a==0){
            if(b==0){
                if(c!=0)System.out.println("Brak rozwiazan");
                else System.out.println("Nieskonczenie wiele rozwiazan");
            }
            else{
                x1=-c/b;
                System.out.println("Jedno rozwiązanie: \n"+"x="+x1);
            }
        }
        else{
            delta=b*b-4*a*c;
            if(delta>0){
                x1=(-b-sqrt(delta))/(2*a);
                x2=(-b+sqrt(delta))/(2*a);
                System.out.println("Dwa rozwiązania: ");
                System.out.println("x1="+x1);
                System.out.println("x2="+x2);
            }
            else if (delta==0) {
                x1=(-b)/(2*a);
                System.out.println("Jedno rozwiązanie: \n"+"x="+x1);
            }
            else System.out.println("Brak rozwiazan");
        }
    }

    public static void funkcjaA(){
        System.out.println("Podaj liczbe:");
        double x=input();
        double a;
        if(x>0) a=2*x;
        else if (x==0) a=0;
        else a=-3*x;
        System.out.println("a(x)="+a);
    }
    public static void funkcjaB(){
        System.out.println("Podaj liczbe:");
        double x=input();
        double b;
        if(x>=1) b=x*x;
        else b=x;
        System.out.println("b(x)="+b);
    }
    public static void funkcjaC(){
        System.out.println("Podaj liczbe:");
        double x=input();
        double c;
        if(x>2)c=2+x;
        else if (x==2) c=8;
        else c=x-4;
        System.out.println("c(x)="+c);
    }

    public static void porzadkowanie(){
        System.out.println("Podaj x: ");
        double x = input();
        System.out.println("Podaj y: ");
        double y = input();
        System.out.println("Podaj z: ");
        double z = input();
        if(x>=y&&x>=z){
            if(y>z) System.out.println("x: "+x+"; y: "+y+"; z: "+z);
            else System.out.println("x: "+x+"; z: "+z+"; y: "+y);
        } else if (y>=x&&y>=z) {
            if(x>z) System.out.println("y: "+y+"; x: "+x+"; z: "+z);
            else System.out.println("y: "+y+"; z: "+z+"; x: "+x);
        }
        else{
            if(x>y) System.out.println("z: "+z+"; x: "+x+"; y: "+y);
            else System.out.println("z: "+z+"; y: "+y+"; x: "+x);
        }
    }

    public static void zadanie4(){
        String deszcz, autobus;
        Scanner input = new Scanner(System.in);
        System.out.println("Czy pada deszcz?(t/n) ");
        deszcz = input.nextLine();
        System.out.println("Czy autobus jest na przystanku?(t/n) ");
        autobus = input.nextLine();
        if(deszcz.equals("t")&&autobus.equals("t")){
            System.out.println("Wez parasol");
            System.out.println("Dostaniesz sie na uczelnie");
        }
        if(deszcz.equals("t")&&autobus.equals("n")){
            System.out.println("Nie dostaniesz sie na uczelnie");
        }
        if(deszcz.equals("n")&&autobus.equals("t")){
            System.out.println("Dostaniesz sie na uczelnie");
            System.out.println("Milego dnia i pieknej pogody");
        }
    }

    public static void zadanie5(){
        String znizka, premia;
        Scanner input = new Scanner(System.in);
        System.out.println("Czy jest znizka na samochod?(t/n) ");
        znizka = input.nextLine();
        System.out.println("Czy otrzymales premie?(t/n) ");
        premia = input.nextLine();
        if(znizka.equals("n")||premia.equals("t")){
            System.out.println("Mozesz kupic samochod!");
            System.out.println("Znizki na samochod nie ma");
        }
        if(znizka.equals("n")||premia.equals("n")){
            System.out.println("Zakup samochodu trzeba odlozyc na pozniej...");
            System.out.println("Znizki na samochod nie ma");
        }
        if(znizka.equals("t")||premia.equals("t")){
            System.out.println("Mozesz kupic samochod!");
            System.out.println("Znizki na samochod nie ma");
        }
    }
    public static void zadanie6(){
        int wybor;
        System.out.println("Wybierz dzialanie: ");
        System.out.println("1.Dodawanie");
        System.out.println("2.Odejmowanie");
        System.out.println("3.Mnozenie");
        System.out.println("4.Dzielenie");
        System.out.println("5.Reszta z dzielenia");
        Scanner input = new Scanner(System.in);
        wybor = input.nextInt();
        System.out.println("Podaj a: ");
        double a = input();
        System.out.println("Podaj b: ");
        double b = input();
        switch (wybor){
            case 1:
                System.out.println(a+"+"+b+"="+(a+b));
                break;
            case 2:
                System.out.println(a+"-"+b+"="+(a-b));
                break;
            case 3:
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case 4:
                if(b!=0) System.out.println(a+"/"+b+"="+(a/b));
                else System.out.println("Nie mozna dzielic przez 0");
                break;
            case 5:
                if(b!=0) System.out.println(a+"%"+b+"="+(a%b));
                else System.out.println("Nie mozna dzielic przez 0");
                break;
            default: System.out.println("Wprowadzono niepoprawny numer");
        }

    }
}