package Oppgave3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        les("guffaw.txt");
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
}
