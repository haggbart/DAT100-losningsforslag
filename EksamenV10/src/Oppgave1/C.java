package Oppgave1;

public class C {
    public static void main(String[] args) {
        einC(5);
    }

    public static void einC(int n) {
        for (int r = 0; r < n; r++) {
            for (int k = 0; k < n; k++) {
                if (k == r) {
                    System.out.print('+');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
}
