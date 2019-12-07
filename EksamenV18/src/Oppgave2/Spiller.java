package Oppgave2;

public class Spiller {
    private String dato;
    private String navn;
    private int antallFerdige;
    private int[] resultater;

    public Spiller(String dato, String navn, int antall) {
        this.dato = dato;
        this.navn = navn;
        resultater = new int[antall];
        antallFerdige = 0;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAntallFerdige() {
        return antallFerdige;
    }

    public void leggTil(int resultat) {
        if (erFerdig()) return;
        resultater[antallFerdige] = resultat;
        antallFerdige++;
    }

    public int sumSlag() {
        int sum = 0;
        for (int i = 0; i < antallFerdige; i++) {
            sum += resultater[i];
        }
        return sum;
    }

    public int antallOverPar(int[] par) {
        int antall = 0;
        for (int i = 0; i < antallFerdige; i++) {
            if (resultater[i] > par[i]) antall++;
        }
        return antall;
    }

    public void visScore(int[] par) {
        System.out.print(toString());
        String navn;
        for (int i = 0; i < antallFerdige; i++) {
            navn = navn(par[i], resultater[i]);
            System.out.println("Hull " + (i+1) + ": " + resultater[i] +
                    " (" + par[i] + ")  - " + navn);
        }
    }

    private String navn(int par, int resultat) {
        if (resultat == 1) return "hole in one";
        else {
            int delta = resultat - par;
            if (delta <= -4) delta = -4;
            switch (delta) {
                case 0:
                    return "par";
                case -1:
                    return "birdie";
                case -2:
                    return "eagle";
                case -3:
                    return "albatross";
                case -4:
                    return "kondor";
                default:
                    return "";
            }
        }
    }

    public boolean erFerdig() { // antar ikke hull slik oppgaven er definert
        return antallFerdige == resultater.length;
    }

    @Override
    public String toString() {
        return navn + ", " + dato + ", " + "Sum slag: " + sumSlag() +
                " etter " + antallFerdige + " av " + resultater.length + " hull\n";
    }

}
