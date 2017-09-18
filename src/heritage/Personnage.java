package heritage;

public class Personnage {
    private long pointsDeVie;

    public Personnage(long pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public long getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(long pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    @Override
    public String toString() {
        return "pointsDeVie=" + pointsDeVie ;
    }

    @Override
    public boolean equals(Object o) {
        Personnage personnage = (Personnage)o;
        return pointsDeVie == personnage.pointsDeVie;
    }


}
