package Oppgave2.B;

public class D extends C {

    public D(int m, int n) {
        super(m, n);
    }

    @Override
    public int m1() {
        return getM() - getN();
    }

    public int m2() {
        return super.m1() * m1();
    }
}
