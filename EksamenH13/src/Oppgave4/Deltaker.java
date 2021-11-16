package Oppgave4;

public class Deltaker {
    private String navn;
    private Tur[] turer;
    private int antall;

    public Deltaker(String navn) {
        this.navn = navn;
        turer = new Tur[100];
    }

    public void leggTil(Tur tur) {
        if (antall == turer.length) {
            System.out.println("Feilmelding: Ikke plass til flere turer");
            return;
        }
        turer[antall] = tur;
        antall++;
    }

    public int antallGanger(int kode) {

        int antall = 0;
        for (Tur tur : turer) {
            if (tur.getKode() == kode) antall++;
        }
        return antall;
    }

    public boolean besoktAlle(int[] koder) {
        boolean besokt;
        for (int kode : koder) {
            besokt = false;
            for (Tur tur : turer) {
                if (tur.getKode() == kode) {
                    besokt = true;
                    break;
                }
            }
            if (!besokt) return false;
        }
        return true;
    }

    public boolean harBesokt(int kode, Dato fraDato, Dato tilDato) {
        Dato dato;
        for (Tur tur : turer) {
            dato = tur.getDato();
            if (!(dato.paaEllerEtter(fraDato) && dato.paaEllerFoer(tilDato))) continue;
            if (tur.getKode() == kode) return true;
        }
        return false;
    }
}
