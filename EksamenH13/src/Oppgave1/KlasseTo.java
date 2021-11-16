package Oppgave1;

public class KlasseTo extends KlasseEn {
    public double tall() {
        double d = super.tall() + 2;
        return d;
    }

    public String toString() {
        return (tall() + " ");
    }
}
