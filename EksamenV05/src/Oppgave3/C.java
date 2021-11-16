package Oppgave3;

import java.util.Arrays;

public class C {

    public static void main(String[] args) {

        int[] array1 = {1,4,5,1,4,8,9,42};
        int[] array2 = {2,6,9,3,11,89,23,2};
        int[] array3 = finnStørste(array1, array2);
        System.out.println(Arrays.toString(array3));
    }

    public static int[] finnStørste(int[] tab1, int[] tab2) {
        int[] out = new int[tab1.length];

        for (int i = 0; i < tab1.length; i++) {
            out[i] = tab1[i] > tab2[i] ? tab1[i] : tab2[i];
        }
        return out;
    }
}
