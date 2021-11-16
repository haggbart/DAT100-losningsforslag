package Oppgave4;

public class Dato {

    private int dag;
    private int mnd;
    private int aar;

    public Dato(int dag, int mnd, int aar) {
        this.dag = dag;
        this.mnd = mnd;
        this.aar = aar;
    }

    public boolean paaEllerEtter(Dato dato) {
        if (aar < dato.aar) return false;
        if (mnd < dato.mnd) return false;
        return dag >= dato.dag;
    }

    public boolean paaEllerFoer(Dato dato) {
        if (aar > dato.aar) return false;
        if (mnd > dato.mnd) return false;
        return dag <= dato.dag;
    }

}
