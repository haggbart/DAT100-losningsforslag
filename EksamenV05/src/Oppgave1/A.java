package Oppgave1;

public class A {
    public static void main(String[] args) {
        a();
    }

    public static void a() {
        int sum = 0;
        int teller = 0;
        while (teller < 5) {
            sum = sum + teller;
            teller++;
        }
        System.out.println(sum); // 10
    }
}
