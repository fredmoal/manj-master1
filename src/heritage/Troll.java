package heritage;

public class Troll extends Personnage implements Geulard {
    private static final long DEFAULT_PV_TROLL = 150L;
    private String criDeGuerre;

    public Troll(String criDeGuerre) {
        super(DEFAULT_PV_TROLL);
        this.criDeGuerre = criDeGuerre;
    }

    @Override
    public void gueuler() {
        System.out.println(criDeGuerre);
    }

    @Override
    public String toString() {
        return "Troll "+super.toString();
    }

}
