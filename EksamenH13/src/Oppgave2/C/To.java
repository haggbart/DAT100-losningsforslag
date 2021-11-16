package Oppgave2.C;

public class To extends En {

    private int verdi;

    public To() {
        verdi = 0;
    }

    public To(int verdi) {
        this.verdi = verdi;
    }

    public int finnVerdi() {
        return verdi;
    }

    public int regnUt() {
        return verdi * 2;
    }

    public int beregn() { // denne metoden manglet
        return -1;
    }
}
