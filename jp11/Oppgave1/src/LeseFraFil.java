import java.io.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class LeseFraFil {

    private static String MAPPE_STR = System.getProperty("user.dir") + "/Oppgave1/src/" +
            LeseFraFil.class.getPackage().getName().replace(".", "/") + "/";

    static public void main(String[] args) {


        String filnavn = null;

//        filnavn = "LeseFraFil.java";
        int maxForsok = 3;
        int forsok = 1;

        //Scanner reader = null;
        BufferedReader reader = null;

        while (forsok <= maxForsok && reader == null) {
            try {
                filnavn = showInputDialog("Filnavn i mappen " + MAPPE_STR);
                if (filnavn == null) System.exit(0);

                File file = new File(MAPPE_STR + filnavn);

                //reader = new Scanner(file);
                reader = new BufferedReader(new FileReader(file));

                int linenumber = 1;

                // les innhold i filen linje for linje
                String line;

                while ((line = reader.readLine()) != null) {
                    System.out.println(linenumber + " " + line);
                    linenumber++;
                }

                reader.close();

            } catch (FileNotFoundException e) {
             showMessageDialog(null, "Filen " + filnavn + " finnes ikke.\n"
                     + e.getMessage());
//                System.out.println("Filen " + filnavn + " finnes ikke. \n" + e.getMessage());
                forsok++;
            } catch (IOException e) {
                showMessageDialog(null, "Kan ikke lese fra filen.\n"
                        + e.getMessage());
            }
        }
    }
}