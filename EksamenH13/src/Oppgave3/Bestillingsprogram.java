package Oppgave3;

public class Bestillingsprogram {
    public static void main(String[] args) {

        // a)
        Bestilling bord1 = new Bestilling();

        bord1.leggTil(new Mat("Pizza", 300, 160));
        bord1.leggTil(new Drikke("CocaCola", 0.4, 36));
        bord1.leggTil(new Drikke("Vann", 0.6, 0));
        bord1.leggTil(new Mat("Spagetti", 150, 80));

        System.out.println(bord1);

        // b)
        /*
        [Bestilling] inneholder type servenhet
        [Servenhet] (String navn, int pris) -> Mat (int gram)
                                            -> Drikke (double liter)

         */
    }
}
