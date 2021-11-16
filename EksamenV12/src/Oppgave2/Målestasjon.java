package Oppgave2;

import java.io.IOException;

public class Målestasjon {

    private String id;
    private String navn;
    private double temperatur;

    public Målestasjon(String id) {
        this.id = id;
        temperatur = (Math.random() * (20 - 10)) + 10;
    }

    public double getTemperatur() throws IOException {
        double kontakt = Math.random();
        if (kontakt < 0.05) throw new IOException();
        return temperatur;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
