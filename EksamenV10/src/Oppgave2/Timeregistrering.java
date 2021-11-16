package Oppgave2;

public class Timeregistrering {

    private String dato;
    private Tidspunkt start;
    private Tidspunkt slutt;
    private String beskrivelse;

    public Timeregistrering(String dato, Tidspunkt start, Tidspunkt slutt, String beskrivelse) {
        this.dato = dato;
        if (start.somMinutter() > slutt.somMinutter()) {
            Tidspunkt temp = start;
            start = slutt;
            slutt = temp;
        }
        this.start = start;
        this.slutt = slutt;
        this.beskrivelse = beskrivelse;
    }

    public double beregnAntallTImer() {
        return slutt.somTimer() - start.somTimer();
    }

    public boolean overlapper(Timeregistrering other) {
        return slutt.somMinutter() > other.start.somMinutter();
    }

    public static String overskrift() {
        return "Dato\t\tStart\tSlutt\tTimer\tBeskrivelse";
    }

    @Override
    public String toString() {
        return dato + "\t" + start.toString() + "\t" + slutt.toString() + "\t" + String.format("%.02f", beregnAntallTImer()) + "\t" + beskrivelse;
    }

}
