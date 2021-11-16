package Oppgave1;

public class E {
    public static void main(String[] args) {
        try {
            int x = 3;
            x = x / 0; // ArithmeticException
            System.out.println(x); // ikke printet
        } catch (NullPointerException ex) {
            System.out.println("Unntakk nr. 1 kastet.");
        } catch (ArithmeticException ex) {
            System.out.println("Unntak nr. 2 kastet."); // denne blir skrevet ut
        }
    }
}
