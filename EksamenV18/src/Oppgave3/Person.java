package Oppgave3;

public class Person {
    private String navn;

    public Person(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return navn;
    }
}
