package Oppgave3;

public class Rom {
    private char bygg;
    private int nummer;

    public Rom(char bygg, int nummer) {
        this.bygg = bygg;
        this.nummer = nummer;
    }

    public char getBygg() {
        return bygg;
    }

    public void setBygg(char bygg) {
        this.bygg = bygg;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return "[ " + bygg + " " + nummer + " ]";
    }


}
