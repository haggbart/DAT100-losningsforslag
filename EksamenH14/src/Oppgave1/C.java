package Oppgave1;

public class C {

    public static void main(String[] args) {
        System.out.println(c(32812)); // 5
    }

    public static int c(int x) {
        int i = 0;

        do {
            x = x / 10;
            i++;
            System.out.println("x = " + x);
            /*
            1: x = 3281
            2: x = 328
            3: x = 32
            4: x = 3
            5: x = 0
             */
        } while (x != 0);
        return i;
    }
}
