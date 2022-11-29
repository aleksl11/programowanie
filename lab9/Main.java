import java.util.*;

class Uczestnicy {
    int ID,wiek;
    String imie;

    public Uczestnicy(int ID, int wiek, String imie) {
        this.ID = ID;
        this.wiek = wiek;
        this.imie = imie;
    }
    @Override
    public String toString(){
        return("ID uczestnika: "+ID+
                        "\nWiek: "+wiek+
                        "\nImie: "+imie);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Uczestnicy)) return false;
        Uczestnicy that = (Uczestnicy) o;
        return ID == that.ID && wiek == that.wiek && imie.equals(that.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, wiek, imie);
    }
}

public class Main {
    public static void main(String[] args) {
        zadanie1();
    }
    public static void zadanie1(){
        List<Uczestnicy> u = new ArrayList<>();
        Uczestnicy u1= new Uczestnicy(1,19,"Adam");
        Uczestnicy u2= new Uczestnicy(2,17,"Ala");
        Uczestnicy u3= new Uczestnicy(3,16,"Jan");
        Uczestnicy u4= new Uczestnicy(4,20,"Ewa");

        u.add(u1);
        u.add(u2);
        u.add(u3);
        u.add(u4);
        u.add(u2);
        u.add(new Uczestnicy(5,18,"Kamil"));
        u.add(new Uczestnicy(6,19,"Piotr"));

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
}
