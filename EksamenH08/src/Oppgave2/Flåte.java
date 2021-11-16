package Oppgave2;

import java.util.Scanner;

public class Flåte {
    private Skip[] skip;
    private int antall;

    public Flåte(int maksAntall) {
        skip = new Skip[maksAntall];
    }

    public void leggTil(Skip s) {
        if (antall == skip.length) return;
        skip[antall] = s;
        antall++;
    }

    public Skip finnSkip(String s) {
        for (int i = 0; i < antall; i++) {
            if (skip[i].getNavn().equals(s)) {
                return skip[i];
            }
        }
        return null;
    }

    public void lesOppdatering() {
        Scanner input = new Scanner(System.in);
        int penger;
        for (int i = 0; i < antall; i++) {
            System.out.println("Penger " + skip[i].getNavn() + " har plyndret for: ");
            skip[i].addPenger(input.nextInt());
            input.nextLine();
        }
    }

    public void skrivOversikt() {
        int kanoner = 0;
        int mannskap = 0;
        int penger = 0;
        StringBuilder sb = new StringBuilder("Skip Kaptein Kanoner Mannskap Penger\n" +
                "------------------------------------------\n");
        for (int i = 0; i < antall; i++) {
            sb.append(skip[i]).append("\n");
            kanoner += skip[i].getKanoner();
            mannskap += skip[i].getMannskap();
            penger += skip[i].getPenger();
        }
        sb.append("TOTAL ").append(kanoner).append(" ").append(mannskap).append(" ").append(penger);
        System.out.println(sb);
    }
}
