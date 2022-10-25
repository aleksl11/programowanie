import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        zadanie7();
    }
    public static void Definicja(){
        double [] data;
        data = new double[30];
        double[] data1=new double[30];

        String[]slowa;
        slowa=new String[]{"ala","ma","kota"};

        int [] Liczby={1,2,3,5,6,7,8,9,-23,0};
        int []tab1=new int[10];
        tab1[0]=1;
        tab1[1]=23;
        tab1[2]=tab1[0]+2*tab1[1];

       /* System.out.println("element "+Liczby[0]);
        System.out.println(slowa[0]+" "+slowa[1]+" "+slowa[2]);
        String test="witaj";
        System.out.println("licza elementow: "+Liczby.length);
        System.out.println("liczba elementow w slowa: "+slowa.length); //ilosc elementow nie dlugosc slow
        System.out.println("liczba elementow w test: "+test.length());

        for (int i = 0; i < Liczby.length; i++) {
            System.out.print(Liczby[i]+", ");
        }
        System.out.println();
        for (int i: Liczby) {
            System.out.print(i+", ");
        }*/
        //dwuwymiarowe
        int [][]tabA = new int[3][4];
        int [][][]macierz3D = {
                {
                        {1,2,3},
                        {2,3,4}
                },
                {
                        {4,5,6},
                        {3,6,2,6,9,7}
                },
                {
                        {1,2,6,3,2,6,9,4,2,1,9,0},
                        {-12},
                        {123,4}
                }
        };//wypisywanie 3D
        for (int[][] array2D:macierz3D) {
            for (int[] array1D:array2D) {
                for (int i: array1D) {
                    System.out.print(i+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
        //wypisywanie 2D
        int [][]a ={
                {1,2,3},
                {1,2,3,4,5,6},
                {6,3,}
        };
        System.out.println("\n elementy tablicy 2d: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+", ");
            }
            System.out.println();
        }
        System.out.println("for each: ");
        for (int []innerArrayA:a) {
            for (int Data:innerArrayA) {
                System.out.print(Data+ "\t");
            }
            System.out.println();
        }
        int []tab2={1,2,3,45,6};
        int []tab3=new int[4];
        System.arraycopy(tab2,0, tab3,0,4 );
        System.out.println("tab 3 po skopiowaniu: "+ Arrays.toString(tab3));
    }
    public static void zadanie1(){ //for i
        double [] array=new double[10];
        double suma=0;
        for (int i = 0; i < array.length; i++) {
            array[i]=Losuj();
            suma+=array[i];
            System.out.print(array[i]+"\t");
        }
        System.out.println("\nSuma: "+suma+", srednia: "+(suma/ array.length));
    }
    public static void zadanie1_1(){ //for each
        double [] array=new double[10];
        double suma=0;
        for (double i: array) {
            i=Losuj();
            suma+=i;
            System.out.print(i+"\t");
        }
        System.out.println("\nSuma: "+suma+", srednia: "+(suma/ array.length));
    }
    public static double Losuj() {
        Random rand = new Random();
        double Liczba = rand.nextDouble(26) - 10; //-10,15
        return Liczba;
    }

    public static void zadanie2(){
        int []tab1={1,2,3,4,5,6};
        int []tab2={1,5,2,7,3,9,4,2,1};
        System.out.println("Tab1: ");
        for (int i = 0; i < tab1.length; i+=2) {
            System.out.print(tab1[i]+"\t");
        }
        System.out.println("\nTab2: ");
        for (int i = 0; i < tab2.length; i+=2) {
            System.out.print(tab2[i]+"\t");
        }
    }
    public static void zadanie3(){
        String []tab={"aBc","Qwerty","b","xZ"};
        for (String i: tab) {
            System.out.print(i.toUpperCase()+"\t");
        }
    }
    public static void zadanie4(){
        String []tab= new String[5];
        Scanner input = new Scanner(System.in);
        for(int i=0;i< tab.length;i++){
            tab[i] = input.nextLine();
        }
        for(int i=tab.length-1;i>=0;i--){
            String reverse = new StringBuffer(tab[i]).reverse().toString();
            System.out.println(reverse);
        }

    }
    public static void zadanie5(){
        int []tab= new int[8];
        Scanner input = new Scanner(System.in);
        for(int i=0;i< tab.length;i++){
            tab[i] = input.nextInt();
        }
        int t;
        for(int i = 0; i < tab.length - 1; i++) {
            for(int j = 0; j < tab.length - 1; j++) {
                if(tab[j] > tab[j + 1]) {
                    t=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=t;
                }
            }
        }
        for (int i: tab) {
            System.out.print(i+"\t");
        }
    }
    public static void zadanie6(){
        double []tab= new double[5];
        Scanner input = new Scanner(System.in);
        for(int i=0;i< tab.length;i++){
            tab[i] = input.nextDouble();
        }
        for (double i:tab) {
            if(i>=0)System.out.println(silnia(i));
            else System.out.println("Liczba ujemna, brak silni");
        }
    }
    public static double silnia(double x){
        if(x==0)return 1;
        else return silnia(x-1)*x;
    }
    public static void zadanie7(){
        String []tab1={"aBc","Qwerty","b","xZ"};
        String []tab2={"aBc","Qwerty","b","xZ"};
        boolean rowne=true;
        for(int i =0; i< tab1.length; i++) {
            if(tab1[i]!=tab2[i]){
                rowne=false;
                break;
            }
        }
        if(rowne==true)System.out.println("Sa rowne");
        else System.out.println("Nie sa rowne");
    }
}
