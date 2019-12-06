package Oppgave4;

public class Main {

    public static void main(String[] args) {
        Spyd spyd1 = new Spyd("Roger", 'M', 90);
        Spyd spyd2 = new Spyd("Lise", 'K', 54);



        HundreMeter hun1 = new HundreMeter("Eli", 'K', 11.7);


        Resultat[] resultater = new Resultat[10];
        resultater[0] = spyd1;
        resultater[1] = hun1;

        Resultat best = null;
        int poeng = Integer.MIN_VALUE;
        for (int i = 0; i < resultater.length; i++) {
            if (resultater[i] == null) continue;
            if (resultater[i].poeng() > poeng) {
                best = resultater[i];
                poeng = best.poeng();
            }
        }
        System.out.println("Best resultat:");
        System.out.println(best.getNavn() + " " + best.poeng());

    }
}
