package Oppgave1;

public  class AnnenKlasse {
    private int tall;

    public AnnenKlasse() {
        tall = 1;
    }

    public AnnenKlasse(int b) {
        tall = b * b;
    }

    public int regnUt() {
        return tall * tall;
    }

    public int regnUt(int x) {
        return tall * tall * tall;
    }
}