package Oppgave1;


public class A {

    public static void main(String[] args) {
        oppgave1a(16, '*');
    }

    public static void oppgave1a(int m, char t) {
        for (int i = 0; i < m; i = i + 3) {
            for (int j = 0; j < i / 2; j++) {
                System.out.print(t + " ");
            }
            System.out.println();
        }
        /*
        *
        * * *
        * * * *
        * * * * * *
        * * * * * * *
         */
    }
}