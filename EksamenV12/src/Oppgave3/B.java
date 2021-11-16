package Oppgave3;

public class B {
    public static void main(String[] args) {
        int[][] matrise1 = {
                { 1,0,2,0 },
                { 3,4,5,0 },
                { 0,7,1,8 },
                { 9,4,0,0 }
        };

        System.out.println(andelNullere(matrise1));
    }

    public static double andelNullere(int[][] array) {
        int antallNull = 0;
        for (int[] rad : array) {
            for (int tall : rad) {
                if (tall == 0) antallNull++;
            }
        }
        return (double)antallNull / (array.length * array[0].length);
    }
}
