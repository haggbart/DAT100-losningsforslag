package Oppgave4;

import java.time.LocalDateTime;

public class Lop {
    private Loper[] lopere;
    int antall;

    public Lop(int maks) {
        lopere = new Loper[maks];
        antall = 0;
    }

    public void leggTil(Loper ny) {
        lopere[antall] = ny;
        antall++;
    }

    public void status() {
        int antallFerdig = 0;
        for (int i = 0; i < antall; i++) {
            if (lopere[i].erIMal()) antallFerdig++;
        }
        System.out.println("Antall løpere påmeldt: " + antall +
                "\nAntall i mål: " + antallFerdig +
                "\nAntall ikke startet / igjen i skogen: " + (antall - antallFerdig));
    }

    public Loper finn(int brikkeNr) {
        for (int i = 0; i < antall; i++) {
            if (lopere[i].getBrikkeNr() == brikkeNr) return lopere[i];
        }
        return null;
    }

    public Loper leder(String klasse) {
        Loper leder = null;
        int beste = Integer.MAX_VALUE;
        int aar = LocalDateTime.now().getYear();
        for (int i = 0; i < antall; i++) {
            if (lopere[i].getTid() == -1 || !lopere[i].klasse(aar).equals(klasse)) continue;
            if (lopere[i].getTid() < beste) leder = lopere[i];
        }
        return leder;
    }
}
