package Oppgave4;

public abstract class Resultat {
    private String navn;
    private char kjonn;

    public Resultat(String navn, char kjonn) {
        this.navn = navn;
        this.kjonn = kjonn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public char getKjonn() {
        return kjonn;
    }

    public void setKjonn(char kjonn) {
        this.kjonn = kjonn;
    }


    public abstract int poeng();
}
