package Oppgave3;

import java.util.Arrays;

public class D {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,2,3,0},
                {4,5,6,0},
                {0,0,0,0}
        };

        sumRekkerOgKolonner(matrix1);
        for (int[] rekke : matrix1) {
            System.out.println(Arrays.toString(rekke));
        }
    }

    public static void sumRekkerOgKolonner(int[][] tab) {

        for (int r = 0; r < tab.length-1; r++) {
            for (int k = 0; k < tab[r].length - 1; k++) {
                tab[r][tab[r].length-1] += tab[r][k];
                tab[tab.length-1][k] += tab[r][k];
            }
            tab[tab.length-1][tab[r].length-1] += tab[r][tab[r].length-1];
        }
    }
}