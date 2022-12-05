import java.util.*;

class Uczestnicy {
    int wiek;
    String imie;

    public Uczestnicy(int wiek, String imie) {

        this.wiek = wiek;
        this.imie = imie;
    }
    @Override
    public String toString(){
        return("Wiek: "+wiek+ "\nImie: "+imie);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Uczestnicy)) return false;
        Uczestnicy that = (Uczestnicy) o;
        return  wiek == that.wiek && imie.equals(that.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wiek, imie);
    }
}

public class Main {
    public static void main(String[] args) {
        //zadanie1();
        zadanie2();
        //zadanie3();
    }
    public static void zadanie1(){
        List<Uczestnicy> u = new ArrayList<>();
        Uczestnicy u1= new Uczestnicy(19,"Adam");
        Uczestnicy u2= new Uczestnicy(17,"Ala");
        Uczestnicy u3= new Uczestnicy(16,"Jan");
        Uczestnicy u4= new Uczestnicy(20,"Ewa");

        u.add(u1);
        u.add(u2);
        u.add(u3);
        u.add(u4);
        u.add(u2);
        u.add(new Uczestnicy(18,"Kamil"));
        u.add(new Uczestnicy(19,"Piotr"));

        System.out.println(u1.equals(u1));
        System.out.println(u1.equals(u2));
        System.out.println(u4.toString());
        System.out.println(u3.hashCode());
        System.out.println(u2.hashCode());
        for (Uczestnicy i: u) {
            if(i.wiek>=18)
                System.out.println(i);
        }

    }
    public static void zadanie2(){
        List<Uczestnicy> lista = new ArrayList<>();

        lista.add(new Uczestnicy(19,"Adam"));
        lista.add(new Uczestnicy(17,"Ala"));
        lista.add(new Uczestnicy(16,"Jan"));
        lista.add(new Uczestnicy(20,"Ewa"));
        lista.add(new Uczestnicy(18,"Kamil"));
        lista.add(new Uczestnicy(19,"Piotr"));
        List<Uczestnicy>podLista =lista.subList(1,4);
        lista.subList(1,4).clear();
        for (Uczestnicy i: lista) {
            if(i.wiek>=18)
                System.out.println(i);
        }

    }
    public static void zadanie3(){
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(3);
        l1.add(1);
        l1.add(7);
        l1.add(12);
        l1.add(9);
        l1.add(23);
        l1.add(5);
        l1.add(1);

        List<Integer> l2=new ArrayList<Integer>();

        ListIterator<Integer> integerListIterator=l1.listIterator(l1.size());
        while(integerListIterator.hasPrevious()){
            l2.add(integerListIterator.previous());
        }
        ListIterator<Integer> integerListIterator2=l2.listIterator();
        while (integerListIterator2.hasNext()){
            System.out.println(integerListIterator2.next());
        }
    }
}
