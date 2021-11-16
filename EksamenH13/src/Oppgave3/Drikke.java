package Oppgave3;

public class Drikke extends Servenhet {

    private double liter;

    public Drikke(String navn, double liter, int pris) {
        super(navn, pris);
        this.liter = liter;
    }

    public double getLiter() {
        return liter;
    }

    public void setLiter(double liter) {
        this.liter = liter;
    }

    @Override
    public String toString() {
        return getNavn() + ", " + liter + " liter, " + getPris() + " kr. ";
    }
}
