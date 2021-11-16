package Oppgave4;

import java.time.LocalDateTime;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {
        final String hovedmeny = "1. Melde på en løper" +
                "\n2. Oppdatere tiden for løper" +
                "\n3. Skrive ut statistikk" +
                "\n0. Avslutt";

        Lop lop = new Lop(100);

        Scanner input = new Scanner(System.in);
        Loper loper = null;
        int valg;
        String navn;
        int fodt;
        boolean kvinne;
        int brikkeNr;
        int tid;
        do {
            System.out.println(hovedmeny);
            valg = input.nextInt();
            input.nextLine();

            switch (valg) {
                case 1:
                    System.out.print("Navn: ");
                    navn = input.nextLine();
                    System.out.print("Født: ");
                    fodt = input.nextInt();
                    input.nextLine();
                    System.out.print("Kvinne? ");
                    kvinne = (input.nextLine().substring(0, 1).toLowerCase().equals("j"));
                    System.out.print("BrikkeNr: ");
                    brikkeNr = input.nextInt();
                    input.nextLine();
                    loper = new Loper(navn, fodt, kvinne, brikkeNr);
                    lop.leggTil(loper);
                    System.out.println("Løper " + loper.getNavn() + " lagt til. Klasse: " + loper.klasse(LocalDateTime.now().getYear()));
                    break;
                case 2:

                    System.out.print("BrikkeNr: ");
                    brikkeNr = input.nextInt();
                    input.nextLine();
                    loper = lop.finn(brikkeNr);
                    if (loper == null) {
                        System.out.println("Feilmelding, fant ikke løper med brikkenr " + brikkeNr);
                        break;
                    }
                    System.out.print("Tid: ");
                    tid = input.nextInt();
                    input.nextLine();
                    loper.setTid(tid);
                    System.out.println("Tid for " + loper.getNavn() + " er oppdatert.");
                    break;
                case 3:
                    lop.status();
            }
            System.out.println();

        } while (valg != 0);

    }
}
