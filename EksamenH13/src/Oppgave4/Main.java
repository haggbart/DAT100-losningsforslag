package Oppgave4;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Scanner;

public class Main {


    private static final String hovedmenu = "Meny\n" +
            "1: Registrer deltaker\n" +
            "2: Registrere tur for deltaker\n" +
            "9: Avslutt\n" +
            "Valg? ";

    public static void main(String[] args) {
        Dato d1 = new Dato(6, 5, 19);
        Dato d2 = new Dato(5, 5, 19);

        System.out.println(d1.paaEllerFoer(d2));

        HashMap<String, Deltaker> deltakere = new HashMap<>();
        Scanner input = new Scanner(System.in);

        int valg;
        String navn;
        int kode;
        LocalDateTime now;
        Deltaker deltaker;
        Tur tur;
        boolean avslutt = false;
        do {
            System.out.print(hovedmenu);
            valg = input.nextInt();
            input.nextLine();

            switch (valg) {
                case 1:
                    System.out.print("Navn: ");
                    navn = input.nextLine();
                    deltakere.put(navn, new Deltaker(navn));
                    System.out.println("Deltaker " + navn + " lagt til.");
                    break;
                case 2:
                    System.out.println("Navn: ");
                    navn = input.nextLine();
                    if (!deltakere.containsKey(navn)) {
                        deltaker = new Deltaker(navn);
                    }
                    else {
                        deltaker = deltakere.get(navn);
                    }
                    System.out.print("Kode: ");
                    kode = input.nextInt();
                    input.nextLine();
                    now = LocalDateTime.now();
                    tur = new Tur(new Dato(now.getDayOfMonth(), now.getMonthValue(), now.getYear()), kode);
                    deltaker.leggTil(tur);
                    System.out.println("Lagt til tur.");
                    break;

                case 9:
                    avslutt = true;
                    break;
                default:
                    System.out.println("Ugyldig valg");

            }
        } while (!avslutt);

    }
}
