package Oppgave1;

public class B {
    public static void main(String[] args) {
        int tall = 16;

        if (tall > 0 || tall < 10) {
            System.out.println("Eple"); // Eple
        }
        if (tall > 0 && tall < 10) {
            System.out.println("Banan");
        }
        System.out.println(mystisk(tall)); // 8
    }

    private static int mystisk(int x) {
        int tall = 3;
        if (x > 10) {
            tall = tall + 5;
        }
        return tall;
    }
}
