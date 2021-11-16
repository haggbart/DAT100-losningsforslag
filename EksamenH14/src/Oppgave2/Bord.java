package Oppgave2;

public class Bord {
    private int antall; // plasser bordet har
    private boolean ledig;

    public Bord(int antall) {
        this.antall = antall;
        ledig = true;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public boolean isLedig() {
        return ledig;
    }

    public void setLedig(boolean ledig) {
        this.ledig = ledig;
    }
}
