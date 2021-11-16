package Oppgave3;


public class C {

    public static void main(String[] args) {
        int[][] numbers = {
                {2,7,1},
                {9,5,3},
                {5,1,10}
        };
        System.out.println(antallMellomGrenser(numbers, 3,8));
    }

    public static int antallMellomGrenser(int[][] numbers, int nedre, int ovre) {
        int antall = 0;
        for (int[] rad : numbers) {
            for (int tall : rad) {
                if (tall >= nedre && tall <= ovre) antall++;
            }
        }
        return antall;
    }
}