package Oppgave1;

public class B {
    public static void main(String[] args) {
        oppgave1b(7);
    }

    public static void oppgave1b(int n) {
        int s;
        for (int r = 0; r < n; r++) {
            s = n - r;
            do {
                System.out.print("# ");
                s--;
            } while (s > 0);
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