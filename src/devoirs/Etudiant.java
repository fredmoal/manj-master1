package devoirs;

import devoirs.erreurs.MonChienAMangeMonOrdiException;

public class Etudiant {
    private boolean modePipo;

    public boolean isModePipo() {
        return modePipo;
    }

    public void setModePipo(boolean modePipo) {
        this.modePipo = modePipo;
    }

    public Devoir rendreDevoir() throws MonChienAMangeMonOrdiException {
        if (modePipo) {
            throw new MonChienAMangeMonOrdiException();
        }
        return new Devoir();
    }

}
