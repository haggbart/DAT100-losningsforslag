package Oppgave4;

public class Main {
    public static void main(String[] args) {
        Video video1 = new Video("Brødskiver", "Roger", 340);
        System.out.println(video1);

        Videoarkiv arkiv = new Videoarkiv(100);
        arkiv.leggTil(video1);
        arkiv.leggTil(new Video("Lysestaken", "Roger", 234));
        arkiv.leggTil(new Video("Brunosten", "Roger", 501));
        arkiv.leggTil(new Video("Kaffebrenneriet", "Preben", 3000));

        arkiv.listAlle("Roger");
        System.out.println();

        arkiv.bestePar(1000);

        System.out.println();
        arkiv.slett("Brunosten");
        arkiv.listAlle("Roger");

    }
}
