package Oppgave1;

public class B {

    public static void main(String[] args) {
        System.out.println(b(28, 12)); // 4
    }

    public static int b(int x, int y) {

        while (x != y) {
            System.out.println("x = " + x + ", y = " + y);
            /*
            x = 28, y = 12
            x = 16, y = 12
            x = 4, y = 12
            x = 4, y = 8
             */
            if (x > y) {
                x = x -y;
            } else {
                y = y - x;
            }
        }
        return x;
    }
}
