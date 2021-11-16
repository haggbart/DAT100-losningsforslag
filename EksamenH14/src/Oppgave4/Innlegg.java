package Oppgave4;

public class Innlegg {
    private String bruker;
    private String dato;
    private int likes;

    public Innlegg(String bruker, String dato) {
        this.bruker = bruker;
        this.dato = dato;
        likes = 0;
    }

    public String getBruker() {
        return bruker;
    }

    public void setBruker(String bruker) {
        this.bruker = bruker;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void skrivUt() {
        System.out.println("Bruker: " + bruker +
                "\nDato: " + dato +
                "\nLikes: " + likes);
    }

    public void atLike() {
        likes++;
    }
}
