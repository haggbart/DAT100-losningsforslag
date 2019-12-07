package Oppgave3;

public class UkesReservasjon extends Reservasjon {
    private boolean[] dager;
    private static String[] dagerNavn = {
            "mandag",
            "tirsdag",
            "onsdag",
            "torsdag",
            "fredag",
            "lørdag",
            "søndag"
    };

    public UkesReservasjon(Rom rom, Person person) {
        super(rom, person);
        this.dager = new boolean[7];
    }


    public static String tilDag(int dag) {
        return dagerNavn[dag];
    }



    public void setDager(boolean[] dager) {
        this.dager = dager;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append("\n");
        for (int i = 0; i < dager.length; i++) {
            if (dager[i]) {
                sb.append(tilDag(i)).append(" ");
            }
        }
        return sb.toString();
    }
}
