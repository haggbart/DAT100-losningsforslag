public class Simulering {

    private int antall;
    private Terning[] terninger;
    private int[] stats = new int[6];
    private int first = -1;
    private int flest;
    private int sum = 0;
    private double gjennomsnitt = 0;

    public Simulering(int antall) {
        this.antall = antall;
        this.terninger = new Terning[antall];

        kastTerninger();
        beregnGjennomsnitt();
        finnFlest();
    }

    private void beregnGjennomsnitt() {
        gjennomsnitt = Math.round((int) ((sum / (double) antall) * 100)) / 100.0;
    }

    public int getAntall() {
        return antall;
    }

    public Terning[] getTerninger() {
        return terninger;
    }

    public int[] getStats() {
        return stats;
    }

    public double getGjennomsnitt() {
        return gjennomsnitt;
    }

    public int getFirst() {
        return first;
    }

    public int getFlest() {
        return flest;
    }

    private void kastTerninger() {
        int oyne;
        for (int i = 0; i < terninger.length; i++) {
            var terning = new Terning();
            terninger[i] = terning;
            oyne = terning.getOyne();
            stats[oyne-1] += 1;
            if (first < 0 && oyne == 6) {
                first = i+1;
            }
            sum += oyne;
        }
    }

    private void finnFlest() {
        int antall = 0;
        for (int i = 0; i < stats.length; i++) {
            int flest = stats[i];
            if (flest > antall) {
                antall = flest;
                this.flest = i+1;
            }
        }
    }

    public void printResult() {
        Utskrift.fullPrint(this);
    }

    @Override
    public String toString() {
        return Utskrift.terninger(this);
    }
}
