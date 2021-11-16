package Oppgave3;

public class Bestilling {
    private Servenhet[] bestilte;
    private int antEnheter;

    public Bestilling() {
        bestilte = new Servenhet[100];
        antEnheter = 0;
    }

    public void leggTil(Servenhet enhet) {
        if (antEnheter < 100) {
            bestilte[antEnheter] = enhet;
            antEnheter++;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bestilt:\n*******************\n");
        for (int i = 0; i < antEnheter; i++) {
            sb.append(bestilte[i]).append("\n");
        }
        sb.append("*******************\nTotalt ").append(sum()).append(" kr.");
        return sb.toString();
    }

    private int sum() {
        int totsum = 0;
        for (int i = 0; i < antEnheter; i++) {
            totsum += bestilte[i].getPris();
        }
        return totsum;
    }
}
