package Oppgave3;

public class B {

    public static void main(String[] args) {
        int[] array1 = {1,4,5,1,4,8,9};
        int[] array2 = {2,6,9,3,11,89};
        System.out.println(alleUlike(array1));
        System.out.println(alleUlike(array2));

    }

    public static boolean alleUlike(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (i == j) continue;
                if (tab[i] == tab[j]) return false;
            }
        }
        return true;
    }
}