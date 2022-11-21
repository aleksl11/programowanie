public class Main {
    public static void main(String[] args) {
        Podrecznik mat=new Podrecznik("MAT", "xyz","abc",2014,"matematyka");
        Ksiazka k1= (Podrecznik) mat;
        Powiesc p1=new Powiesc("Ama","Paul","dsa",2009,"detektywisytczna");
        Ksiazka k2= (Powiesc) p1;
        Ksiegarnia ksieg = new Ksiegarnia("las","ul. polna 20",1992);
        Klient kl1=new Klient(ksieg,"Ala","Nowak","ul. niebieska 14",19);
        Klient kl2=new Klient(ksieg,"Adam","Kowalski","ul. Sadowa 68",45);
        System.out.println("Klienci ksiegarni "+ksieg.nazwa+": ");
        kl1.opis();
        kl2.opis();
        System.out.println();
        System.out.println("Ksiazki:");
        k1.opis();
        k2.opis();
        System.out.println();
        System.out.println("Podręczniki:");
        mat.opis();
        System.out.println();
        System.out.println("Powiesci:");
        p1.opis();
    }
}
