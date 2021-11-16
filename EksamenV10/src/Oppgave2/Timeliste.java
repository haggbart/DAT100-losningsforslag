package Oppgave2;

public class Timeliste {
    private final int STORRELSE;

    private String ansattnavn;
    private int timelonn;
    private Timeregistrering[] timeliste;
    private int antall;

    public Timeliste(String ansattnavn, int timelonn) {
        this.ansattnavn = ansattnavn;
        this.timelonn = timelonn;
        STORRELSE = 100;
        timeliste = new Timeregistrering[STORRELSE];
        antall = 0;
    }

    public void leggTil(String dato, String start, String slutt, String beskrivelse) {
        if (STORRELSE == antall) return; // full
        Timeregistrering timereg = new Timeregistrering(dato, new Tidspunkt(start), new Tidspunkt(slutt), beskrivelse);
        timeliste[antall] = timereg;
        antall++;
    }

    public double beregnTimer() {
        double timer = 0;
        for (int i = 0; i < antall; i++) {
            timer += timeliste[i].beregnAntallTImer();
        }
        return timer;
    }

    public boolean inneholderOverlappinger() {
        for (int i = 0; i < antall; i++) {
            for (int j = 0; j < antall; j++) {
                if (i == j) continue;
                if (timeliste[i].overlapper(timeliste[j])) return true;
            }
        }
        return false;
    }

    public void skrivUt() {
        System.out.println("Timeliste for " + ansattnavn + "\n" +
        "Timelønn: kr " + timelonn + "\n\n" +
        Timeregistrering.overskrift());
        for (int i = 0; i < antall; i++) {
            System.out.println(timeliste[i]);
        }
        System.out.println();
        System.out.println("Totalt antall timer = " + beregnTimer());
        System.out.println("Total beregnet lønn = kr " + beregnTimer() * timelonn);
    }
}
