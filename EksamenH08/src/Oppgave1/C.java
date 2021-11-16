package Oppgave1;

public class C {

    public static void main(String[] args) {
        oppgave1b(7);
    }

    public static void oppgave1b(int n) {
        for (int r = 0; r < n; r++) {
            for (int s = n - r; s > 0; s--) {
                System.out.print("# ");
            }
            System.out.println();
        }
        /*
        # # # # # # #
        # # # # # #
        # # # # #
        # # # #
        # # #
        # #
        #
         */
    }
}