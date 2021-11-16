package Oppgave4;

import java.time.LocalDateTime;

public class Loper {
    private String navn;
    private int fodt;
    private boolean kvinne;
    private int brikkeNr;
    private int tid;


    public Loper(String navn, int fodt, boolean kvinne, int brikkeNr) {
        this.navn = navn;
        this.fodt = fodt;
        this.kvinne = kvinne;
        this.brikkeNr = brikkeNr;
        tid = -1;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getFodt() {
        return fodt;
    }

    public void setFodt(int fodt) {
        this.fodt = fodt;
    }

    public boolean isKvinne() {
        return kvinne;
    }

    public void setKvinne(boolean kvinne) {
        this.kvinne = kvinne;
    }

    public int getBrikkeNr() {
        return brikkeNr;
    }

    public void setBrikkeNr(int brikkeNr) {
        this.brikkeNr = brikkeNr;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public boolean erIMal() {
        return tid != -1;
    }

    public String tidSomStreng() {
        return String.format("%02d.%02d", (tid / 60), (tid % 60));
    }

    public String klasse(int aar) {

        char kjonn;
        if (kvinne) kjonn = 'D';
        else kjonn = 'H';
        int alder = aar - fodt;
        int grense;

        if (alder >= 70) {
            grense = 70;
        } else if (alder >= 60) {
            grense = 60;
        } else if (alder >= 50) {
            grense = 50;
        } else if (alder >= 40) {
            grense = 40;
        } else if (alder >= 30) {
            grense = 30;
        } else if (alder >= 16) {
            grense = 16;
        } else {
            grense = -1;
        }

        return "" + kjonn + grense;
    }
}
