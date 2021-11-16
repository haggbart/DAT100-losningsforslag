package Oppgave3;

public class B {

    public static void main(String[] args) {
        int[][] a1 = {
                {-1,0,0},
                {5,-2,7},
                {-7,0,-4}
        };
        statistikk(a1);
    }

    public static void statistikk(int[][] array) {
        int mindre = 0;
        int lik = 0;
        int storre = 0;

        for (int[] rad : array) {
            for (int tall : rad) {
                if (tall < 0) mindre++;
                else if (tall == 0) lik++;
                else storre++;
            }
        }
        System.out.println("Antall < 0: " + mindre +
                "\nAntall = 0: " + lik +
                "\nAntall > 0: " + storre);
    }
}
