package Oppgave1;

public class C {
    public static void main(String[] args) {
        AnnenKlasse a = new AnnenKlasse(); // tall = 1
        AnnenKlasse b = new AnnenKlasse(2); // tall = 2 * 2 = 4

        System.out.println(a.regnUt()); // 1 * 1 = 1
        System.out.println(b.regnUt(3)); // 4 * 4 * 4 = 64 (parameteren brukes ikke)
        System.out.println(b.regnUt(10)); // 4 * 4 * 4 = 64
    }
}


