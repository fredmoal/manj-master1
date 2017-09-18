package tableaux;

public class TestLivre {
    public static void main(String [] args) {
        Livre [] tabLivres = new Livre[3];
        tabLivres[0] = new Livre("The Grapes of Java","bob");
        tabLivres[1] = new Livre("The Java Gatsby", "sue");
        tabLivres[2] = new Livre("The Java Cookbook","ian");
        for(Livre livre : tabLivres) {
            System.out.println(livre);
        }

    }
}
