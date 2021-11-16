package Oppgave1;


import java.util.Arrays;

import static javax.swing.JOptionPane.*;

public class C {

    public static void main(String[] args) {
        int[] tabbe = {1,2,3,4};
        int[] hokus = pokus(tabbe);

        System.out.print(Arrays.toString(hokus));
    }

    public static int[] pokus (int[] tabell) {
        int[] tab = new int[tabell.length ]; // feil i oppgaven, [1, 3, 5, 7]
        for (int i = tabell.length - 1; i >= 0; i--) {
            tab[i] = tabell[i] + i;
        }
        return tab;
    }
}


