package Oppgave2;

public class Main {
    public static void main(String[] args) {
        Flåte flåte = new Flåte(10);
        Skip s1 = new Skip("The Satisfaction", "Morgan");
        Skip s2 = new Skip("The William", "Rockham", 40, 90, 2);
        s1.addPenger(500);
        s2.addPenger(2500);
        flåte.leggTil(s1);
        flåte.leggTil(s2);
        flåte.skrivOversikt();
        System.out.println("\n\n");

        s1.fordeling();
        System.out.println("\n\n");

        flåte.skrivOversikt();
        System.out.println("\n\n");
    }
}
