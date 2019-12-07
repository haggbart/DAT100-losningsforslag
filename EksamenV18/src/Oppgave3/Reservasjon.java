package Oppgave3;

public class Reservasjon {
    private Rom rom;
    private Person person;

    public Reservasjon(Rom rom, Person person) {
        this.rom = rom;
        this.person = person;
    }

    @Override
    public String toString() {
        return person.toString() + " " + rom.toString();
    }
}
