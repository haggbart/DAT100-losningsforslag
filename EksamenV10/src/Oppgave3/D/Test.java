package Oppgave3.D;

public class Test {

    private int a;
    private int b;
    private int c;

    public Test(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    public void vis() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    public void f(int a, int x) {
        int b;
        a = 1;
        b = 2;
        c = x;
    }

    public static void main(String[] args) {

        Test t = new Test(10, 20, 30);
        t.vis();
        t.f(7,8);
        System.out.println();
        t.vis();
    }
}
