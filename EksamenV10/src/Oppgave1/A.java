package Oppgave1;

public class A {
    public static void main(String[] args) {
        einA(7);
    }

    public static void einA(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n; j = j + 2) {
                if (i+j <= n) {
                    System.out.print('#');
                }
            }
            System.out.println();
        }
    }
}
