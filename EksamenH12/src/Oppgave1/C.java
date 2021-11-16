package Oppgave1;

public class C {
    public static void main(String[] args) {
        System.out.println(1); // 1
        try {
            System.out.println(2); // 2
            int x = 1 / 0; // AritmethicException
            System.out.println(3);
        } catch (ArithmeticException e) {
            System.out.println(4); // 4
        }
        System.out.println(5); // 5
    }
}
