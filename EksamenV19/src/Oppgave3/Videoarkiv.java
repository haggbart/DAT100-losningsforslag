package Oppgave3;

public class Videoarkiv {

    private Video[] videoer;
    private int antall;

    public Videoarkiv(int maksAntall) {
        videoer = new Video[maksAntall];
        antall = 0;
    }

    public void leggTil(Video video) {
        if (antall < antall) {
            videoer[antall] = video;
            antall++;
            return;
        }
        System.out.println("Feil: Videoarkivet er fullt.");
    }

    public void slett(String tittel) {

        for (int i = 0; i < antall; i++) {
            if (videoer[i].getTittel().equals(tittel)) {

                videoer[i] = videoer[antall-1];
                videoer[antall-1] = null;
                antall--;
                return;
            }
        }
        System.out.println("Fant ikke " + tittel + ".");
    }


    public int finnTotalTid() {
        int totalTid = 0;

        for (int i = 0; i < antall; i++) {
            totalTid += videoer[i].getSekunder();
        }
        return totalTid;
    }

    public void listAlle(String produsent) {
        System.out.println("Videoer laget av " + produsent + "\n" +
                "--------------------");
        int antall = 0;

        for (int i = 0; i < this.antall; i++) {
            if (videoer[i].getProdusent().equals(produsent)) {
                System.out.println(videoer[i].getTittel());
                antall++;
            }
        }
        System.out.println("Antall videoer knyttet til " + produsent + ": " + antall);
    }

    /* void bestePar(int tidsgrense)
    Objektmetode som finner og skriver ut de to videoene som passer best innenfor en tidsgrense.
Det betyr at summen av lengdene på de to videoene skal være så stor som mulig, men ikke over
tidsgrensen. Metoden skal også gi en fornuftig utskrift om det ikke finnes et par med samlet tid
innenfor grensen.
     */

    public void bestePar(int tidsgrense) {
        int delta = Integer.MAX_VALUE;
        int currentDelta;
        int sum = 0;
        Video film1 = null;
        Video film2 = null;

        for (int i = 0; i < antall; i++) {
            for (int j = 0; j < antall; j++) {
                sum = videoer[i].getSekunder() + videoer[j].getSekunder();
                if (sum <= tidsgrense) {
                    currentDelta = tidsgrense - sum;

                    if (currentDelta < delta) {
                        delta = currentDelta;
                        film1 = videoer[i];
                        film2 = videoer[j];
                    }
                }
            }
        }

        if (film1 == null || film2 == null) {
            System.out.println("Fant ingen par som passer innenfor tidsgrensen.");
            return;
        }

        System.out.println("Beste par (Totaltid: " + ((film1.getSekunder() + film2.getSekunder()) /60) + " minutter)");
        System.out.println("-----------------");
        System.out.println(film1);
        System.out.println(film2);

        System.out.println(film1.getTittel() + " og " + film2.getTittel() + " passer best.");
    }
}
