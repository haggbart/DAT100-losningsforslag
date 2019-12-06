package Oppgave2;

import java.util.Scanner;

/*
Skriv en main-metode som tillater brukeren å opprette et blogg-innlegg (bilde eller tekst) dvs.
oppretter et Bilde eller et Tekst-objekt ut fra input fra brukeren
og som bruker skrivUtmetoden til slutt for å skrive informasjonen ut på skjermen.
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Brukernavn: ");
        String bruker = input.nextLine();
        System.out.print("Dato: ");
        String dato = input.nextLine();

        Innlegg innlegg;

        System.out.print("Velg Bilde (1) eller Tekst(2): ");
        int valg = input.nextInt();
        input.nextLine();

        switch (valg) {
            case 1:
                System.out.print("Url: ");
                String url = input.nextLine();
                innlegg = new Bilde(bruker, dato, url);
                break;
            case 2:
                System.out.print("Tekst: ");
                String tekst = input.nextLine();
                innlegg = new Tekst(bruker, dato, tekst);
                break;
            default:
                System.out.println("Feil fra input");
                return;
        }

        innlegg.skrivUt();
    }
}
