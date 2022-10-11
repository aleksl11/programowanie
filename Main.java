import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //System.out.println(getName());
        //System.out.println(getAge());

        Scanner in =new Scanner(System.in);
        System.out.println("Podaj a: ");
        int a=in.nextInt();
        System.out.println("Podaj b: ");
        int b=in.nextInt();
        //obl(a,b);
        //System.out.println("Liczba a jest parzysta: "+parzysta(a));
        //System.out.println(podzielnosc(a));
        //System.out.println(potega(a));
        //System.out.println(pierwiastek(a));

        Random rand = new Random();
        int x = rand.nextInt(b-a+1)+a;
        int y = rand.nextInt(b-a+1)+a;
        int z = rand.nextInt(b-a+1)+a;

        System.out.println(x+" "+y+" "+z);
        System.out.println(trojkat(x,y,z));

    }
    public static String getName(){
        return "Jan";
    }
    public static int getAge(){
        return 30;
    }
    public static void obl(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "*" + b + "=" + (a * b));
    }
    public static boolean parzysta(int a){
        if(a%2==0) return true;
        else return false;
    }
    public static boolean podzielnosc(int a){  //podzielnosc przez 3 i 5
        if(a%5==0&&a%3==0) return true;
        else return false;
    }
    public static double potega(int a){
        return pow(a,3);
    }
    public static double pierwiastek(int a){
        return sqrt(a);
    }
    public  static boolean trojkat(int a, int b, int c){
        if(a*a+b*b==c*c || a*a+c*c==b*b || c*c+b*b==a*a) return true;
        else return false;
    }
}