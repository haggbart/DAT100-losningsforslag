package Oppgave1;

public class D {

    public static void main(String[] args) {

        md();
    }

    public static int d(int a, int b) { // 3, 5 // 5, 3
        a = 2 * a; // a = 6 // a = 10
        b = b / 2; // b = 2 // b = 1
        System.out.println(" I metode d: a = " + a + ", b = " + b);
        return a * b;
    }

    public static void md() {
        int a = 3;
        int b = 5;
        int c = d(a, b); // c = 12
        // " I metode d: a = 6, b = 2"
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        // a = 3, b = 5, c = 12
        c = d(b, a); // c = 10
        // " I metode d: a = 10, b = 1"
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        // a = 3, b = 5, c = 10
    }
}
