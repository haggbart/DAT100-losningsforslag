package Oppgave4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Opprett nytt Bilde(1) eller Tekst(2): ");
        int type = input.nextInt();
        input.nextLine();

        System.out.print("Bruker: ");
        String bruker = input.nextLine();
        System.out.print("Dato: ");
        String dato = input.nextLine();

        Innlegg innlegg;

        switch (type) {
            case 1:
                System.out.print("Url: ");
                String url = input.nextLine();
                innlegg = new Bilde(bruker, dato, url);
                break;
            case 2:
                System.out.println("Tekst: ");
                String tekst = input.nextLine();
                innlegg = new Tekst(bruker, dato, tekst);
                break;
            default:
                System.out.println("Ugyldig type");
                return;
        }

        innlegg.skrivUt();
    }
}
