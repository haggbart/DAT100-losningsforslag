package Oppgave1;

public class B {
    public static void main(String[] args) {
        System.out.println(einB(7));
        System.out.println(einBWhile(7));
        System.out.println(einBDoWhile(7));
    }

    public static int einB(int n) {
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum = sum + i;

        }
        return sum;
    }

    public static int einBWhile(int n) {
        int sum = 0;
        int i = 0;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        return sum;
    }

    public static int einBDoWhile(int n) {
        int sum = 0;
        int i = 0;
        do {
            sum = sum + i;
            i++;
        } while(i <= n);
        return sum;
    }
}
