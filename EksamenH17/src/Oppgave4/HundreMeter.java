package Oppgave4;

public class HundreMeter extends Resultat {
    private double tid;

    public HundreMeter(String navn, char kjonn, double tid) {
        super(navn, kjonn);
        this.tid = tid;
    }

    @Override
    public int poeng() {
        double delta;
        int poeng = 1000;
        switch (getKjonn()) {
            case 'M':
                delta = 10.40 - tid;
                break;
            case 'K':
                delta = 11.6 - tid;
                break;
            default:
                System.out.println("Error: Ugyldig kjønn");
                return -1;
        }

        return poeng += (int)(240 * delta);

    }
}
