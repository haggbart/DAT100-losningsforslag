package Oppgave1;

public class B {

    public static void main(String[] args) {
        mb();
    }

    public static void mb() {
        int[] tab = { 4, 1, -1, -7 };
        int t1 = -2;
        int t2 = 2;
        for (int i = 0; i < tab.length; i++) {
            int v = tab[i];
            if (v >= t1 && v <= t2) { // mellom -2 og 2
                /*
                1: 1
                2: -1
                 */
                System.out.println(v);
            }
        }
    }
}
