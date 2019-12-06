package Oppgave1;

public class A {

    public static void main(String[] args) {
        ma();
    }

    public static void ma() {
        int x = 2;
        int y = 4;
        double d = 2.0;
        char c = 'd';
        boolean b = false;
        System.out.println(d); // 2.0
        System.out.println("x : " + x); // x : 2
        System.out.println(x + x * y); // 2 * 4 + 2 = 10
        System.out.println(x == 7 || b); // false
        System.out.println(!(x >= 7) && c == 'e'); // false
        System.out.println(x * y * (-x)); // 2 * 4 * (-2) = -16
        System.out.println(2 / 4); // 0
    }
}
