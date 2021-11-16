package Oppgave2.B;

public class B {

    public static void main(String[] args) {
        D d = new D(8, 6);
        C c = new C(8, 6);
        System.out.println(c.m1()); // 8 + 6 = 14
        System.out.println(d.m1()); // 8 - 6 = 2
        System.out.println(d.m2()); // (8 - 6) * (8 + 6) = 2 * 14 = 28
    }
}
