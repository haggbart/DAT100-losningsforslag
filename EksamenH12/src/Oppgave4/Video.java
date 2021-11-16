package Oppgave4;

public class Video {

    private String tittel;
    private String produsent;
    private int sekunder;

    public Video(String tittel, String produsent, int sekunder) {
        this.tittel = tittel;
        this.produsent = produsent;
        this.sekunder = sekunder;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getProdusent() {
        return produsent;
    }

    public void setProdusent(String produsent) {
        this.produsent = produsent;
    }

    public int getSekunder() {
        return sekunder;
    }

    public void setSekunder(int sekunder) {
        this.sekunder = sekunder;
    }


    @Override
    public String toString() {
        int minutter = this.sekunder / 60;
        int sekunder = this.sekunder % 60;
        return String.format("Tittel: %s, Produsent: %s, Tid: %d.%2d",
                tittel, produsent, minutter, sekunder);
    }
}
