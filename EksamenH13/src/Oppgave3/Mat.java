package Oppgave3;

public class Mat extends Servenhet {
    private int gram;

    public Mat(String navn, int pris, int gram) {
        super(navn, pris);
        this.gram = gram;
    }

    public int getGram() {
        return gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    @Override
    public String toString() {
        return getNavn() + ", " + gram + " gram, " + getPris() + " kr.";
    }
}
