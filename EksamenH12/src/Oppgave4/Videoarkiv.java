package Oppgave4;

public class Videoarkiv {

    private Video[] videoer;
    private int antall;

    public Videoarkiv(int maksAntall) {
        videoer = new Video[maksAntall];
    }

    public void leggTil(Video video) {
        if (videoer.length > antall) {
            videoer[antall] = video;
            antall++;
            return;
        }
        System.out.println("Feilmelding: Ikke plass til flere videoer.");
    }

    public int finnTotalTid() {
        int totalTid = 0;
        for (int i = 0; i < antall; i++) {
            totalTid += videoer[i].getSekunder();
        }
        return totalTid;
    }

    public void listAlle(String produsent) {
        StringBuilder sb = new StringBuilder("Videoer av " + produsent);
        sb.append("\n-----------------\n");

        int antall = 0;
        for (int i = 0; i < this.antall; i++) {
            if (!videoer[i].getProdusent().equals(produsent)) continue;
            sb.append(videoer[i].getTittel()).append("\n");
            antall++;
        }
        sb.append("Totalt: ").append(antall);
        System.out.println(sb);
    }

    public void slett(String tittel) {
        for (int i = 0; i < antall; i++) {
            if (!videoer[i].getTittel().equals(tittel)) continue;
            videoer[i] = videoer[antall-1];
            videoer[antall-1] = null; // ikke nødvendig fordi den vil bli overskrevet når flere legges til
            antall--;
            return;
        }
        System.out.println("Feilmelding: Fant ikke " + tittel);
    }

    public void bestePar(int tidsgrense) {
        int delta = Integer.MAX_VALUE;
        int sum;
        Video video1 = null;
        Video video2 = null;

        for (int i = 0; i < antall; i++) {
            for (int j = 0; j < antall; j++) {
                if (i == j) continue;
                sum = videoer[i].getSekunder() + videoer[j].getSekunder();
                if (sum <= tidsgrense && tidsgrense-sum < delta) {
                    delta = tidsgrense - sum;
                    video1 = videoer[i];
                    video2 = videoer[j];
                }
            }
        }
        if (video1 != null) {
            System.out.println(String.format("%s og %s passer best", video1.getTittel(), video2.getTittel()));
        }
        else {
            System.out.println("Ingen par passer tidsgrensen.");
        }
    }
}
