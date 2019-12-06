package Oppgave5;

public class Main {

    private static int[][] tall = {
            { 1, 2, 3 },
            { 4, -5, 6 },
            { -7, 8, 0 }
    };

    public static void main(String[] args) {
        System.out.println("a)");
        System.out.println(erPositiv(tall, 0, 0));
        System.out.println(erPositiv(tall, 2, 0));
        System.out.println();

        System.out.println("b)");
        System.out.println(erPositivRekke(tall, 0));
        System.out.println(erPositivRekke(tall, 1));
        System.out.println();

        System.out.println("c)");
        System.out.println(antallNuller(tall));
        System.out.println();

        System.out.println("d)");
        System.out.println(erKvadratisk(tall));
        System.out.println();

        System.out.println("e)");
        System.out.println(spor(tall));
        System.out.println();
    }

    public static boolean erPositiv(int[][] mat, int r, int k) { // a

        return mat[r][k] >= 0;
    }

    public static boolean erPositivRekke(int[][] mat, int r) { // b
        for (int k = 0; k < mat[r].length; k++) {
            if (mat[r][k] < 0) return false;
        }
        return true;
    }

    public static int antallNuller(int[][] mat) {
        int antall = 0;
        for (int[] rad : mat) {
            for (int tall : rad) {
                if (tall == 0) antall++;
            }
        }
        return antall;
    }

    public static boolean erKvadratisk(int[][] mat) { // d
        return mat.length == mat[0].length;
    }

    public static int spor(int[][] mat) {
        int sum = 0;
        for (int d = 0; d < mat.length; d++) {
            sum += mat[d][d];
        }
        return sum;
    }
}
