package Oppgave4;

public class Spyd extends Resultat {
    private double lengde;

    public Spyd(String navn, char kjonn, double lengde) {
        super(navn, kjonn);
        this.lengde = lengde;
    }

    @Override
    public int poeng() {
        double delta = 0;
        int poeng = 1000;
        switch (getKjonn()) {
            case 'M':
                delta = lengde - 77.20;
                break;
            case 'K':
                delta = lengde - 60;
                break;
            default:
                System.out.println("Error: Ugyldig kjønn");
                return -1;
        }
        poeng += (int)(15 * delta);
        return poeng;
    }
}
