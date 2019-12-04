import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Oppgave 4
        // a) b)

        var array = new int[1_000_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = getRandom(0, 100);
        }

        var startTime = System.currentTimeMillis();

        Arrays.sort(array);

        var stopTime = System.currentTimeMillis();

        var elapsedTime = stopTime - startTime;
        System.out.println("Tid det tok å utføre Arrays.sort: " + elapsedTime + " ms");
    }



    /**
     * @param min inclusive
     * @param max exclusive
     */
    private static int getRandom(int min, int max) {
        return (int)(Math.random() * (max-min)) + min;
    }
}