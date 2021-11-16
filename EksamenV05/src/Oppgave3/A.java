package Oppgave3;

public class A {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,2,4},
                {2,2,42},
                {19,29,4}
        };

        System.out.println(finnesITabell(matrix1, 42));
        System.out.println(finnesITabell(matrix1, 3));

    }

    public static boolean finnesITabell(int[][] tab, int x) {
        for (int[] rad : tab) {
            for (int verdi : rad) {
                if (verdi == x) return true;
            }
        }
        return false;
    }
}