package Oppgave2;


/*
I denne oppgaven skal vi skrive JAVA kode for klasser til et blogg-system på nettet. Dersom
parametertypen eller returtypen ikke er gitt, må du bestemme typene selv.
a) Definer en klasse Innlegg med objektvariabler bruker (streng), dato (streng), og antall
likes (heltall). Dei tre objektvariablene skal ikke være synlige utenfor klassen og klassen
skal ha en konstruktør Innlegg(String bruker, String dato) som setter bruker
og dato for de to objektvariablene og setter antall likes til 0.
 */

public class Innlegg {
    private String bruker;
    private String dato;
    private int likes;

    public Innlegg(String bruker, String dato) {
        this.bruker = bruker;
        this.dato = dato;
        this.likes = 0;
    }


    public String getDato() {
        return dato;
    }

    /*
    b) Definer en metode skrivUt() som skriver ut verdier for de tre objektvariablene bruker,
dato og antall likes på skjermen.
     */

    public void skrivUt() {
        System.out.println(
                "bruker = " + bruker + "\n" +
                "dato = " + dato + "\n" +
                "likes = " + likes);
    }

}
