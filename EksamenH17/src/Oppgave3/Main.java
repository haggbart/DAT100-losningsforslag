package Oppgave3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        les("guffaw.txt");
        System.out.println(lesCatch("guffaw.txt"));
        System.out.println(lesCatch("guff.txt"));
        System.out.println();

        lesForsok(3);
    }

    public static void les(String filnavn) throws FileNotFoundException {
        File fil = new File(filnavn);
        Scanner leser = new Scanner(fil);
        // Her skal du skrive noe kode i deloppgave a) og b)

        StringBuilder sb = new StringBuilder();
        while (leser.hasNext()) {

            String line = leser.nextLine();
            if (line.contains("//")) continue;
            sb.append(line).append("\n");
        }
        System.out.println(sb);

        leser.close();
    }

    public static boolean lesCatch(String filnavn) {
        try {
            les(filnavn);
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    public static void lesForsok(int forsok) {
        boolean success = false;
        do {
            success = lesCatch(showInputDialog("Angi filnavn"));
            if (!success) {
                showMessageDialog(null, "Feil");
                forsok--;
            }

        } while (!success && forsok > 0);
    }
}
