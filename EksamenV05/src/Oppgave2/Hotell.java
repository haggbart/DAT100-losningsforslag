package Oppgave2;

public class Hotell {
    private String navn;
    private Ansatt[] ansatte = new Ansatt[100];
    private int antallAnsatte = 0;

    public Hotell(String navn) {
        this.navn = navn;
    }

    public void nyAnsatt() {
        ansatte[antallAnsatte] = new Ansatt();
        antallAnsatte++;
    }

    public void registerSjekk(int ukenr) {
        for (Ansatt ansatt : ansatte) {
            if (!ansatt.registrertData(ukenr)) {
                System.out.println(ansatt.getAnsattNr() + " " + ansatt.getNavn());
            }
        }
    }
}