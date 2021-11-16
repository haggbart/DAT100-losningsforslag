package Oppgave4;

public class Tur {
    private Dato dato;
    private int kode;

    public Tur(Dato dato, int kode) {
        this.dato = dato;
        this.kode = kode;
    }

    public Dato getDato() {
        return dato;
    }

    public int getKode() {
        return kode;
    }
}
