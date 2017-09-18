package heritage;

public class DemoTroll {

    public static void main(String... args) {
        Troll troll = new Troll("grumpppff");
        Personnage personnage = new Troll("aaaarrgghhh");

        System.out.println(troll);
        System.out.println(personnage);

        troll.gueuler();
        if (personnage instanceof Troll) {
            ((Troll)personnage).gueuler();
        } else {
            System.out.println("c'est pas un troll !");
        }

        Object o1 = personnage;
        Object o2 = troll;

        System.out.println(o1.equals(o2));


        Geulard geulard = troll;

        geulard.gueuler();
        // ERREUR : Troll troll1 = new Personnage(78);
    }
}
