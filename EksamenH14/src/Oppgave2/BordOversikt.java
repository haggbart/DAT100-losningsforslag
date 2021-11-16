package Oppgave2;

public class BordOversikt {
    private Bord[] bordene;

    public int antallLedige() {
        int antall = 0;
        for (Bord bord : bordene) {
            antall += bord.getAntall();
        }
        return antall;
    }

    public int finnFørsteLedige(int antall) {
        for (int i = 0; i < bordene.length; i++) {
            if (!bordene[i].isLedig() || bordene[i].getAntall() < antall) continue;
            return i;
        }
        return -1; // ingen ledig eller ingen bord passer
    }

    public int passerBest(int antall) {
        int delta = Integer.MAX_VALUE;
        int bord = -1;
        for (int b = 0; b < bordene.length; b++) {
            if (!bordene[b].isLedig() || bordene[b].getAntall() < antall) continue;
            if (bordene[b].getAntall() - antall < delta) {
                delta = bordene[b].getAntall() - antall;
                bord = b;
            }
        }
        return bord;
    }
}
