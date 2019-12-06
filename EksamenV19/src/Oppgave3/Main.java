package Oppgave3;

public class Main {
    public static void main(String[] args) {

        Video video1 = new Video("Den mørke siden", "Roger", 7810);

        System.out.println(video1.toString());

        /*
        Lag en main-metode du bruker klassene Video og Videoarkiv. Du skal opprette et arkiv med
plass til 100 videoer. Legg til 3 videoer. List alle videoer produsert av "Ole Olsen". Skriv ut beste
par som passer innenfor en tidsgrense på 10 minutter (fra punkt h) nedenfor) . Slett videoen med
tittel "Løkker i Java".
         */

        Videoarkiv arkiv1 = new Videoarkiv(100);
        arkiv1.leggTil(video1);
        arkiv1.leggTil(new Video("Den lyse siden", "Finleif", 3600));
        arkiv1.leggTil(new Video("Rogers lefse", "Roger", 3000));
        arkiv1.leggTil(new Video("Brødskiven", "Roger", 2000));
        arkiv1.leggTil(new Video("Stearinlyset", "Finleif", 502));

        arkiv1.leggTil(new Video("Stearinlyset2", "Ole Olsen", 424));
        arkiv1.leggTil(new Video("Løkker i Java", "Ole Olsen", 23));
        arkiv1.leggTil(new Video("Stearinlyset3", "Ole Olsen", 1000));


        System.out.println("Totaltid: " + arkiv1.finnTotalTid());

        System.out.println();

        arkiv1.listAlle("Roger");
        System.out.println();


        System.out.println();



        arkiv1.listAlle("Roger");
        System.out.println();

        arkiv1.listAlle("Finleif");

        arkiv1.slett("Løkker i Java");

        arkiv1.bestePar(5000);


    }
}
