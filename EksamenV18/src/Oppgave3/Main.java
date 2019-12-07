package Oppgave3;

public class Main {


    public static void main(String[] args) {
        boolean[] resDager = {
                false, true, true, false, false, false, false
        };

        UkesReservasjon res1 = nyReservasjon("Grøtta Graut", 'E', 12, resDager);

        System.out.println(res1);
    }

    public static UkesReservasjon nyReservasjon(String navn, char bygg, int nummer, boolean[] dager) {

        Person person = new Person(navn);
        Rom rom = new Rom(bygg, nummer);
        UkesReservasjon reservasjon = new UkesReservasjon(rom, person);
        reservasjon.setDager(dager);
        return reservasjon;
    }
}
