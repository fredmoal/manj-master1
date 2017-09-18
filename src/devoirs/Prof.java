package devoirs;

import devoirs.erreurs.MonChienAMangeMonOrdiException;

import java.util.Random;

public class Prof {
    private Etudiant[] groupe;
    private double moyenne;

    public Prof() {
        groupe = new Etudiant[]{new Etudiant(), new Etudiant(), new Etudiant()};
        groupe[1].setModePipo(true);
    }

    public void ramasserDevoir() {
        int totalNotes = 0;
        for (Etudiant etudiant : groupe) {
            try {
                Devoir d = etudiant.rendreDevoir();
                noterDevoir(d);
                totalNotes += d.getNote();
            } catch (MonChienAMangeMonOrdiException e) {
                totalNotes += 0;
            }
            moyenne = (double)totalNotes / groupe.length;
        }
    }

    private void noterDevoir(Devoir d) {
        // méthode de notation en PASD :
        Random rand = new Random();
        int note = rand.nextInt(20);
        d.setNote(note);
    }

    public static void main(String... args) {
        Prof yohan = new Prof();
        yohan.ramasserDevoir();
        System.out.println(yohan.moyenne);
    }
}
