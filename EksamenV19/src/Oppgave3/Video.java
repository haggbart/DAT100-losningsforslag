package Oppgave3;

/*
a) Lag klassen Video. Klassen skal inneholde:
 Objektvariabler som skal være private.
o tittel – Tittel på videoen (tekststreng).
o produsent – Navn på den som har produsert videoen.
o sekund – Lengden på videoen i hele sekunder.
 Konstruktør med parametere der vi kan gi verdi til alle objektvariablene.
 get- og set-metoder for alle objektvariablene.
 toString() metode som returnerer en streng på formen
"Tittel: Løkker i Java, Produsent: Ole Olsen, Tid: 5.02".
Legg merke til at tiden skal være i minutter og sekunder og at sekundene skal vises med to
siffer.
 */

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

    /*
    "Tittel: Løkker i Java, Produsent: Ole Olsen, Tid: 5.02".
Legg merke til at tiden skal være i minutter og sekunder og at sekundene skal vises med to
siffer.
     */

    @Override
    public String toString() {
        int minutter = this.sekunder / 60;
        int sekunder = this.sekunder % 60;
        return String.format("Tittel: %s, Produsent: %s, Tid: %d.%02d", tittel, produsent, minutter, sekunder);
    }
}
