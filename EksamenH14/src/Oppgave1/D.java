package Oppgave1;

public class D {
    public static void main(String[] args) {
        System.out.println(f(4.0, 7)); // 4 + 7 = 11.0
    }

    public static double f(int a, double b) {
        return a - b;
    }

    public static double f(double a, int b) { // <---
        return a + b;
    }
}
