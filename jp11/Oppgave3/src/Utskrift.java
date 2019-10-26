final class Utskrift {

    private Utskrift() {
    }

    public static void fullPrint(Simulering sim) {

        String out = "TERNINGKASTSIMULATOR\n" + terninger(sim) + "\n" +
                antall(sim) + "\n" +
                gjennomsnitt(sim) + "\n\n" +
                first(sim) + "\n\n" +
                flest(sim);
        System.out.println(out);
    }

    public static String flest(Simulering sim) {
        return "Terningverdien det var flest av: " + Terning.getSymbol(sim.getFlest());
    }

    public static String first(Simulering sim) {

        int first = sim.getFirst();
        if (first < 0) return "Ingen seksere funnet.";
        return "Antall kast for å få den første " + Terning.getSymbol(6) + "-eren: " + sim.getFirst();
    }

    public static String gjennomsnitt(Simulering sim) {
        return "Gjennomsnittskast: " + sim.getGjennomsnitt();
    }

    public static String terninger(Simulering sim) {
        var sb = new StringBuilder();
        var terninger = sim.getTerninger();


        for (int i = 0; i < terninger.length; i++) {
            if (i % 10 == 0) sb.append("\n");
            sb.append(terninger[i].toString()).append(" ");
        }

        return sb.append("\n").toString();
    }

    public static String antall(Simulering sim) {
        var sb = new StringBuilder("Antall kast:\t" + sim.getAntall() + "\n");
        int[] stats = sim.getStats();

        for (int i = 0; i < stats.length; i++) {
            sb.append("Antall ").append(i+1).append("-ere:\t").append(stats[i]).append("\n");
        }

        return sb.toString();
    }
}
