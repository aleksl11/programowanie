public abstract class Ryba implements Plywanie{
    @Override
    public void plyn() {
        System.out.println("Plynie");
    }

    @Override
    public void wynurz() {
        System.out.println("Wynurza sie");
    }

    @Override
    public void zanurz() {
        System.out.println("Zanurza sie");
    }

    public static void jedz(){
        System.out.println("Je");
    }
    public static void wydalaj(){
        System.out.println("Wydala");
    }
}
