package Oppgave2;


/*
c) Definer to subklasser for klassen Innlegg med navn Bilde og Tekst. Bilde skal ha en
objektvariabel url (String) som gir en URL til der vi finner bildet. Tekst skal ha en
objektvariabel tekst som er teksten i et blogg-innlegg.
 */

/*
d) Implementer konstruktørar i de to klassene Bilde og Tekst som initialiserer alle
objektvariablene (også de som er arvet fra superklassen) ut fra verdier som er gitt som
argumenter til konstruktøren.
 */
public class Bilde extends Innlegg {
    private String url;

    public Bilde(String bruker, String dato, String url) {
        super(bruker, dato);
        this.url = url;
    }

    /*
    e) Implementer en metode skrivUt() i hver av subklassene Bilde og Tekst som skriver
verdien av alle objektvariablene ut på skjermen (inkludert objekvariablene som er arvet fra
superklassen).
     */

    @Override
    public void skrivUt() {
        super.skrivUt();
        System.out.println("url = " + url);
    }

}
