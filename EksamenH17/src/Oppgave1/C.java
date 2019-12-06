package Oppgave1;

public class C {

    public static void main(String[] args) {
        mc();
    }

    public static void mc() {
        int[] tab = { 1, 2, 3 };
        int i = 0;
        while (i < tab.length) {
            mc1(tab[i]);
            /*
            +
            ++
            +++
             */
            i++;
        }
    }

    public static void mc1(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("+");
        }
        System.out.println();
    }
}
