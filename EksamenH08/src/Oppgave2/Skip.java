package Oppgave2;

public class Skip {
    private String navn;
    private String kaptein;
    private int kanoner;
    private int offiserer;
    private int mannskap;
    private double penger;

    public Skip(String navn, String kaptein, int kanoner, int mannskap, int offiserer) {
        this.navn = navn;
        this.kaptein = kaptein;
        this.kanoner = kanoner;
        this.offiserer = offiserer;
        this.mannskap = mannskap;
        penger = 0;
    }

    public Skip(String navn, String kaptein) {
        this.navn = navn;
        this.kaptein = kaptein;
        kanoner = 20;
        offiserer = 6;
        mannskap = 40;
    }

    public double getPenger() {
        return penger;
    }

    public void setPenger(double penger) {
        this.penger = penger;
    }

    public void addPenger(double penger) {
        this.penger += penger;
    }

    public String getNavn() {
        return navn;
    }

    public int getKanoner() {
        return kanoner;
    }

    public int getMannskap() {
        return mannskap;
    }

    public void fordeling() {
        double tilFordeling = penger * 0.75;
        penger = penger * 0.25;
        final double KAPTEINANDEL = 3/5.0;
        final double OFFISERANDEL = 2/5.0;
        final double MANNSKAPANDEL = 1/5.0;

        double tilKaptein = tilFordeling * KAPTEINANDEL;
        double tilOffiserer = tilFordeling * OFFISERANDEL;
        double tilMannskap = tilFordeling * MANNSKAPANDEL;


        System.out.printf("Fordeling for '%s' (mannskap %d):\n", navn, mannskap);
        System.out.printf("   %s: = %.0f\n", kaptein, tilKaptein);
        System.out.printf("   Øvrige offiserer: %d * %.0f = %.0f\n", offiserer, tilOffiserer/(double)offiserer, tilOffiserer);
        System.out.printf("   Øvrig mannskap: %d * %.0f = %.0f\n", mannskap, tilMannskap/(double)mannskap, tilMannskap);
        System.out.printf("Totalt utdelt: %.0f\n", tilFordeling);
        System.out.printf("Rest i kassen: %.0f\n", penger);
    }

    @Override
    public String toString() {
        return navn + " (" + kaptein + "): " + mannskap + ", " + kanoner + " kanoner, " + String.format("%.0f", penger) + " pieces of eight";
    }
}
