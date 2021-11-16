package Oppgave1;

public class B {

    public static void main(String[] args) {
        b();
        b2();
    }

    public static void b() {
        int sum = 0;
        int teller = 1;
        while (teller <= 30) {
            sum = sum + teller;
            teller = teller + 2;
        }
        System.out.println(sum); // 225
    }

    public static void b2() {
        int sum = 0;
        for (int teller = 1; teller <= 30; teller+=2) {
            sum += teller;
        }
        System.out.println(sum); // 225
    }
}
