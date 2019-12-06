package Oppgave1;

public class B {

    public static int b(int x, int y) { // 28, 12
        /* print
        1: x = 28, y = 12
        2: x = 16, y = 12
        3: x = 4, y = 12
        4: x = 4, y = 8
         */
        while (x != y) {
            System.out.println("x = " + x + ", y = " + y);
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(b(28, 12)); // 4
    }
}
