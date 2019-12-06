package Oppgave1;

public class C {
    public static int c(int x) { // 32812
        int i = 0;

        /* print
        1: x = 3281 i = 1
        2: x = 328 i = 2
        3: x = 32 i = 3
        4: x = 3 i = 4
        5: x = 0 i = 5
         */
        do {
            x = x / 10;
            i++;
            System.out.println("x = " + x);
        } while (x != 0);
        return i;
    }

    public static void main(String[] args) {
        System.out.println(c(32812)); // 5
    }
}
